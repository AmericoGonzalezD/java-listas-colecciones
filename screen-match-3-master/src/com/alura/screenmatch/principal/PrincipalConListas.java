package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Avatar",2023);
        otraPelicula.evalua(3);
        var peliculaDeAmerico = new Pelicula("El señor de los anillos",2001);
        peliculaDeAmerico.evalua(8);
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<>();//<>Tipo de dato de la lista
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeAmerico);
        lista.add(lost);

        //iterar la lista

        for (Titulo item:lista){//foreach para iterar a una lista
            //Pelicula pelicula=(Pelicula)item;//fuerzo a que se convierta en otra clase
            if(item instanceof Pelicula pelicula ){//si la instancia es de tipo pelicula y crea vaable de referencia

                System.out.println(pelicula.getClasificacion());
            }

        }

        List<String> listaDeArtistas = new LinkedList<>();
        listaDeArtistas.add("Americo");
        listaDeArtistas.add("Juan");
        listaDeArtistas.add("Alberto");
        listaDeArtistas.add("Maria");
        listaDeArtistas.add("Esmeralda");


        System.out.println("Lista de artistas no ordenadas"+listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenadas"+listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista ordenada de titulos ordenados: "+lista);

        //se le pasa un comparator a sort que es una interfaz al que se le pasa la fecha de lanzamiento
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: "+lista);
    }
}
