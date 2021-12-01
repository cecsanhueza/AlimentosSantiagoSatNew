
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Administrador;
import conexion.Conexion;
import java.sql.SQLException;
import java.awt.Desktop;

/**

 * @author cecsanhueza
 */
public class LoginDAO {
    Connection conexion;
    PreparedStatement ps;
    ResultSet rs;
    Conexion conex = new Conexion();
    
    public Administrador log(String email_admin, String contraseña1){
        
        Administrador a = new Administrador();
        String sql = "SELECT * FROM ADMINISTRADOR WHERE EMAIL_ADMIN = ? AND CONTRASEÑA1 = ?";
        
        try {
           conexion = conex.obtenerConexion();
           ps = conexion.prepareStatement(sql);
           ps.setString(1, email_admin);
           ps.setString(2, contraseña1);
           ps.executeQuery();
           
            if (rs.next()) {
                a.setRut_adm(rs.getString("RUT_ADM"));
                a.setNombre_adm(rs.getNString("NOMBRE_ADM"));
                a.setApat_adm(rs.getNString("APAT_ADM"));
                a.setAmat_adm(rs.getNString("AMAT_ADM"));
                a.setEmail_admin(rs.getNString("EMAIL_ADMIN"));
                a.setFono_admin(rs.getInt("FONO_ADMIN"));
                a.setContraseña1(rs.getNString("CONTRASEÑA1"));
                a.setContraseña2(rs.getNString("CONTRASEÑA2"));
                a.setRestaurant_id_restaurant(rs.getInt("RESTAURANT_ID_RESTAURANT"));
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return a;
        
    }
}
