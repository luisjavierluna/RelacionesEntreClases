/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EP_2;

import java.util.ArrayList;
import relacionesentreclases.EP_2.Juego;
import relacionesentreclases.EP_2.Jugador;
import relacionesentreclases.EP_2.Revolver;

/**
 *
 * @author javie
 */
public class JuegoServicio {

    public Juego llenarJuego(ArrayList<Jugador>jugadores, Revolver r) {
        Juego juego = new Juego();
        
        juego.setJugadores(jugadores);
        juego.setRevolver(r);
        
        return juego;
    }
    
    public void ronda(Juego juego) {
        JugadorServicio js = new JugadorServicio();
        RevolverServicio rs = new RevolverServicio();
        
        for (Jugador jugador : juego.getJugadores()) {
            rs.mostrarPosiciones(juego.getRevolver());
            System.out.println(jugador.getNombre() + " " + jugador.getId());
            boolean mojado = js.disparo(juego.getRevolver());
            System.out.println("");
            
            if (mojado) {
                System.out.println("El juego ha terminado");
                break;
            }
        }
        
        
        
    }
}
