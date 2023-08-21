/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_4.Entidades;

import java.util.ArrayList;
import java.util.Scanner;
import relacionesentreclases.EE_4.Servicios.ServicioAlumno;
import relacionesentreclases.EE_4.Servicios.ServicioVoto;

/**
 *
 * @author javie
 */
public class Simulador {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    ServicioAlumno sa = new ServicioAlumno();
    ServicioVoto sv = new ServicioVoto();

    // Generar nombres de alumnos
    private ArrayList<String> generarListadoNombres(int cantidadNombres) {
        ArrayList<String> listado = new ArrayList<String>();
        
        for (int i = 0; i < cantidadNombres; i++) listado.add(sa.generarNombreYApellido());
        
        return listado;
    }
    
    // Generar DNI's de alumnos
    private ArrayList<String> generarListadoDNI(int cantidadDNI) {
        ArrayList<String> listado = new ArrayList<String>();
        boolean DNIRepetido = false;
        String DNI;
        
        for (int i = 0; i < cantidadDNI; i++) {
            do {
                DNI = sa.generarDNI();
                
                if (listado.contains(DNI)) {
                    DNIRepetido = true;
                    
                    System.out.println("Repetído: " + DNI);
                }
                
            } while (DNIRepetido);
            
            listado.add(DNI);
        }
        
        return listado;
    }
    
    // Generar alumnos
    public ArrayList<Alumno> generarListadoAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> DNIs = new ArrayList<String>();        
        
        System.out.println("Ingresa la cantidad de alumnos que quieres generar");
        int cantidadAlumnos = scan.nextInt();
        
        nombres = generarListadoNombres(cantidadAlumnos);
        DNIs = generarListadoDNI(cantidadAlumnos);
        
        for (int i = 0; i < cantidadAlumnos ; i++) {
            Alumno alumno = new Alumno();
            alumno.setNombreCompleto(nombres.get(i));
            alumno.setDNI(DNIs.get(i));
            
            alumnos.add(alumno);
        }
        
        return alumnos;
    }
    
    // Imprimir listado de alumnos
    public void imprimirListadoAlumnos(ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) System.out.println(alumno.toString());
    }
    
    // Hacer que cada alumno vote por otros 3 alumnos
    public ArrayList<Voto> votacion(ArrayList<Alumno> alumnos) {
        ArrayList<Voto> votos = new ArrayList<Voto>();
        
        for (Alumno alumno : alumnos) {
            Voto voto = new Voto();
            
            // Se establece el alumno votante
            voto.setAlumnoVotante(alumno);
            
            // Se establecen los alumnos votados
            voto.setAlumnosVotados(sv.generarAlumnosVotados(alumno, alumnos));
            
            // Se genera el voto completo de cada alumno
            votos.add(voto);
        }
        
        return votos;
    }
    
    // Mostrar los votos de cada alumno
    public void mostrarVotos(ArrayList<Voto> votos) {
        System.out.println(votos.toString());
    }
    
    // Método recuento de votos, al parecer de cada alumno
    public void recuentoVotos(ArrayList<Alumno> alumnos) {
        alumnos.sort((a1, a2) -> a2.getCantidadVotos() - a1.getCantidadVotos());
        
        System.out.println("-----------------------Recuento de Votos-----------------------");
        System.out.println(alumnos.toString());
    }
    
    // Método crear facilitadores y facilitadores suplentes y mostrarlos
    public ArrayList<Alumno> crearFacilitadores(ArrayList<Alumno> alumnos) {
        ArrayList<Alumno> facilitadores = new ArrayList<Alumno>();
        
        int tamanioListado = alumnos.size() >= 10 ? 10 : alumnos.size();
        
        for (int i = 0; i < tamanioListado; i++)  facilitadores.add(alumnos.get(i));
            
        sa.mostrarFacilitadores(facilitadores);
        
        return facilitadores;
    }
}
