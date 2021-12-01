package Modelo;

/**
 *
 * @author Ansaldi
 */
public class Cliente {
    private int id_cliente;
    private String nombre_cli;
    private String apaterno_cli;
    private String amaterno_cli;
    private int fono_cli;
    private String email_cli;
    private int saldo_cli;
    public Cliente(){
    }
    public Cliente(int id_cliente, String nombre_cli, String apaterno_cli, String amaterno_cli, int fono_cli, String email_cli, int saldo_cli) {
        this.id_cliente = id_cliente;
        this.nombre_cli = nombre_cli;
        this.apaterno_cli = apaterno_cli;
        this.amaterno_cli = amaterno_cli;
        this.fono_cli = fono_cli;
        this.email_cli = email_cli;
        this.saldo_cli = saldo_cli;
    }
    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    public String getNombre_cli() {
        return nombre_cli;
    }
    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }
    public String getApaterno_cli() {
        return apaterno_cli;
    }
    public void setApaterno_cli(String apaterno_cli) {
        this.apaterno_cli = apaterno_cli;
    }
    public String getAmaterno_cli() {
        return amaterno_cli;
    }
    public void setAmaterno_cli(String amaterno_cli) {
        this.amaterno_cli = amaterno_cli;
    }
    public int getFono_cli() {
        return fono_cli;
    }
    public void setFono_cli(int fono_cli) {
        this.fono_cli = fono_cli;
    }
    public String getEmail_cli() {
        return email_cli;
    }
    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }
    public int getSaldo_cli() {
        return saldo_cli;
    }
    public void setSaldo_cli(int saldo_cli) {
        this.saldo_cli = saldo_cli;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", nombre_cli=" + nombre_cli + ", apaterno_cli=" + apaterno_cli + ", amaterno_cli=" + amaterno_cli + ", fono_cli=" + fono_cli + ", email_cli=" + email_cli + ", saldo_cli=" + saldo_cli + '}';
    }
    
    


}