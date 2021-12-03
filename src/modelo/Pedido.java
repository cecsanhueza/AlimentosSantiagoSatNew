
package modelo;

/**
 *
 * @author cecsanhueza
 */
public class Pedido {
    
   private int ID_PEDIDO;
   private int CANTIDAD;
   private int PRECIO;
   private String DIRECCION;
   private String TIPO_ENTREGA;
   private int CELULAR;
   private String FECHA_PEDIDO;
   private String ESTADO;
   private int CLIENTE_ID;
   private int PLATO_ID_ID;
   private int TIPO_PAGO;
   private String HORARIO_ENTREGA;
   private int RESTAURANT_ID_RESTAURANTE;

    public Pedido() {
    }

    public Pedido(int ID_PEDIDO, int CANTIDAD, int PRECIO, String DIRECCION, String TIPO_ENTREGA, int CELULAR, String FECHA_PEDIDO, String ESTADO, int CLIENTE_ID, int PLATO_ID_ID, int TIPO_PAGO, String HORARIO_ENTREGA, int RESTAURANT_ID_RESTAURANTE) {
        this.ID_PEDIDO = ID_PEDIDO;
        this.CANTIDAD = CANTIDAD;
        this.PRECIO = PRECIO;
        this.DIRECCION = DIRECCION;
        this.TIPO_ENTREGA = TIPO_ENTREGA;
        this.CELULAR = CELULAR;
        this.FECHA_PEDIDO = FECHA_PEDIDO;
        this.ESTADO = ESTADO;
        this.CLIENTE_ID = CLIENTE_ID;
        this.PLATO_ID_ID = PLATO_ID_ID;
        this.TIPO_PAGO = TIPO_PAGO;
        this.HORARIO_ENTREGA = HORARIO_ENTREGA;
        this.RESTAURANT_ID_RESTAURANTE = RESTAURANT_ID_RESTAURANTE;
    }

    public int getID_PEDIDO() {
        return ID_PEDIDO;
    }

    public void setID_PEDIDO(int ID_PEDIDO) {
        this.ID_PEDIDO = ID_PEDIDO;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public int getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(int PRECIO) {
        this.PRECIO = PRECIO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getTIPO_ENTREGA() {
        return TIPO_ENTREGA;
    }

    public void setTIPO_ENTREGA(String TIPO_ENTREGA) {
        this.TIPO_ENTREGA = TIPO_ENTREGA;
    }

    public int getCELULAR() {
        return CELULAR;
    }

    public void setCELULAR(int CELULAR) {
        this.CELULAR = CELULAR;
    }

    public String getFECHA_PEDIDO() {
        return FECHA_PEDIDO;
    }

    public void setFECHA_PEDIDO(String FECHA_PEDIDO) {
        this.FECHA_PEDIDO = FECHA_PEDIDO;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public int getCLIENTE_ID() {
        return CLIENTE_ID;
    }

    public void setCLIENTE_ID(int CLIENTE_ID) {
        this.CLIENTE_ID = CLIENTE_ID;
    }

    public int getPLATO_ID_ID() {
        return PLATO_ID_ID;
    }

    public void setPLATO_ID_ID(int PLATO_ID_ID) {
        this.PLATO_ID_ID = PLATO_ID_ID;
    }

    public int getTIPO_PAGO() {
        return TIPO_PAGO;
    }

    public void setTIPO_PAGO(int TIPO_PAGO) {
        this.TIPO_PAGO = TIPO_PAGO;
    }

    public String getHORARIO_ENTREGA() {
        return HORARIO_ENTREGA;
    }

    public void setHORARIO_ENTREGA(String HORARIO_ENTREGA) {
        this.HORARIO_ENTREGA = HORARIO_ENTREGA;
    }

    public int getRESTAURANT_ID_RESTAURANTE() {
        return RESTAURANT_ID_RESTAURANTE;
    }

    public void setRESTAURANT_ID_RESTAURANTE(int RESTAURANT_ID_RESTAURANTE) {
        this.RESTAURANT_ID_RESTAURANTE = RESTAURANT_ID_RESTAURANTE;
    }

    @Override
    public String toString() {
        return "Pedido{" + "ID_PEDIDO=" + ID_PEDIDO + ", CANTIDAD=" + CANTIDAD + ", PRECIO=" + PRECIO + ", DIRECCION=" + DIRECCION + ", TIPO_ENTREGA=" + TIPO_ENTREGA + ", CELULAR=" + CELULAR + ", FECHA_PEDIDO=" + FECHA_PEDIDO + ", ESTADO=" + ESTADO + ", CLIENTE_ID=" + CLIENTE_ID + ", PLATO_ID_ID=" + PLATO_ID_ID + ", TIPO_PAGO=" + TIPO_PAGO + ", HORARIO_ENTREGA=" + HORARIO_ENTREGA + ", RESTAURANT_ID_RESTAURANTE=" + RESTAURANT_ID_RESTAURANTE + '}';
    }
   
   
   
}
