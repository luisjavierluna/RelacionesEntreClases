/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_3.Servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import relacionesentreclases.EE_3.Entidades.Vehiculo;
import relacionesentreclases.EE_3.Enums.TipoVehiculo;

/**
 *
 * @author javie
 */
public class VehiculoServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    
    public Vehiculo registrarVehiculo() {
        Vehiculo vehiculo = new Vehiculo();
        
        int dia = 1;
        int mes = 1;
        int anio;
        
        int tipoVehiculo;
        
        System.out.println("----------------------------------------------------");
        System.out.println("Ingresa la Marca del Auto");
        vehiculo.setMarca(scan.nextLine());
        
        System.out.println("Ingresa el modelo del Auto");
        vehiculo.setModelo(scan.nextLine());
        
        System.out.println("Ingresa el año del Auto");
        anio = scan.nextInt();
        vehiculo.setAnio(LocalDate.of(anio, mes, dia));
        scan.nextLine();
        
        System.out.println("Ingresa el numero de motor del Auto");
        vehiculo.setNumeroMotor(scan.nextInt());
        scan.nextLine();
        
        System.out.println("Ingresa el tipo de chasis del Auto");
        vehiculo.setChasis(scan.nextLine());
        
        System.out.println("Ingresa el color del Auto");
        vehiculo.setColor(scan.nextLine());
        
        System.out.println("Ingresa el tipo de vehiculo del Auto: \n"
                + "1. CAMIONETA\n"
                + "2. SEDAN");
        tipoVehiculo = scan.nextInt();
        vehiculo.setTipo(TipoVehiculo.values()[tipoVehiculo - 1]);
        scan.nextLine();
        
        // vehiculos.add(vehiculo);
        
        return vehiculo;
    }
}
