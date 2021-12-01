 
package DAO;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import Modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ansaldi7
 */
public class ClienteDAO {

    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public ClienteDAO(){
    }
    public boolean guardarCliente(Cliente cli) throws SQLException {
        //revisar si se guarda o no el administrador.
        boolean prueba = false;
        try {
            this.con = new Conexion().obtenerConexion();
            String query = "Insert into CLIENTE values(?,?,?,?,?,?,?,?)";
            CallableStatement cstmt = con.prepareCall(query);
            cstmt.setInt(1, cli.getId_cliente());
            cstmt.setString(2, cli.getNombre_cli());
            cstmt.setString(3, cli.getApaterno_cli());
            cstmt.setString(4, cli.getAmaterno_cli());
            cstmt.setInt(5, cli.getFono_cli());
            cstmt.setString(6, cli.getEmail_cli());
            cstmt.setInt(7, cli.getSaldo_cli());

            int control = cstmt.executeUpdate();
            if (control > 0) {
                //se logra guardar
                prueba = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar." + e.getMessage());
        } 
        return prueba;
    }

public List ListarCliente(){
        List<Cliente> Listacli = new ArrayList();
        String sql = "SELECT * FROM clientes";
        try{
            con = conexion.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()){
                Cliente cli = new Cliente();
                cli.setId_cliente(rs.getInt("id_cliente"));
                cli.setNombre_cli(rs.getString("nombre"));
                cli.setApaterno_cli(rs.getString("apaterno"));
                cli.setAmaterno_cli(rs.getString("amaterno"));
                cli.setFono_cli(rs.getInt("fono_cli"));
                cli.setEmail_cli(rs.getString("email_cli"));
                cli.setSaldo_cli(rs.getInt("saldo"));
                Listacli.add(cli);
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return Listacli;
    }
}