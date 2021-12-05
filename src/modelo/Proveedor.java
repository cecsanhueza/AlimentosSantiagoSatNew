
package modelo;

/**
 *
 * @author 56979
 */
public class Proveedor {
    private int id_proveedor;
    private String nom_proveedor;
    private String rol_local;
    private int celular;
    private String descripcion;

    public Proveedor() {
    }

    public Proveedor(int id_proveedor, String nom_proveedor, String rol_local, int celular, String descripcion) {
        this.id_proveedor = id_proveedor;
        this.nom_proveedor = nom_proveedor;
        this.rol_local = rol_local;
        this.celular = celular;
        this.descripcion = descripcion;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNom_proveedor() {
        return nom_proveedor;
    }

    public void setNom_proveedor(String nom_proveedor) {
        this.nom_proveedor = nom_proveedor;
    }

    public String getRol_local() {
        return rol_local;
    }

    public void setRol_local(String rol_local) {
        this.rol_local = rol_local;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "id_proveedor=" + id_proveedor + ", nom_proveedor=" + nom_proveedor + ", rol_local=" + rol_local + ", celular=" + celular + ", descripcion=" + descripcion + '}';
    }
    
    
}
