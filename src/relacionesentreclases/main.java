/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;

import relacionesentreclases.EE_2.ServicioCine;
import relacionesentreclases.EE_2.ServicioEspectador;
import relacionesentreclases.EE_2.ServicioPelicula;


/**
 *
 * @author javie
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        ServicioCine sc = new ServicioCine();
        
        
        for (int i = 0; i < 100; i++) {
            sc.mostrarTabla(sc.ubicarEspectadores());
            
        }
        
    } 
}
