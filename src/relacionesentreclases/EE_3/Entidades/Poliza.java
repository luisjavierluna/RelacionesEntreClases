/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_3.Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import relacionesentreclases.EE_3.Enums.FormaPago;
import relacionesentreclases.EE_3.Enums.TipoCobertura;

/**
 *
 * @author javie
 */
public class Poliza {
    private int numeroPoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int cantidadCuotas;
    private FormaPago formaPago;
    private double montoTotalAsegurado;
    private boolean incluyeGranizo;
    private double montoMaximoGranizo;
    private TipoCobertura tipoCobertura;
    private ArrayList<Vehiculo> vehiculos;
    private Cliente cliente;

    public Poliza() {
    }

    public Poliza(int numeroPoliza, LocalDate fechaInicio, LocalDate fechaFin, int cantidadCuotas, FormaPago formaPago, double montoTotalAsegurado, boolean incluyeGranizo, double montoMaximoGranizo, TipoCobertura tipoCobertura, ArrayList<Vehiculo> vehiculos, Cliente cliente) {
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadCuotas = cantidadCuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoCobertura = tipoCobertura;
        this.vehiculos = vehiculos;
        this.cliente = cliente;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numeroPoliza=" + numeroPoliza 
                + ", fechaInicio=" + fechaInicio 
                + ", fechaFin=" + fechaFin 
                + ", cantidadCuotas=" + cantidadCuotas 
                + ", formaPago=" + formaPago.getValor()
                + ", montoTotalAsegurado=" + montoTotalAsegurado 
                + ", incluyeGranizo=" + incluyeGranizo 
                + ", montoMaximoGranizo=" + montoMaximoGranizo 
                + ", tipoCobertura=" + tipoCobertura.getValor() + "\n"
                + ", vehiculos=" + vehiculos.toString() + "\n"
                + ", cliente=" + cliente.toString() + "}\n";
    }

    
    
    
}
