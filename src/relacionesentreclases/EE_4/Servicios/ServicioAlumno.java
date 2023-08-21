/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_4.Servicios;

import java.util.ArrayList;
import relacionesentreclases.EE_4.Entidades.Alumno;

/**
 *
 * @author javie
 */
public class ServicioAlumno {
    
    public String generarNombreYApellido() {
        int min = 3;
        int max = 7;
        String nombre = "";
        String apellido = "";

        int tamanioNombre = (int) (Math.floor(Math.random() * (max - min + 1) + min));

        for (int i = 0; i < tamanioNombre; i++) {
            nombre += generarCaracterAleatorio();
            apellido += generarCaracterAleatorio();
        }

        nombre += " " + apellido;

        return nombre;
    }

    private String generarCaracterAleatorio() {
        int rand = (int) Math.floor(Math.random() * 26);
        return Character.toString((char) ('A' + rand % 26));
    }
    
    public String generarDNI() {
        String DNI = "";
        int rand;
        
        for (int i = 0; i < 10; i++) {
            rand = (int) (Math.random() * 10);
            DNI += rand;
        }
        
        return DNI;
    }
    
    public void mostrarFacilitadores(ArrayList<Alumno> facilitadores) {
        int tamanioListado = facilitadores.size() >= 10 ? 10 : facilitadores.size();        
        
        System.out.println("\nFacilitadores: ------------------------------------");

        for (int i = 0; i < tamanioListado; i++) {   
            if (i == 5) System.out.println("\nFacilitadores Suplentes: ------------------------------------");            
            System.out.println(facilitadores.get(i).toString());
        }
    }
}
