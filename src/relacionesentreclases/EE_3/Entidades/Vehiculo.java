/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_3.Entidades;

import java.time.LocalDate;
import relacionesentreclases.EE_3.Enums.TipoVehiculo;

/**
 *
 * @author javie
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private LocalDate anio;
    private int numeroMotor;
    private String chasis;
    private String color;
    private TipoVehiculo tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, LocalDate anio, int numeroMotor, String chasis, String color, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public String getColor() {
        return color;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(LocalDate anio) {
        this.anio = anio;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo.getValor() + "\n";
    }
    
    
}
