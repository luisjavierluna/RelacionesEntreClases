/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EP_1;

/**
 *
 * @author javie
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private Perro Perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDocumento() {
        return documento;
    }

    public Perro getPerro() {
        return Perro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setPerro(Perro Perro) {
        this.Perro = Perro;
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido + ": \n" +
                "Edad: " + edad + "\n" +
                "Documento: " + documento + "\n" +
                "Perro: " + Perro.getNombre() + ", " + Perro.getRaza() + ", " + Perro.getEdad() + " años, " + Perro.getTamanio() +" cm \n";
    }
    
    
}
