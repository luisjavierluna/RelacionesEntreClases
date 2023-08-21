/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_4.Entidades;

import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class Voto {
    private Alumno alumnoVotante;
    private ArrayList<Alumno> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumno alumnoVotante, ArrayList<Alumno> alumnosVotados) {
        this.alumnoVotante = alumnoVotante;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }

    public ArrayList<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnoVotante(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
    }

    public void setAlumnosVotados(ArrayList<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return "\n" + alumnoVotante + "\n"
                + "Ha votado por los siguientes alumnos: \n"
                + alumnosVotados + "\n";
    }
    
    
    
}
