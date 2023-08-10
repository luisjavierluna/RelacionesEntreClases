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
public class RevolverServicio {
    
    public Revolver llenarRevolver() {
        Revolver revolver = new Revolver();
        int posicionAgua = (int) ((Math.random() * 6) + 1);
        
        revolver.setPosicionActual(1);
        revolver.setPosicionAgua(posicionAgua);
        
        return revolver;
    }
    
    public boolean mojar(Revolver revolver) {
        boolean mismaPosición;
        
        mismaPosición = revolver.getPosicionActual() == revolver.getPosicionAgua();
        
        System.out.println("Disparó agua: " + mismaPosición);
        
        return mismaPosición;
    }
    
    public void siguienteChorro(Revolver revolver) {
        revolver.setPosicionActual(revolver.getPosicionActual() + 1);
    }
    
    public void mostrarPosiciones(Revolver revolver) {
        System.out.println(revolver.toString());
    }
    
}
