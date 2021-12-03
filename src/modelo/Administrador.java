/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author cecsanhueza
 */
public class Administrador {
    private String rut_adm;
    private String nombre_adm;
    private String apat_adm;
    private String amat_adm;
    private String email_admin;
    private int fono_admin;
    private String contraseña1;
    private String contraseña2;
    private int restaurant_id_restaurante;

    public Administrador() {
    }

    public Administrador(String rut_adm, String nombre_adm, String apat_adm, String amat_adm, String email_admin, int fono_admin, String contraseña1, String contraseña2, int restaurant_id_restaurante) {
        this.rut_adm = rut_adm;
        this.nombre_adm = nombre_adm;
        this.apat_adm = apat_adm;
        this.amat_adm = amat_adm;
        this.email_admin = email_admin;
        this.fono_admin = fono_admin;
        this.contraseña1 = contraseña1;
        this.contraseña2 = contraseña2;
        this.restaurant_id_restaurante = restaurant_id_restaurante;
    }

    public String getRut_adm() {
        return rut_adm;
    }

    public void setRut_adm(String rut_adm) {
        this.rut_adm = rut_adm;
    }

    public String getNombre_adm() {
        return nombre_adm;
    }

    public void setNombre_adm(String nombre_adm) {
        this.nombre_adm = nombre_adm;
    }

    public String getApat_adm() {
        return apat_adm;
    }

    public void setApat_adm(String apat_adm) {
        this.apat_adm = apat_adm;
    }

    public String getAmat_adm() {
        return amat_adm;
    }

    public void setAmat_adm(String amat_adm) {
        this.amat_adm = amat_adm;
    }

    public String getEmail_admin() {
        return email_admin;
    }

    public void setEmail_admin(String email_admin) {
        this.email_admin = email_admin;
    }

    public int getFono_admin() {
        return fono_admin;
    }

    public void setFono_admin(int fono_admin) {
        this.fono_admin = fono_admin;
    }

    public String getContraseña1() {
        return contraseña1;
    }

    public void setContraseña1(String contraseña1) {
        this.contraseña1 = contraseña1;
    }

    public String getContraseña2() {
        return contraseña2;
    }

    public void setContraseña2(String contraseña2) {
        this.contraseña2 = contraseña2;
    }

    public int getRestaurant_id_restaurante() {
        return restaurant_id_restaurante;
    }

    public void setRestaurant_id_restaurante(int restaurant_id_restaurante) {
        this.restaurant_id_restaurante = restaurant_id_restaurante;
    }

    @Override
    public String toString() {
        return "Administrador{" + "rut_adm=" + rut_adm + ", nombre_adm=" + nombre_adm + ", apat_adm=" + apat_adm + ", amat_adm=" + amat_adm + ", email_admin=" + email_admin + ", fono_admin=" + fono_admin + ", contrase\u00f1a1=" + contraseña1 + ", contrase\u00f1a2=" + contraseña2 + ", restaurant_id_restaurante=" + restaurant_id_restaurante + '}';
    }
    
    
    
    
    
}
