//
//package orderFood;
//
//import DAO.AdministradorDAO;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import modelo.Administrador;
//
///**
// *
// * @author cec.sanhueza
// */
//public class Aplicacion {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        AdministradorDAO dao = new AdministradorDAO();
//        Administrador emp = new Administrador("185535215", "asdfdaf", "Khsdfsdan", "Saaasdft", "roy.khan@gmail.com", 979861490, "12345678", "12345678");
//        
//        try {
//            if(dao.guardarAdministrador(emp)){
//                System.out.println("Administrador guardado.");
//            }else{
//                System.out.println("Administrador no guardado");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//}
