/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_3.Servicios;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import relacionesentreclases.EE_3.Entidades.Cuota;
import relacionesentreclases.EE_3.Enums.FormaPago;

/**
 *
 * @author javie
 */
public class CuotaServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Cuota> cuotas = new ArrayList<Cuota>();
//    ArrayList<Cuota> cuotas = new ArrayList<Cuota>(Arrays.asList(
//            new Cuota(111, 1111111.1, true, LocalDate.of(2011, Month.JANUARY, 1), FormaPago.EFECTIVO),
//            new Cuota(222, 2222222.2, false, LocalDate.of(2012, Month.FEBRUARY, 1), FormaPago.TRANSFERENCIA),
//            new Cuota(333, 3333333.3, true, LocalDate.of(2013, Month.MARCH, 1), FormaPago.EFECTIVO),
//            new Cuota(444, 4444444.4, false, LocalDate.of(2014, Month.APRIL, 1), FormaPago.TRANSFERENCIA),
//            new Cuota(555, 5555555.5, true, LocalDate.of(2015, Month.MAY, 1), FormaPago.EFECTIVO),
//            new Cuota(666, 6666666.6, false, LocalDate.of(2016, Month.JUNE, 1), FormaPago.TRANSFERENCIA)
//    ));
 
    private Cuota registrarCuota() {
        Cuota cuota = new Cuota();
        
        int dia;
        int mes;
        int anio;
        
        int formaPago = 0;
        
        System.out.println("Ingresa el número de folio de la cuota");
        cuota.setNumeroCuota(scan.nextInt());
        
        System.out.println("Ingresa el monto Total de la cuota");
        cuota.setMontoTotalCuota(scan.nextDouble());
        
        System.out.println("¿Está pagada la cuota?");
        cuota.setEstaPagada(scan.nextBoolean());
        
        System.out.println("Ingresa la fecha de vencimiento de la cuota");
        System.out.println("Año");
        anio = scan.nextInt();
        System.out.println("Mes");
        mes = scan.nextInt();
        System.out.println("Día");
        dia = scan.nextInt();
        cuota.setFechaVencimiento(LocalDate.of(anio, mes, dia));
        scan.nextLine();
        
        System.out.println("Ingresa la forma de pago de la cuota: \n"
                + "1. Efectivo\n"
                + "2. Transferencia");
        formaPago = scan.nextInt();
        cuota.setFormaPago(FormaPago.values()[formaPago - 1]);
        scan.nextLine();
        
        return cuota;
    }
 
    public void registrarCuotas() {
        
        System.out.println("¿Cuantas cuotas deseas registrar?");
        int cantidadCuotas = scan.nextInt();
        
        for (int i = 0; i < cantidadCuotas; i++) {
            cuotas.add(registrarCuota());
        }
    }
 
    public void consultarCuota() {
        System.out.println("Ingresa el número de cuota que quieres consultar");
        int numeroCuota = scan.nextInt();
        boolean encontrado = false;
        
        for (Cuota cuota : cuotas) {
            if (cuota.getNumeroCuota() == numeroCuota) {
                System.out.println(cuota.toString());
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontró cuota con número: " + numeroCuota);
        }
    }
    
    
}
