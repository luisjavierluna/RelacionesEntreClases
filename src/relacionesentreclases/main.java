/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import relacionesentreclases.EP_1.Perro;
import relacionesentreclases.EP_1.Persona;

/**
 *
 * @author javie
 */
public class main {
    static List<Persona> personas = new ArrayList(Arrays.asList(
            new Persona("Luis", "Luna", 23, "111111111111"),
            new Persona("Javier", "Arellano", 33, "222222222222")
    ));

    static List<Perro> perros = new ArrayList(Arrays.asList(
            new Perro("Scooby", "Gran Danés", 3, 30.5),
            new Perro("Solobino", "Chihuahua", 10, 100.5)
    ));
    
    static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        asignarPerros();
        
        mostrarDatos();
    }
    
    public static void asignarPerros() {
        String nombrePerro = "";
        boolean perroEncontrado = true;
        
        for (Persona persona : personas) {
            System.out.println("¿Qué perro de la siguiente lista le quieres asignar a " + persona.getNombre() + "?");
            
            for (Perro perro : perros) {
                System.out.println(perro.toString());                
            }
            
            nombrePerro = scan.nextLine();
                        
            for (Perro perro : perros) {
                if (nombrePerro.equals(perro.getNombre())) {
                    persona.setPerro(perro);
                    perroEncontrado = true;
                    perros.remove(perro);
                    System.out.println(nombrePerro + " fue removido de la lista");
                    break;
                } else {
                    perroEncontrado = false;
                }
            }
            
            if (!perroEncontrado) {
                System.out.println("No se encontró el perro con nombre " + nombrePerro);
            }
            System.out.println("");
        }
    }
    
    public static void mostrarDatos() {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
                
    }
    
    
    
}
