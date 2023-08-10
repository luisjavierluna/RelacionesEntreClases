/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;

import java.util.ArrayList;
import java.util.Arrays;
import relacionesentreclases.EP_2.Juego;
import relacionesentreclases.EP_2.Jugador;
import relacionesentreclases.EP_2.Revolver;
import relacionesentreclases.EP_2.JuegoServicio;
import relacionesentreclases.EP_2.JugadorServicio;
import relacionesentreclases.EP_2.RevolverServicio;

/**
 *
 * @author javie
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RevolverServicio rs = new RevolverServicio();
       JuegoServicio js = new JuegoServicio();
       JugadorServicio jrs = new JugadorServicio();
       
       ArrayList<Jugador> jugadores = new ArrayList(Arrays.asList(
            new Jugador(1, "JugadorA"),
            new Jugador(2, "JugadorB"),
            new Jugador(3, "JugadorC"),
            new Jugador(4, "JugadorD"),
            new Jugador(5, "JugadorE"),
            new Jugador(6, "JugadorF")
        ));
       Revolver revolver = rs.llenarRevolver();
       Juego juego = js.llenarJuego(jugadores, revolver);
       
       js.ronda(juego);
    } 
}
