/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EP_3;

/**
 *
 * @author javie
 */
public class CartaEspanola {
    private Numero numero;
    private Palo palo;

    public CartaEspanola() {
    }

    public CartaEspanola(Numero numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Numero getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero.getValor() + " de " + palo.getValor() + "\n";
    }

   
    
}
