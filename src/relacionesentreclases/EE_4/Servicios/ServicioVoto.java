/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_4.Servicios;

import java.util.ArrayList;
import relacionesentreclases.EE_4.Entidades.Alumno;

/**
 *
 * @author javie
 */
public class ServicioVoto {
    
    public ArrayList<Alumno> generarAlumnosVotados(Alumno alumno, ArrayList<Alumno> alumnos) {
        ArrayList<Alumno> alumnosVotados = new ArrayList<Alumno>();

        for (int i = 0; i < 3; i++) {
            boolean cumpleValidaciones = true;

            do {
                // System.out.println("Bucle infinito");
                int rand = (int) (Math.random() * alumnos.size());

                if (votaPorSiMismo(alumno, alumnos.get(rand))
                        || alumnoYaVotado(alumnos.get(rand), alumnosVotados)) {

                    cumpleValidaciones = false;

                } else {
                    alumnos.get(rand).setCantidadVotos(alumnos.get(rand).getCantidadVotos() + 1);
                    alumnosVotados.add(alumnos.get(rand));
                    cumpleValidaciones = true;
                }
            } while (!cumpleValidaciones);
        }

        return alumnosVotados;
    }
    
    // Regresa verdadero si el alumno esta votando por si mismo
    private boolean votaPorSiMismo(Alumno alumnoVotante, Alumno alumnoEvaluado) {
        boolean estaVotandoPorSi = false;
        
        if (alumnoVotante.getDNI().equals(alumnoEvaluado.getDNI())) estaVotandoPorSi = true;
        
        return estaVotandoPorSi;
    }
    
    // Regresa verdadero si el alumno evaluado ya fue votado antes por el alumno votante 
    private boolean alumnoYaVotado(Alumno alumnoEvaluado, ArrayList<Alumno> alumnosVotados) {
        boolean yaFueVotado = false;
        
        for (Alumno alumnoVotado : alumnosVotados) {
            if (alumnoVotado.getDNI().equals(alumnoEvaluado.getDNI())) {
                yaFueVotado = true;
                break;
            }
        }
        
        return yaFueVotado;
    }
}
