/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_3.Entidades;

/**
 *
 * @author javie
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String documento;
    private String mail;
    private String domicilio;
    private int telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String documento, String mail, String domicilio, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public String getMail() {
        return mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + 
                ", apellido=" + apellido + 
                ", documento=" + documento + 
                ", mail=" + mail + 
                ", domicilio=" + domicilio + 
                ", telefono=" + telefono + "}\n";
    }
}
