/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_3.Entidades;

import java.time.LocalDate;
import relacionesentreclases.EE_3.Enums.FormaPago;

/**
 *
 * @author javie
 */
public class Cuota {
    private int numeroCuota;
    private double montoTotalCuota;
    private boolean estaPagada;
    private LocalDate fechaVencimiento;
    private FormaPago formaPago;

    public Cuota() {
    }

    public Cuota(int numeroCuota, double montoTotalCuota, boolean estaPagada, LocalDate fechaVencimiento, FormaPago formaPago) {
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.estaPagada = estaPagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public boolean isEstaPagada() {
        return estaPagada;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public void setEstaPagada(boolean estaPagada) {
        this.estaPagada = estaPagada;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroCuota=" + numeroCuota + ", montoTotalCuota=" + montoTotalCuota + ", estaPagada=" + estaPagada + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago.getValor() + "\n";
    }
    
    
    
}
