package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


/**
 *
 * @author cecsanhueza
 */
public class Conexion {
    private static Connection conexion;
    private String user = "C##GRUPO";
    private String pass = "1234";
 //   private String server = "@44.196.189.75:51521:xe";
   // private String user = "HR";
    //private String pass = "hr";
    //private String server = "@localhost:1521:orcl";
    
    private String url = "jdbc:oracle:thin:"+user+"/"+pass+"@44.196.189.75:51521:xe";
   // private String url = "jdbc:oracle:thin:"+user+"/"+pass+server;

    
    public static Connection conectar() {

        Connection con = null;
        String url = "jdbc:oracle:thin:@44.196.189.75:51521:xe";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, "C##GRUPO","1234");
            System.out.println("En línea");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return con;
    }
    
    
    public Conexion() {
        try {
            //carga libreria ojdbc
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            this.conexion = DriverManager.getConnection(url, user ,pass);
            System.out.println("En línea");
        } catch (Exception e) {
            System.out.println("Error de conexión: "+e.getMessage());
        }
    }

    public Connection obtenerConexion() {
        return conexion;
    }

    
    
    
    
    
    
    
    
    
}

