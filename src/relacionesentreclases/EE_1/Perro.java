/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_1;

import relacionesentreclases.EP_1.*;

/**
 *
 * @author javie
 */
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private double tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, double tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return nombre + ": " + raza + ", " + edad + " años, " + tamanio + " cm";
    }
    
    
}
