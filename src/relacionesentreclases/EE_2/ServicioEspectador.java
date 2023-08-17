/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_2;

import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class ServicioEspectador {
    
    public ArrayList<Espectador> generarEspectadores(int cantidadEspectadores) {
        ArrayList<Espectador> espectadores = new ArrayList<Espectador>();
        
        for (int i = 0; i < cantidadEspectadores; i++) {
            espectadores.add(generarEspectador());
        }
        
        return espectadores;
    }
    
    private Espectador generarEspectador() {
        Espectador espectador = new Espectador();
        
        espectador.setNombre(generarNombre());
        espectador.setEdad(generarEdad());
        espectador.setDineroDisponible(generarDineroDisponible());
        
        return espectador;
    }
    
    private String generarNombre() {
        int min = 3;
        int max = 7;
        String nombre = "";
        
        int tamanioNombre = (int) (Math.floor(Math.random() * (max - min + 1) + min));
        
        for (int i = 0; i < tamanioNombre; i++) {
            nombre += generarCaracterAleatorio();
        }
        
        return nombre;
    }
    
    private String generarCaracterAleatorio() {
        int rand = (int) Math.floor(Math.random() * 26);
        return Character.toString((char) ('A' + rand % 26));
    }
    
    private int generarEdad() {
        int edadMax = 70;
        int edadMin = 10;
        
        int edad = (int) (Math.floor(Math.random() * (edadMax - edadMin + 1) + edadMin));
        
        return edad;
    }
    
    private double generarDineroDisponible() {
        double min = 10;
        double max = 1000;
        
        double dineroDisponible = (int) (Math.floor(Math.random() * (min - max + 1) + max));
        
        return dineroDisponible;
    }
    
}
