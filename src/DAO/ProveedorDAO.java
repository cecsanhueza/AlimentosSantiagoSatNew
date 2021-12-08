
package DAO;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Proveedor;

/**
 *
 * @author cecsanhueza
 */
public class ProveedorDAO {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement  ps;
    
    
    public boolean RegistrarProveedor(Proveedor pr){
        String sql = "INSERT INTO proveedor(id_proveedor, nom_proveedor, rol_local, celular, descripcion)VALUES (?,?,?,?,?)";
        
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pr.getId_proveedor());
            ps.setString(2, pr.getNom_proveedor());
            ps.setString(3, pr.getRol_local());
            ps.setInt(4, pr.getCelular());
            ps.setString(5, pr.getDescripcion());
            
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}
