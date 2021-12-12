
package vistas;

import DAO.LoginDAO;
import conexion.Conexion;
import modelo.Administrador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileSystemView;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author cecsanhueza
 */
public final class MenuPedidos extends javax.swing.JFrame {
    Date fechaVenta = new Date();
    String fechaActual = new SimpleDateFormat("dd/MM/yyyy").format(fechaVenta);
    Administrador ad = new Administrador();
    LoginDAO login = new LoginDAO();
    
   
    static Connection cn;
    static Statement s;
    static ResultSet rs;
    
    public MenuPedidos() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarPedidos();

        
   }
    
    public MenuPedidos (Administrador priv){
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    Conexion conec= new Conexion();
    DefaultTableModel modelo = new DefaultTableModel();
    
    void mostrarPedidos(){
        try {
            modelo.addColumn("Id Pedido");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio");
            modelo.addColumn("Direccion");
            modelo.addColumn("Tipo Entrega");
            modelo.addColumn("Celular");
            modelo.addColumn("Fecha Pedido");
            modelo.addColumn("Estado");
            modelo.addColumn("Cliente Id");
            modelo.addColumn("Id Plato");
            modelo.addColumn("Tipo Pago");
            modelo.addColumn("Horario Entrega");
            modelo.addColumn("Restaurante Id");
            
            Connection con = conec.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select ID_PEDIDO, CANTIDAD, PRECIO, DIRECCION, TIPO_ENTREGA, CELULAR, FECHA_PEDIDO,ESTADO,CLIENTE_ID,PLATO_ID_ID,TIPO_PAGO,HORARIO_ENTREGA,RESTAURANT_ID_RESTAURANTE FROM PEDIDO");
            
            String datos[] = new String[13];
            while(rs.next()){
                
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                datos[12] = rs.getString(13);
                modelo.addRow(datos);
            }
            jListarPedidos.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void mostrarEntregados(){
        try {
            modelo.addColumn("Id Pedido");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio");
            modelo.addColumn("Direccion");
            modelo.addColumn("Tipo Entrega");
            modelo.addColumn("Celular");
            modelo.addColumn("Fecha Pedido");
            modelo.addColumn("Estado");
            modelo.addColumn("Cliente Id");
            modelo.addColumn("Id Plato");
            modelo.addColumn("Tipo Pago");
            modelo.addColumn("Horario Entrega");
            modelo.addColumn("Restaurante Id");
            
            Connection con = conec.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select ID_PEDIDO, CANTIDAD, PRECIO, DIRECCION, TIPO_ENTREGA, CELULAR, FECHA_PEDIDO,ESTADO,CLIENTE_ID,PLATO_ID_ID,TIPO_PAGO,HORARIO_ENTREGA,RESTAURANT_ID_RESTAURANTE FROM PEDIDO WHERE ESTADO='Entregado'");
            
            String datos[] = new String[13];
            while(rs.next()){
                
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                datos[12] = rs.getString(13);
                modelo.addRow(datos);
            }
            jListarPedidos.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void contarPedidosTotales(){
        String cliente_id;
        int cantidad;
      //  v.setFecha(fechaActual);
        
            
        try {
            Connection con = conec.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = s.executeQuery("select COUNT(ID_PEDIDO) FROM PEDIDO");
        } catch (SQLException ex) {
            Logger.getLogger(MenuPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify thnullis code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVentas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEntregados = new javax.swing.JButton();
        btnMenuVentas = new javax.swing.JButton();
        btnPruebas = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListarPedidos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPedidosTotales = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPendientes = new javax.swing.JTable();
        btnPendientes = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jConfirmados = new javax.swing.JTable();
        btnConfirmados = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnContarEntregados = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jEntregados = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnVentas.setText("Listar Pedidos");
        btnVentas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desconectar (1).png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEntregados.setText("Pedidos Entregados");
        btnEntregados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntregados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntregados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregadosActionPerformed(evt);
            }
        });

        btnMenuVentas.setBackground(new java.awt.Color(255, 255, 255));
        btnMenuVentas.setText("Ventas");
        btnMenuVentas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenuVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuVentasActionPerformed(evt);
            }
        });

        btnPruebas.setText("Listar Clientes");
        btnPruebas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPruebas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebasActionPerformed(evt);
            }
        });

        btnProveedor.setText("Proveedores");
        btnProveedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        jButton2.setText("Orden");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntregados, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPruebas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(btnMenuVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEntregados, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 780));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jListarPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_PEDIDO", "CANTIDAD", "PRECIO", "DIRECCION", "TIPO ENTREGA", "CELULAR", "FECHA_PEDIDO", "ESTADO", "CLIENTE_ID", "PLATO_ID", "TIPO_PAGO", "HORARIO_ENTREGA", "RESTAURANT_ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jListarPedidos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jListarPedidosComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jListarPedidos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1249, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 1250, 590));

        jButton1.setText("Pedidos Totales");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPedidosTotales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "PEDIDOS TOTALES"
            }
        ));
        jScrollPane2.setViewportView(jPedidosTotales);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 150, 100));

        jPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "PENDIENTE"
            }
        ));
        jScrollPane3.setViewportView(jPendientes);

        btnPendientes.setText("Pedidos Pendientes");
        btnPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 140, 100));

        jConfirmados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "CONFIRMADOS"
            }
        ));
        jScrollPane4.setViewportView(jConfirmados);

        btnConfirmados.setText("Pedidos Confirmados");
        btnConfirmados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmados))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(btnConfirmados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 150, 100));

        btnContarEntregados.setText("Pedidos Entregados");
        btnContarEntregados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarEntregadosActionPerformed(evt);
            }
        });

        jEntregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "ENTREGADOS"
            }
        ));
        jScrollPane5.setViewportView(jEntregados);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnContarEntregados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btnContarEntregados, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 150, 110));

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 20, 90, 40));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder("Menú OrderFood"));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleName("Menú ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed

        mostrarPedidos();
//        try {
//            //Para establecer el modelo al JTable
//            DefaultTableModel modelo = new DefaultTableModel();
//            this.jListarPedidos.setModel(modelo);
//            //Para conectarnos a nuestra base de datos
//            String url = "jdbc:oracle:thin:@44.196.189.75:51521:XE";
//            // Establecemos los valores de cadena de conexión, usuario y contraseña
//            cn = DriverManager.getConnection(url, "C##GRUPO", "1234");
//            //Para ejecutar la consulta
//            s = cn.createStatement();
//            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
//             rs = s.executeQuery("select ID_PEDIDO, CANTIDAD, PRECIO, DIRECCION, TIPO_ENTREGA, CELULAR, FECHA_PEDIDO,ESTADO,CLIENTE_ID,PLATO_ID_ID,TIPO_PAGO,HORARIO_ENTREGA,RESTAURANT_ID_RESTAURANTE FROM PEDIDO");
//            //Obteniendo la informacion de las columnas que estan siendo consultadas
//            ResultSetMetaData rsMd = rs.getMetaData();
//            //La cantidad de columnas que tiene la consulta
//            int cantidadColumnas = rsMd.getColumnCount();
//            //Establecer como cabezeras el nombre de las colimnas
//            for (int i = 1; i <= cantidadColumnas; i++) {
//             modelo.addColumn(rsMd.getColumnLabel(i));
//            }
////            Creando las filas para el JTable
//            while (rs.next()) {
//             Object[] fila = new Object[cantidadColumnas];
//             for (int i = 0; i < cantidadColumnas; i++) {
//               fila[i]=rs.getObject(i+1);
//             }
//             modelo.addRow(fila);
//             modelo.addColumn("Id Pedido");
//             modelo.addColumn("Cantidad");
//             modelo.addColumn("Precio");
//             modelo.addColumn("Direccion");
//             modelo.addColumn("Tipo Entrega");
//             modelo.addColumn("Celular");
//             modelo.addColumn("Fecha Pedido");
//             modelo.addColumn("Estado");
//             modelo.addColumn("Cliente Id");
//             modelo.addColumn("Id Plato");
//             modelo.addColumn("Tipo Pago");
//             modelo.addColumn("Horario Entrega");
//             modelo.addColumn("Restaurante Id");
//            }
//            rs.close();
//            cn.close();
//       } catch (Exception ex) {
//        ex.printStackTrace();
//       }
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEntregadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregadosActionPerformed

        mostrarEntregados();
//        try {
//            //Para establecer el modelo al JTable
//            DefaultTableModel modelo = new DefaultTableModel();
//            this.jListarPedidos.setModel(modelo);
//            //Para conectarnos a nuestra base de datos
//            String url = "jdbc:oracle:thin:@44.196.189.75:51521:XE";
//            // Establecemos los valores de cadena de conexión, usuario y contraseña
//            cn = DriverManager.getConnection(url, "C##GRUPO", "1234");
//            //Para ejecutar la consulta
//            s = cn.createStatement();
//            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
//             rs = s.executeQuery("select ID_PEDIDO, CANTIDAD, PRECIO, DIRECCION, TIPO_ENTREGA, CELULAR, FECHA_PEDIDO,ESTADO,CLIENTE_ID,PLATO_ID_ID,TIPO_PAGO,HORARIO_ENTREGA,RESTAURANT_ID_RESTAURANTE FROM PEDIDO WHERE ESTADO='Entregado'");
//            //Obteniendo la informacion de las columnas que estan siendo consultadas
//            ResultSetMetaData rsMd = rs.getMetaData();
//            //La cantidad de columnas que tiene la consulta
//            int cantidadColumnas = rsMd.getColumnCount();
//            //Establecer como cabezeras el nombre de las colimnas
//            for (int i = 1; i <= cantidadColumnas; i++) {
//             modelo.addColumn(rsMd.getColumnLabel(i));
//            }
//            //Creando las filas para el JTable
//            while (rs.next()) {
//             Object[] fila = new Object[cantidadColumnas];
//             for (int i = 0; i < cantidadColumnas; i++) {
//               fila[i]=rs.getObject(i+1);
//             }
//             modelo.addRow(fila);
//            }
//            rs.close();
//            cn.close();
//       } catch (Exception ex) {
//        ex.printStackTrace();
//       }
    }//GEN-LAST:event_btnEntregadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            //Para establecer el modelo al JTable
            DefaultTableModel modelo = new DefaultTableModel();
            this.jPedidosTotales.setModel(modelo);
            //Para conectarnos a nuestra base de datos
            String url = "jdbc:oracle:thin:@44.196.189.75:51521:XE";
            // Establecemos los valores de cadena de conexión, usuario y contraseña
            cn = DriverManager.getConnection(url, "C##GRUPO", "1234");
            //Para ejecutar la consulta
            s = cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
             rs = s.executeQuery("select COUNT(ID_PEDIDO) as Cantidad_Pedidos FROM PEDIDO");
             //Obteniendo la informacion de las columnas que estan siendo consultadas
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las colimnas
            for (int i = 1; i <= cantidadColumnas; i++) {
             modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rs.next()) {
             Object[] fila = new Object[cantidadColumnas];
             for (int i = 0; i < cantidadColumnas; i++) {
               fila[i]=rs.getObject(i+1);
             }
             modelo.addRow(fila);
            }
            rs.close();
            cn.close();
       } catch (Exception ex) {
        ex.printStackTrace();
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendientesActionPerformed
        try {

            //Para establecer el modelo al JTable
            DefaultTableModel modelo = new DefaultTableModel();
            this.jPendientes.setModel(modelo);
            //Para conectarnos a nuestra base de datos
            String url = "jdbc:oracle:thin:@44.196.189.75:51521:XE";
            // Establecemos los valores de cadena de conexión, usuario y contraseña
            cn = DriverManager.getConnection(url, "C##GRUPO", "1234");
            //Para ejecutar la consulta
            s = cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
             rs = s.executeQuery("select COUNT(ID_PEDIDO) as Pendientes FROM PEDIDO WHERE ESTADO='Pendiente'");
             //Obteniendo la informacion de las columnas que estan siendo consultadas
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las colimnas
            for (int i = 1; i <= cantidadColumnas; i++) {
             modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rs.next()) {
             Object[] fila = new Object[cantidadColumnas];
             for (int i = 0; i < cantidadColumnas; i++) {
               fila[i]=rs.getObject(i+1);
             }
             modelo.addRow(fila);
            }
            rs.close();
            cn.close();
       } catch (Exception ex) {
        ex.printStackTrace();
       }
    }//GEN-LAST:event_btnPendientesActionPerformed

    private void btnContarEntregadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarEntregadosActionPerformed
        try {
            //Para establecer el modelo al JTable
            DefaultTableModel modelo = new DefaultTableModel();
            this.jEntregados.setModel(modelo);
            //Para conectarnos a nuestra base de datos
            String url = "jdbc:oracle:thin:@44.196.189.75:51521:XE";
            // Establecemos los valores de cadena de conexión, usuario y contraseña
            cn = DriverManager.getConnection(url, "C##GRUPO", "1234");
            //Para ejecutar la consulta
            s = cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
             rs = s.executeQuery("select COUNT(ID_PEDIDO) as ENTREGADO FROM PEDIDO WHERE ESTADO='Entregado'");
            //Obteniendo la informacion de las columnas que estan siendo consultadas
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las colimnas
            for (int i = 1; i <= cantidadColumnas; i++) {
             modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rs.next()) {
             Object[] fila = new Object[cantidadColumnas];
             for (int i = 0; i < cantidadColumnas; i++) {
               fila[i]=rs.getObject(i+1);
             }
             modelo.addRow(fila);
            }
            rs.close();
            cn.close();
       } catch (Exception ex) {
        ex.printStackTrace();
       }
    }//GEN-LAST:event_btnContarEntregadosActionPerformed

    private void btnConfirmadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmadosActionPerformed
        try {
            //Para establecer el modelo al JTable
            DefaultTableModel modelo = new DefaultTableModel();
            this.jConfirmados.setModel(modelo);
            //Para conectarnos a nuestra base de datos
            String url = "jdbc:oracle:thin:@44.196.189.75:51521:XE";
            // Establecemos los valores de cadena de conexión, usuario y contraseña
            cn = DriverManager.getConnection(url, "C##GRUPO", "1234");
            //Para ejecutar la consulta
            s = cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
             rs = s.executeQuery("select COUNT(ID_PEDIDO) as CONFIRMADO FROM PEDIDO WHERE ESTADO='Confirmado'");
            //Obteniendo la informacion de las columnas que estan siendo consultadas
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las colimnas
            for (int i = 1; i <= cantidadColumnas; i++) {
             modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rs.next()) {
             Object[] fila = new Object[cantidadColumnas];
             for (int i = 0; i < cantidadColumnas; i++) {
               fila[i]=rs.getObject(i+1);
             }
             modelo.addRow(fila);
            }
            rs.close();
            cn.close();
       } catch (Exception ex) {
        ex.printStackTrace();
       }
    }//GEN-LAST:event_btnConfirmadosActionPerformed

    private void btnMenuVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuVentasActionPerformed
        Ventas ven = new Ventas();
        ven.setVisible(true);
    }//GEN-LAST:event_btnMenuVentasActionPerformed

    private void btnPruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebasActionPerformed
        ClientesTodos ct = new ClientesTodos();
        ct.setVisible(true);
