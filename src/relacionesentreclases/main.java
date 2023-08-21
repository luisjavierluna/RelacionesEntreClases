/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;

import java.util.ArrayList;
import relacionesentreclases.EE_4.Entidades.Alumno;
import relacionesentreclases.EE_4.Entidades.Simulador;
import relacionesentreclases.EE_4.Entidades.Voto;

/**
 *
 * @author javie
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Simulador simulador = new Simulador();
        
        
        ArrayList<Alumno> alumnos = simulador.generarListadoAlumnos();
        
        ArrayList<Voto> votos = simulador.votacion(alumnos);
        
        simulador.mostrarVotos(votos);
        
        simulador.recuentoVotos(alumnos);
        
        ArrayList<Alumno> facilitadores = simulador.crearFacilitadores(alumnos);
        
        // simulador.mostrarFacilitadores(facilitadores);
        
        
    } 
}
