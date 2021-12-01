////package DAO;
////
////import java.sql.Connection;
////import modelo.Administrador;
////import conexion.Conexion;
////import java.sql.CallableStatement;
//////import java.sql.SQLException;
////
/////**
//// *
//// * @author cecsanhueza
//// */
////public class AdministradorDAO {
////
////    private Connection conexion;
////
////    public AdministradorDAO() {
////    }
//
////    //guardar
//// //   public boolean guardarAdministrador(Administrador emp) throws SQLException {
////        //revisar si se guarda o no el administrador.
////        boolean prueba = false;
////        try {
////            this.conexion = new Conexion().obtenerConexion();
////            String query = "Insert into ADMINISTRADOR values(?,?,?,?,?,?,?,?)";
////            CallableStatement cstmt = conexion.prepareCall(query);
////            cstmt.setString(1, emp.getRut_adm());
////            cstmt.setString(2, emp.getNombre_adm());
////            cstmt.setString(3, emp.getApat_adm());
////            cstmt.setString(4, emp.getAmat_adm());
////            cstmt.setString(5, emp.getEmail_admin());
////            cstmt.setInt(6, emp.getFono_admin());
////            cstmt.setString(7, emp.getContraseña1());
////            cstmt.setString(8, emp.getContraseña2());
////
////            int control = cstmt.executeUpdate();
////            if (control > 0) {
////                //se logra guardar
////                prueba = true;
////            }
////
////        } catch (Exception e) {
////            System.out.println("Error al guardar." + e.getMessage());
////        } 
////        return prueba;
////    }
////    //eliminar
//
//    //modificar
//    //listar
//    //buscar
//}
