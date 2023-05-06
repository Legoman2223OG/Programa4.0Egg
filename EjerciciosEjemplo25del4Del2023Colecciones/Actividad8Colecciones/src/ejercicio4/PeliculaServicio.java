/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class PeliculaServicio {
    public ArrayList<Pelicula> crearPeliculas(){
        ArrayList<Pelicula> cinema= new ArrayList();
        Scanner sc= new Scanner(System.in);
        String confirmacion,nombre,director;
        Integer duracionpeli;
        while(true){
            System.out.println("Ingrese el titulo de la pelicula: ");
            nombre= sc.nextLine();
            System.out.println("Ingrese el nombre del director: ");
            director= sc.nextLine();
            System.out.println("Ingrese la duracion de la peli: ");
            duracionpeli= new Integer(sc.nextInt());
            cinema.add(new Pelicula(nombre,director,duracionpeli));
            System.out.println("¿Desea seguir creando peliculas? (S/N): ");
            confirmacion= sc.next();
            sc.nextLine();
            if(confirmacion.equalsIgnoreCase("N")) break;
        }
        return cinema;
    }
    public void MostrarPeliculas(ArrayList<Pelicula> cinema){
        System.out.println("LISTA PELICULAS");
        System.out.println("---------------");
        for(Pelicula peli:cinema){
            System.out.println(peli.getTitulo());
        }
        System.out.println("---------------");
    }
    public void MostrarPelisMayor1Hora(ArrayList<Pelicula> cinema){
        System.out.println("LISTA PELICULAS MAYOR A 1 HORA");
        System.out.println("------------------------------");
        for(Pelicula peli:cinema){
            if(peli.getDuracionPeli()>1) System.out.println(peli.getTitulo());
        }
        System.out.println("------------------------------");
    }
    public void MostrarMayorAMenorDuracion(ArrayList<Pelicula> cinema){
        cinema.sort(Pelicula.compararMayorDuracion);
        System.out.println("LISTA PELICULAS DE MAYOR DURACION A MENOR DURACION");
        System.out.println("------------------------------");
        for(Pelicula peli:cinema){
            System.out.println(peli.getTitulo());
        }
        System.out.println("------------------------------");
    }
    public void MostrarMenorAMayorDuracion(ArrayList<Pelicula> cinema){
        cinema.sort(Pelicula.compararMenorDuracion);
        System.out.println("LISTA PELICULAS DE MENOR DURACION A MAYOR DURACION");
        System.out.println("------------------------------");
        for(Pelicula peli:cinema){
            System.out.println(peli.getTitulo());
        }
        System.out.println("------------------------------");
    }
    public void MostrarAlfabeticamente(ArrayList<Pelicula> cinema){
        cinema.sort(Pelicula.compararAlfabeticamente);
        System.out.println("LISTA PELICULAS ORDENADA ALFABETICAMENTE");
        System.out.println("------------------------------");
        for(Pelicula peli:cinema){
            System.out.println(peli.getTitulo());
        }
        System.out.println("------------------------------");
    }
    public void MostrarDirectoresAlfabeticamente(ArrayList<Pelicula> cinema){
        cinema.sort(Pelicula.compararDirectorAlfabeticamente);
        System.out.println("LISTA DIRECTORES ALFABETICAMENTE");
        System.out.println("------------------------------");
        for(Pelicula peli:cinema){
            System.out.println(peli.getDirector());
        }
        System.out.println("------------------------------");
    }
}
