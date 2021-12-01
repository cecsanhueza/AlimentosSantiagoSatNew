
package reportes;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author cecsanhueza
 */
public class Grafico {
    
    public static void Graficar(String fecha){
        Connection con;
        Conexion cn= new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            String sql = "SELECT CANTIDAD FROM PEDIDO WHERE FECHA_PEDIDO = ?";
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(0, fecha);
            rs = ps.executeQuery();
            DefaultPieDataset dataset = new DefaultPieDataset();
            
            while (rs.next()) {
                dataset.setValue(rs.getString("Total"),rs.getDouble("Total"));
            }
            JFreeChart jf = ChartFactory.createPieChart("Reporte de Ventas", dataset);
            ChartFrame f = new ChartFrame("Total de ventas por dia", jf);
            f.setSize(1000, 500);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
}