//        PruebasPedidos ped = new PruebasPedidos();
//        ped.setVisible(true);
    }//GEN-LAST:event_btnPruebasActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        Proveedores prove = new Proveedores();
        prove.setVisible(true);
        
        
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        try {
            jListarPedidos.print(JTable.PrintMode.NORMAL);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jListarPedidosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jListarPedidosComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jListarPedidosComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
  
    }//GEN-LAST:event_formComponentShown

    
    //generar pdf
//    private void pdf(){
//        try {
//            FileOutputStream archivo;
//            String url = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
//            File file = new File("src/pdf/venta.pdf");
//            archivo = new FileOutputStream(file);
//            //creacion documento
//            Document doc = new Document();
//            //creacion pdf
//            PdfWriter.getInstance(doc, archivo);
//            doc.open();
//            //insertar logo
//            Image img = Image.getInstance("src/img/logo_pdf.png");
//
//            
//            Paragraph fecha = new Paragraph();
//            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.DARK_GRAY);
//            fecha.add(Chunk.NEWLINE);
//            Date date = new Date ();
//            fecha.add("Factura:1 \n"+ "Fecha: "+ new SimpleDateFormat("dd-MM-yyyy").format(date)+"\n\n");
//            
//            PdfPTable Encabezado = new PdfPTable(3);
//            Encabezado.setWidthPercentage(100);
//            Encabezado.getDefaultCell().setBorder(0);
//            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
//            Encabezado.setWidths(ColumnaEncabezado);
//            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
//            Encabezado.addCell(img);
//            Encabezado.addCell("");
//            
//            Encabezado.addCell(img);
//            
//            String empresa ="order food";
//            String nombre = "order food";
//            String tel = "123452346";
//            String ra ="alimentos santiago";
//            
//            Encabezado.addCell("");
//            Encabezado.addCell("Empresa: "+empresa+"\nNombre: "+nombre+ "\nTeléfono; "+tel+"\nRestaurant: "+ra);
//            Encabezado.addCell(fecha);
//            doc.add(Encabezado);
//            
//            //
//            
//      
//
//            doc.close();
//            archivo.close();
//        } catch (Exception e) {
//        }
//    }
//    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPedidos().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmados;
    private javax.swing.JButton btnContarEntregados;
    private javax.swing.JButton btnEntregados;
    private javax.swing.JButton btnMenuVentas;
    private javax.swing.JButton btnPendientes;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnPruebas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTable jConfirmados;
    private javax.swing.JTable jEntregados;
    private javax.swing.JTable jListarPedidos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTable jPedidosTotales;
    private javax.swing.JTable jPendientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
