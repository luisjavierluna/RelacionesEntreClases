/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_3.Enums;

/**
 *
 * @author javie
 */
public enum TipoCobertura {
    TOTAL("Total"), CONTRA_TERCEROS("Contra Terceros");
    
    private final String valor;

    private TipoCobertura(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
