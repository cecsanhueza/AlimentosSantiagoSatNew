package Modelo;

/**
 *
 * @author Ansaldi7
 */
public class Det_Pago {
    private int precio_unidad;
    private int total;
    private String direccion_entrega;

    public Det_Pago(){

    }

    public Det_Pago(int precio_unidad,int total, String direccion_entrega){
         this.precio_unidad=precio_unidad;
         this.total=total;
         this.direccion_entrega=direccion_entrega;
    }

    public int getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(int precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getDireccion_entrega() {
        return direccion_entrega;
    }

    public void setDireccion_entrega(String direccion_entrega) {
        this.direccion_entrega = direccion_entrega;
    }

    @Override
    public String toString() {
        return "Det_Pago{" + "precio_unidad=" + precio_unidad + ", total=" + total + ", direccion_entrega=" + direccion_entrega + '}';
    }

}