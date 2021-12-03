 
package DAO;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import modelo.Cliente;
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
        //revisar si se guarda o NO EL CLIENTE
        boolean prueba = false;
        try {
            this.con = new Conexion().obtenerConexion();
            String query = "INSERT into CLIENTE values(?,?,?,?,?,?,?,?)";
            CallableStatement cstmt = con.prepareCall(query);
            cstmt.setInt(1, cli.getID_CLIENTE());
            cstmt.setString(2, cli.getNOMBRE_CLI());
            cstmt.setString(3, cli.getAPATERNO_CLI());
            cstmt.setString(4, cli.getAMATERNO_CLI());
            cstmt.setInt(5, cli.getFONO_CLI());
            cstmt.setString(6, cli.getEMAIL_CLI());
            cstmt.setInt(7, cli.getSALDO_CLI());

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
                cli.setID_CLIENTE(rs.getInt("id_cliente"));
                cli.setNOMBRE_CLI(rs.getString("nombre"));
                cli.setAPATERNO_CLI(rs.getString("apaterno"));
                cli.setAMATERNO_CLI(rs.getString("amaterno"));
                cli.setFONO_CLI(rs.getInt("fono_cli"));
                cli.setEMAIL_CLI(rs.getString("email_cli"));
                cli.setSALDO_CLI(rs.getInt("saldo"));
                Listacli.add(cli);
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return Listacli;
    }
}