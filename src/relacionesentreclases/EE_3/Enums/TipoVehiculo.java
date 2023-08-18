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
public enum TipoVehiculo {
    CAMIONETA("Camioneta"), SEDAN("Sedan");
    
    private final String valor;

    private TipoVehiculo(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
}
