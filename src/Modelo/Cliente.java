
package modelo;

/**
 *
 * @author cecsanhueza
 */
public class Cliente {
    private int ID_CLIENTE;
    private String NOMBRE_CLI;
    private String APATERNO_CLI;
    private String AMATERNO_CLI;
    private int FONO_CLI;
    private String EMAIL_CLI;
    private int SALDO_CLI;
    private String CONTRASEÑA1;
    private String CONTRASEÑA2;
    private int EMPRESA_RUT_EMPRESA;

    public Cliente() {
    }

    public Cliente(int ID_CLIENTE, String NOMBRE_CLI, String APATERNO_CLI, String AMATERNO_CLI, int FONO_CLI, String EMAIL_CLI, int SALDO_CLI, String CONTRASEÑA1, String CONTRASEÑA2, int EMPRESA_RUT_EMPRESA) {
        this.ID_CLIENTE = ID_CLIENTE;
        this.NOMBRE_CLI = NOMBRE_CLI;
        this.APATERNO_CLI = APATERNO_CLI;
        this.AMATERNO_CLI = AMATERNO_CLI;
        this.FONO_CLI = FONO_CLI;
        this.EMAIL_CLI = EMAIL_CLI;
        this.SALDO_CLI = SALDO_CLI;
        this.CONTRASEÑA1 = CONTRASEÑA1;
        this.CONTRASEÑA2 = CONTRASEÑA2;
        this.EMPRESA_RUT_EMPRESA = EMPRESA_RUT_EMPRESA;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public String getNOMBRE_CLI() {
        return NOMBRE_CLI;
    }

    public void setNOMBRE_CLI(String NOMBRE_CLI) {
        this.NOMBRE_CLI = NOMBRE_CLI;
    }

    public String getAPATERNO_CLI() {
        return APATERNO_CLI;
    }

    public void setAPATERNO_CLI(String APATERNO_CLI) {
        this.APATERNO_CLI = APATERNO_CLI;
    }

    public String getAMATERNO_CLI() {
        return AMATERNO_CLI;
    }

    public void setAMATERNO_CLI(String AMATERNO_CLI) {
        this.AMATERNO_CLI = AMATERNO_CLI;
    }

    public int getFONO_CLI() {
        return FONO_CLI;
    }

    public void setFONO_CLI(int FONO_CLI) {
        this.FONO_CLI = FONO_CLI;
    }

    public String getEMAIL_CLI() {
        return EMAIL_CLI;
    }

    public void setEMAIL_CLI(String EMAIL_CLI) {
        this.EMAIL_CLI = EMAIL_CLI;
    }

    public int getSALDO_CLI() {
        return SALDO_CLI;
    }

    public void setSALDO_CLI(int SALDO_CLI) {
        this.SALDO_CLI = SALDO_CLI;
    }

    public String getCONTRASEÑA1() {
        return CONTRASEÑA1;
    }

    public void setCONTRASEÑA1(String CONTRASEÑA1) {
        this.CONTRASEÑA1 = CONTRASEÑA1;
    }

    public String getCONTRASEÑA2() {
        return CONTRASEÑA2;
    }

    public void setCONTRASEÑA2(String CONTRASEÑA2) {
        this.CONTRASEÑA2 = CONTRASEÑA2;
    }

    public int getEMPRESA_RUT_EMPRESA() {
        return EMPRESA_RUT_EMPRESA;
    }

    public void setEMPRESA_RUT_EMPRESA(int EMPRESA_RUT_EMPRESA) {
        this.EMPRESA_RUT_EMPRESA = EMPRESA_RUT_EMPRESA;
    }

    @Override
    public String toString() {
        return "Cliente{" + "ID_CLIENTE=" + ID_CLIENTE + ", NOMBRE_CLI=" + NOMBRE_CLI + ", APATERNO_CLI=" + APATERNO_CLI + ", AMATERNO_CLI=" + AMATERNO_CLI + ", FONO_CLI=" + FONO_CLI + ", EMAIL_CLI=" + EMAIL_CLI + ", SALDO_CLI=" + SALDO_CLI + ", CONTRASE\u00d1A1=" + CONTRASEÑA1 + ", CONTRASE\u00d1A2=" + CONTRASEÑA2 + ", EMPRESA_RUT_EMPRESA=" + EMPRESA_RUT_EMPRESA + '}';
    }
    
    
}
