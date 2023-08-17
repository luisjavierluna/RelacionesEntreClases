/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.EE_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author javie
 */
public class ServicioPelicula {
    private ArrayList<Pelicula> peliculas = new ArrayList<>(Arrays.asList(
            new Pelicula("Avatar",2009,10,"James Cameron"),
            new Pelicula("Avengers: Endgame",2019,11,"Anthony y Joe Russo"),
            new Pelicula("Avatar: The Way of Water",2022,12,"James Cameron"),
            new Pelicula("Titanic",1997,13,"James Cameron"),
            new Pelicula("Star Wars: Episodio VII - El despertar de la Fuerza",2015,14,"J. J. Abrams"),
            new Pelicula("Avengers: Infinity War",2018,15,"Anthony y Joe Russo"),
            new Pelicula("Spider-Man: No Way Home",2021,16,"Jon Watts"),
            new Pelicula("Jurassic World",2015,17,"Colin Trevorrow"),
            new Pelicula("El rey león",2019,18,"Jon Favreau"),
            new Pelicula("The Avengers",2012,19,"Joss Whedon")
    ));
    
    public Pelicula seleccionarPelicula() {
        Collections.shuffle(peliculas);
        return peliculas.get(0);
    }
}
