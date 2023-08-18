/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;

import relacionesentreclases.EE_3.Servicios.CuotaServicio;
import relacionesentreclases.EE_3.Servicios.PolizaServicio;

/**
 *
 * @author javie
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        PolizaServicio ps = new PolizaServicio();
        CuotaServicio cs = new CuotaServicio();
        
        // ps.registrarPoliza();
        
        // System.out.println(ps.polizas.toString());
        
        cs.registrarCuotas();
        
        System.out.println(cs.cuotas.toString()); 
        
        // cs.consultarCuota();
    } 
}
