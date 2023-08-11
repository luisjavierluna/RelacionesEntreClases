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
public enum Palo {
    // ESPADAS(1, "Espadas"), BASTOS(2, "Bastos"), OROS(3, "Oros"), COPAS(4, "Copas");
    ESPADAS("Espadas"), BASTOS("Bastos"), OROS("Oros"), COPAS("Copas");
    
    private final String valor;
    
    private Palo(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}