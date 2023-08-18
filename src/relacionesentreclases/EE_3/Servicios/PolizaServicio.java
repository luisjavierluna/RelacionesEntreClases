/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_3.Servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import relacionesentreclases.EE_3.Entidades.Cliente;
import relacionesentreclases.EE_3.Entidades.Poliza;
import relacionesentreclases.EE_3.Entidades.Vehiculo;
import relacionesentreclases.EE_3.Enums.FormaPago;
import relacionesentreclases.EE_3.Enums.TipoCobertura;

/**
 *
 * @author javie
 */
public class PolizaServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    ClienteServicio cs = new ClienteServicio();
    VehiculoServicio vs = new VehiculoServicio();
    
    public ArrayList<Poliza> polizas = new ArrayList<Poliza>();
    
    public Poliza registrarPoliza() {
        Poliza poliza = new Poliza();
        Cliente cliente = new Cliente();
        
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        int cantidadVehiculasAsegurar = 0;
        
        int diaInicio;
        int mesInicio;
        int anioInicio;
        
        int anioFin;
        
        int formaPago;
        int tipoCobertura;
        
        System.out.println("----------------------------------------------------");
        
        System.out.println("Ingresa el número de poliza");
        poliza.setNumeroPoliza(scan.nextInt());
        
        System.out.println("Ingresa la fecha de inicio de la poliza");
        System.out.println("Año");
        anioInicio = scan.nextInt();
        System.out.println("Mes");
        mesInicio = scan.nextInt();
        System.out.println("Día");
        diaInicio = scan.nextInt();       
        poliza.setFechaInicio(LocalDate.of(anioInicio, mesInicio, diaInicio));
        scan.nextLine();
        
        System.out.println("La fecha de fin de la poliza se calcula automaticamente");
        anioFin = anioInicio + 1;
        poliza.setFechaFin(LocalDate.of(anioFin, mesInicio, diaInicio));
        
        System.out.println("Ingresa la cantidad de cuotas de la poliza");
        poliza.setCantidadCuotas(scan.nextInt());
        scan.nextLine();
        
        System.out.println("Ingresa la forma de pago de la poliza: \n"
                + "1. Efectivo\n"
                + "2. Transferencia");
        formaPago = scan.nextInt();
        poliza.setFormaPago(FormaPago.values()[formaPago - 1]);
        scan.nextLine();
        
        System.out.println("Ingresa el monto total asegurado");
        poliza.setMontoTotalAsegurado(scan.nextDouble());
        scan.nextLine();
        
        System.out.println("¿La poliza incluye protección contra granizo?");
        poliza.setIncluyeGranizo(scan.nextBoolean());
        
        if (poliza.isIncluyeGranizo()) {
            System.out.println("Ingresa el monto máximo de cobertura por granizo");
            poliza.setMontoMaximoGranizo(scan.nextDouble());
            scan.nextLine();
        }
        
        System.out.println("Ingresa el tipo de cobertura de la poliza: \n"
                + "1. TOTAL\n"
                + "2. CONTRA_TERCEROS");
        tipoCobertura = scan.nextInt();
        poliza.setTipoCobertura(TipoCobertura.values()[tipoCobertura - 1]);
        scan.nextLine();
        
        System.out.println("A continuación ingresa los datos del cliente");
        cliente = cs.registrarCliente();
        poliza.setCliente(cliente);
        
        System.out.println("¿Cuántos vehículos se deben asegurar para este cliente?");
        cantidadVehiculasAsegurar = scan.nextInt();
        for (int i = 0; i < cantidadVehiculasAsegurar; i++) vehiculos.add(vs.registrarVehiculo());
        poliza.setVehiculos(vehiculos);
        
        polizas.add(poliza);
        
        return poliza;
    }
}
