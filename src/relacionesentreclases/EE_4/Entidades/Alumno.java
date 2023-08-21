/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_4.Entidades;

/**
 *
 * @author javie
 */
public class Alumno {
    private String nombreCompleto;
    private String DNI;
    private int cantidadVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, String DNI, int cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.cantidadVotos = cantidadVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDNI() {
        return DNI;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public String toString() {
        return "\nAlumno:" 
                + "Nombre Completo: " + nombreCompleto + "\n"
                + "DNI=" + DNI + "\n"
                + "Cantidad de Votos Recibidos: " + cantidadVotos + "\n";
    }
    
}
