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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ansaldi7
 */
//public class PedidosDAO {
//    public void visualizarTablaPedidos(JTable TablaPedidos) {
////        Connection conn = new Conexion();
////        Connection con = conn.conectar();
////        ResultSet rs = conn.mostrarValoracion();
//        
//        Conexion conexion = new Conexion();
//        Connection con;
//        PreparedStatement ps;
//        ResultSet rs=null;
//        
//        DefaultTableModel modelito = new DefaultTableModel();
//        modelito.addColumn("Id Pedido");
//        modelito.addColumn("Cantidad");
//        modelito.addColumn("Precio");
//        modelito.addColumn("Direccion");
//        modelito.addColumn("Tipo Entrega");
//        modelito.addColumn("Celular");
//        modelito.addColumn("Fecha Pedido");
//        modelito.addColumn("Estado");
//        modelito.addColumn("Cliente Id");
//        modelito.addColumn("Plato Id");
//        modelito.addColumn("Tipo Pago");
//        modelito.addColumn("Horario Entrega");
//        modelito.addColumn("Restaurante Id");
//
//        try {
//            while (rs.next()) {
//                Object[] fila = new Object[13];
//                fila[0] = rs.getObject(1);
//                fila[1] = rs.getObject(2);
//                fila[2] = rs.getObject(3);
//                fila[3] = rs.getObject(4);//BOLETA
//                fila[4] = rs.getObject(5);
//                fila[5] = rs.getObject(6);
//                fila[6] = rs.getObject(7);
//                fila[7] = rs.getObject(8);
//                fila[8] = rs.getObject(9);
//                fila[9] = rs.getObject(10);
//                fila[10] = rs.getObject(11);
//                fila[11] = rs.getObject(12);
//                fila[12] = rs.getObject(13);
//
//                modelito.addRow(fila);
//            }
//            TablaPedidos.setModel(modelito);
//            TablaPedidos.setRowHeight(64);
//
//        } catch (Exception ex) {
//            System.out.println("ERROR AL VISUALIZAR EN LA TABLA DE PEDIDOS");
//        }
//    }
//}
