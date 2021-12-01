/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ansaldi7
 */
public class DatosConexion extends Conexion{
    
    
    Connection cn = conectar();
    
    public int probarConexion(){
        int conexion=0;
        try{
            PreparedStatement ps =null;
            ResultSet rs= null;
            ps=cn.prepareStatement("SELECT COUNT(*) FROM ADMINISTRADOR");
            rs=ps.executeQuery();
            if(rs.next()){
                conexion=1;
            }
            }catch(Exception ex){
            }       
            return conexion;
            
        }
 
    public int login(String email_admin, String contraseña1){
        
        int ingreso=0;
        try{
            PreparedStatement ps=null;
            ResultSet rs= null;
            ps=cn.prepareStatement("SELECT * FROM ADMINISTRADOR WHERE email_admin=? and contrasena1=? ");
            ps.setString(1,email_admin);
            ps.setString(2,contraseña1);
            rs=ps.executeQuery();
           if(rs.next()){
                ingreso=Integer.parseInt(rs.getString(1));
            }
        }catch (Exception e){
            
        }return ingreso;
    } 
}
    

