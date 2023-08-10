/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EP_2;

import relacionesentreclases.EP_2.Revolver;

/**
 *
 * @author javie
 */
public class JugadorServicio {
    
    public boolean disparo(Revolver r) {
        RevolverServicio rs = new RevolverServicio();
        boolean mojado = rs.mojar(r);
        rs.siguienteChorro(r);
        
        return mojado;
    }
}
