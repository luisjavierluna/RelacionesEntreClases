/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;

import java.util.Scanner;
import relacionesentreclases.EP_3.CartaEspanolaServicio;

/**
 *
 * @author javie
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CartaEspanolaServicio ces = new CartaEspanolaServicio();
       Scanner scan = new Scanner(System.in).useDelimiter("\n");
       int eleccion;
       boolean valida = false;
       
       ces.inicializarBaraja();
       
       System.out.println("¿Qué acción quieres realizar? (elige un número del 1 al 7)");
       
        do {
            System.out.println("" +
                    "1. Barajar\n" +
                    "2. Siguiente Carta\n" +
                    "3. Cartas Disponibles\n" +
                    "4. Dar Cartas\n" +
                    "5. Cartas Montón\n" +
                    "6. Mostrar Baraja\n" +
                    "7. Terminar Juego\n"
            );
            eleccion = scan.nextInt();
            
            switch(eleccion) {
                case 1:
                    ces.barajar();
                    break;
                case 2:
                    ces.siguienteCarta();
                    break;
                case 3:
                    ces.cartasDisponibles();
                    break;
                case 4:
                    System.out.println("¿Cúantas cartas quieres?");
                    int cartasPedidas = scan.nextInt();
                    
                    ces.darCartas(cartasPedidas);
                    break;
                case 5:
                    ces.cartasMonton();
                    break;
                case 6:
                    ces.mostrarBaraja();
                    break;
                case 7:
                    valida = true;
                    System.out.println("El juego ha sido terminado");
                    break;
                default:
                     System.out.println("No se eligio una opción válida, vuelve a intentarlo");
                     valida = false;
            }
        } while (!valida);
        
       
             
    } 
}
