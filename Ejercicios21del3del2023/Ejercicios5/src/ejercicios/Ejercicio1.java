/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crear una clase llamada Libro que contenga los siguientes atributos: 
        ISBN, Título, Autor, Número de páginas, y un constructor con todos 
        los atributos pasados por parámetro y un constructor vacío. 
        Crear un método para cargar un libro pidiendo los datos al usuario 
        y luego informar mediante otro método el número de ISBN, el título, 
        el autor del libro y el número de páginas.
        */
        Libro libroNuevo= new Libro();
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce una ISBN para el libro (Total de digitos 10): ");
        do{
            libroNuevo.setISBN(sc.nextInt());
        }while(libroNuevo.getISBN()<=0);
        System.out.println("Introduce el titulo del libro: ");
        do{
            libroNuevo.setTitulo(sc.nextLine());
        }while(libroNuevo.getTitulo().equals(""));
        System.out.println("Introduce el autor del libro: ");
        do{
            libroNuevo.setAutor(sc.nextLine());
        }while(libroNuevo.getAutor().equals(""));
        System.out.println("Introduce la cantidad de paginas del libro: ");
        do{
            libroNuevo.setnPaginas(sc.nextInt());
        }while(libroNuevo.getnPaginas()<=0);
            
        System.out.println("Titulo del libro: "+libroNuevo.getTitulo()
        +"\nAutor del libro: "+libroNuevo.getAutor()
        +"\nNumero de paginas: "+libroNuevo.getnPaginas()
        +"\nISBN: "+libroNuevo.getISBN()
        );
    }
    
}
