/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;

import relacionesentreclases.EE_1.ServicioPersona;

/**
 *
 * @author javie
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        ServicioPersona sp = new ServicioPersona();
        
        // sp.mostrarPerros();
        sp.asignarPerros();
        
        sp.mostrarDatos();
    } 
}
