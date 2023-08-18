/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_3.Servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import relacionesentreclases.EE_3.Entidades.Cliente;

/**
 *
 * @author javie
 */
public class ClienteServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    // private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
//    private ArrayList<Cliente> clientes = new ArrayList<Cliente>(Arrays.asList(
//            new Cliente("Nombre1", "Apellido1", "Documento 1", "luis1@email.com", "Domicilio 1", 901801),
//            new Cliente("Nombre2", "Apellido2", "Documento 2", "luis2@email.com", "Domicilio 2", 901802),
//            new Cliente("Nombre3", "Apellido3", "Documento 3", "luis3@email.com", "Domicilio 3", 901803),
//            new Cliente("Nombre4", "Apellido4", "Documento 4", "luis4@email.com", "Domicilio 4", 901804),
//            new Cliente("Nombre5", "Apellido5", "Documento 5", "luis5@email.com", "Domicilio 5", 901805)
//    ));
    
    public Cliente registrarCliente() {
        Cliente cliente = new Cliente();
        
        System.out.println("----------------------------------------------------");
        System.out.println("Ingresa el Nombre del cliente");
        cliente.setNombre(scan.nextLine());
        
        System.out.println("Ingresa el Apellido del cliente");
        cliente.setApellido(scan.nextLine());
        
        System.out.println("Ingresa el Documento del cliente");
        cliente.setDocumento(scan.nextLine());
        
        System.out.println("Ingresa el email del cliente");
        cliente.setMail(scan.nextLine());
        
        System.out.println("Ingresa el Domicilio del cliente");
        cliente.setDomicilio(scan.nextLine());
        
        System.out.println("Ingresa el Número de Télefono del cliente");
        cliente.setTelefono(scan.nextInt());
        scan.nextLine();
        
        // clientes.add(cliente);
        
        return cliente;
    }
    
    
}
