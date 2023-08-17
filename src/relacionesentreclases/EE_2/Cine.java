/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_2;

/**
 *
 * @author javie
 */
public class Cine {
    private Pelicula pelicula;
    private Espectador[][] sala;
    private double precio;

    public Cine() {
    }

    public Cine(Pelicula pelicula, Espectador[][] sala, double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Espectador[][] getSala() {
        return sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setSala(Espectador[][] sala) {
        this.sala = sala;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
