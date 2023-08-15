/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioPersona {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    List<Persona> personas = new ArrayList(Arrays.asList(
            new Persona("LUIS", "LUNA", 23, "111111111111"),
            new Persona("JAVIER", "ARELLANO", 33, "222222222222")
    ));

    List<Perro> perros = new ArrayList(Arrays.asList(
            new Perro("Scooby", "Gran Danés", 3, 30.5),
            new Perro("Solobino", "Chihuahua", 10, 120.5)
//            new Perro("Firulais", "Dogo", 7, 30.5),
//            new Perro("MrChispa", "Golden Retriver", 8, 130.5)
    ));
    
    List<Perro> perrosAdoptados = new ArrayList();
    
    private void asignarPerro(Persona persona) {
        String nombrePerro = "";
        boolean perroEncontrado = true;

        nombrePerro = scan.nextLine();

        for (Perro perro : perros) {
            if (nombrePerro.equals(perro.getNombre())) {
                persona.setPerro(perro);
                perroEncontrado = true;
                perrosAdoptados.add(perro);
                perros.remove(perro);
                System.out.println("¡FELICIDADES! acabas de adoptar a " + nombrePerro);
                break;
            } else {
                perroEncontrado = false;
            }
        }

        if (!perroEncontrado) {
            if (encontrarPerroAdoptado(nombrePerro)) {
                System.out.println(nombrePerro + " ya fue adoptado");
            } else {
                System.out.println("No se tiene registro de un perro con nombre " + nombrePerro);
            }
        }
        System.out.println("");
    }
       
    public void asignarPerros() {
        boolean adoptarOtroPerro = false;
        String respuesta = "";

        for (Persona persona : personas) {
            do {
                if (perros.size() <= 0) {
                    System.out.println("Lo sentimos " + persona.getNombre() + " no hay más perros para adoptar");
                    System.out.println("");
                    adoptarOtroPerro = false;
                } else {
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("¿Qué perro de la siguiente lista quiere adoptar " + persona.getNombre() + "?");
                    mostrarPerros();

                    asignarPerro(persona);

                    do {
                        System.out.println("¿Quieres adoptar otro perro? (si / no)");
                        respuesta = scan.nextLine();

                        switch (respuesta.toLowerCase()) {
                            case "si":
                                adoptarOtroPerro = true;
                                break;
                            case "no":
                                adoptarOtroPerro = false;
                                break;
                            default:
                                System.out.println("las únicas opciones válidas son si y no, vuelve a intentarlo");
                                break;
                        }
                    } while (!respuesta.equals("si")
                            && !respuesta.equals("no"));   
                }
            } while (adoptarOtroPerro);

        }
    }
    
    private boolean encontrarPerroAdoptado(String nombrePerro) {
        boolean fueAdoptado = false;

        for (Perro perro : perrosAdoptados) {
            if (nombrePerro.equals(perro.getNombre())) {
                fueAdoptado = true;
                break;
            }
        }

        return fueAdoptado;
    }

    public void mostrarDatos() {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }

    public void mostrarPerros() {
        for (Perro perro : perros) {
            System.out.println("-" + perro.toString());
        }
    }
    
}
