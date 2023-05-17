/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2extra;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class PeliculaServicio {
    Scanner sc= new Scanner(System.in);
    public Pelicula crearPelicula(){
        String titulo,director;
        int edadminima,duracion;
        System.out.println("Ingrese el titulo de la pelicula: ");
        titulo= sc.nextLine();
        System.out.println("Ingrese el director de la pelicula: ");
        director= sc.nextLine();
        System.out.println("Ingrese la duracion de la pelicula: ");
        duracion= sc.nextInt();
        System.out.println("Ingrese la edad minima para ver la pelicula: ");
        edadminima= sc.nextInt();
        return new Pelicula(titulo,director,duracion,edadminima);
    }
}
