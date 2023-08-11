/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EP_3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author javie
 */
public class CartaEspanolaServicio {
  
    ArrayList<CartaEspanola> baraja = new ArrayList<CartaEspanola>();
    ArrayList<CartaEspanola> cartasUsadas = new ArrayList<CartaEspanola>();
    
    public void inicializarBaraja() {
        for (int i = 0; i < Palo.values().length; i++) {
            Palo palo = Palo.values()[i];
            
            for (int j = 0; j < Numero.values().length; j++) {
                Numero numero = Numero.values()[j];
                
                baraja.add(new CartaEspanola(numero, palo));
            }
        }
    }
    
    public void barajar() {
            Collections.shuffle(baraja);
        
        System.out.println("Las cartas han sido barajadas\n");
    }
    
    public void siguienteCarta() {
        if (baraja.size() >= 1) {
            System.out.println("La siguiente carta es : \n" + baraja.get(0).toString());
            cartasUsadas.add(baraja.get(0));
            baraja.remove(0);
        } else {
            System.out.println("Ya no hay más cartas en la baraja");
        }
    }
    
    public void cartasDisponibles() {
        System.out.println("\nLa cantidad de cartas que aun se pueden repartir es de " + baraja.size() + "\n");
    }
    
    public void darCartas(int cartasPedidas){
        if (baraja.size() >= cartasPedidas) {
            for (int i = 0; i < cartasPedidas; i++) {
                System.out.println("Carta #" + (i + 1) + " entregada");
                siguienteCarta();
            }
        } else {
            System.out.println("\nSolicitaste " + cartasPedidas + " cartas, pero en la baraja solo hay " + baraja.size()+ "\n");
        }
    }
    
    public void cartasMonton() {
        for (CartaEspanola cartaEspanola : cartasUsadas) {
            System.out.println(cartaEspanola.toString());
        }
    }
    
    public void mostrarBaraja() {
        int contador = 1;
        for (CartaEspanola cartaEspanola : baraja) {
            
            System.out.println("#" + contador + ". " + cartaEspanola.toString());
            contador++;
        }
    }
}
