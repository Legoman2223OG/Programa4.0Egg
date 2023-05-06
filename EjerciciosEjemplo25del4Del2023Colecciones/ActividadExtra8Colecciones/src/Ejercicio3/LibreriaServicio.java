/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
class LibreriaServicio {
    Scanner sc= new Scanner(System.in);
    public HashSet<Libro> crearLibreria(){
        HashSet<Libro> libreria= new HashSet();
        String titulo,autor,opcion;
        int nroEjemplar,nroEjemplarPrestado;
        while(true){
            System.out.println("Ingrese el titulo del libro: ");
            titulo= sc.nextLine();
            System.out.println("Ingrese el autor del libro: ");
            autor= sc.nextLine();
            System.out.println("Ingrese el numero de ejemplares: ");
            nroEjemplar= sc.nextInt();
            System.out.println("Ingrese el numero de ejemplares prestados: ");
            nroEjemplarPrestado= sc.nextInt();
            System.out.println("¿Quiere seguir ingresando libros? (S/N): ");
            opcion= sc.next();
            sc.nextLine();
            libreria.add(new Libro(titulo,autor,nroEjemplar,nroEjemplarPrestado));
            if(opcion.equalsIgnoreCase("N")) break;
            
            
        }
        
        return libreria;
    }
    public boolean prestamo(HashSet<Libro> lista){
        System.out.println("Elija el libro para pedir un prestamo: ");
        String titulo= sc.nextLine();
        for(Libro libro: lista){
            if(libro.getTitulo().equals(titulo) && (libro.getNroEjemplaresPrestados()<libro.getNroEjemplares())){
                libro.setNroEjemplaresPrestados(libro.getNroEjemplaresPrestados()+1);
                return true;
            }
            else if(libro.getTitulo().equals(titulo) && (libro.getNroEjemplaresPrestados()==libro.getNroEjemplares()))
                return false;
        }
        return false;
    }
    public boolean devolucion(HashSet<Libro> lista){
        System.out.println("Elija el libro para devolverlo: ");
        String titulo= sc.nextLine();
        for(Libro libro: lista){
            if(libro.getTitulo().equals(titulo) && (libro.getNroEjemplaresPrestados()>0)){
                libro.setNroEjemplaresPrestados(libro.getNroEjemplaresPrestados()-1);
                return true;
            }
            else if(libro.getTitulo().equals(titulo) && (libro.getNroEjemplaresPrestados()<=0))
                return false;
        }
        return false;
    }
    public void MostrarLibros(HashSet<Libro> libreria){
        System.out.println("Libros de la libreria: ");
        for(Libro libro: libreria){
            System.out.println(libro);
        }
    }
}
