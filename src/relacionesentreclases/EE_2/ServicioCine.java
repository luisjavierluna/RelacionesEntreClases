/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioCine {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    ServicioEspectador se = new ServicioEspectador();
    ServicioPelicula sp = new ServicioPelicula();

    public Cine ubicarEspectadores() {
        Cine cine = new Cine();
        cine.setPrecio(generarPrecio());
        cine.setPelicula(sp.seleccionarPelicula());
        boolean noSePuedenUbicarMas = false;
        int contador = 0;

        // System.out.println("¿Cuántos espectadores quieren ingresar a la sala?");
        //int cantidadEspectadores = scan.nextInt();
        System.out.println("----------------------------------------------");
        int cantidadEspectadores = 60;

        ArrayList<Espectador> espectadores = se.generarEspectadores(cantidadEspectadores);
        Espectador[][] sala = new Espectador[8][6];

        int filaRandom;
        int columnaRandom;

        do {
            // Valida si el espectador tiene dinero y edad suficiente
            while (!espectadores.isEmpty() 
                    && espectadores.get(0).getDineroDisponible() <= cine.getPrecio()
                    || !espectadores.isEmpty() 
                    && espectadores.get(0).getEdad() <= cine.getPelicula().getEdadMinima()) {

                espectadores.remove(0);
                //System.out.println(espectadores.size());
                // System.out.println(contador);
            }

            filaRandom = (int) (Math.random() * sala.length);
            columnaRandom = (int) (Math.random() * sala[0].length);

            // Valida si se está ubicando a un espectador en un espacio ya usado
            if (sala[filaRandom][columnaRandom] == null && !espectadores.isEmpty()) {
                sala[filaRandom][columnaRandom] = espectadores.get(0);
                espectadores.remove(0);
                contador++;
            }

            // Valida si hay espacio libre en la sala
            if (contador >= 48) {
                System.out.println("La sala está llena");
                noSePuedenUbicarMas = true;
            } else if (espectadores.isEmpty()) {
                System.out.println("Ya no hay más personas para ubicar en la sala");
                noSePuedenUbicarMas = true;
            }
        } while (!noSePuedenUbicarMas);

        cine.setSala(sala);

        return cine;
    }
    
    private double generarPrecio() {
        double min = 150;
        double max = 500;
        
        double precio = (int) (Math.floor(Math.random() * (min - max + 1) + max));
        
        return precio;
    }
    
    
    public void mostrarTabla(Cine cine) {
        int filas = cine.getSala().length;
        int columnas = cine.getSala()[0].length;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (cine.getSala()[i][j] == null) {
                    System.out.print("   " + "|");
                } else {
                    System.out.print(" X " + "|");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
