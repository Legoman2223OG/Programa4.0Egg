/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria.main;

import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;
/**
 *
 * @author mi tamura
 */
public class mainLibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LibroServicio lSv= new LibroServicio();
        EditorialServicio eSv= new EditorialServicio();
        AutorServicio aSv= new AutorServicio();
        Scanner sc= new Scanner(System.in);
        String nombre,titulo,opcion,eleccion;
        int id=0,anio=0,ejemplares=0,ejemplaresPrestados=0,ejemplaresRestantes=0,idautor=0,ideditorial=0;
        boolean alta;
        long isbn=0;
        while(true){
            System.out.println("----------------------------------"+
                             "\n        MENU LIBRERIA             "+
                             "\n1- Ingresar nuevo Autor"+
                             "\n2- Ingresar nueva Editorial"+
                             "\n3- Ingresar nuevo Libro"+
                             "\n4- Buscar libro por codigo ISBN"+
                             "\n5- Buscar libro por titulo"+
                             "\n6- Buscar libros por nombre de autor"+
                             "\n7- Buscar libros por nombre de editorial"+
                             "\n8- Dar de baja a un libro"+
                             "\n9- Dar de baja a un autor"+
                             "\n10- Dar de baja a una editorial"+
                             "\n11- Salir"+
                             "\n----------------------------------");
            opcion= sc.next();
            switch(opcion){
                case "1"->{
                    System.out.println("Ingrese una id para el autor: ");
                    id= sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese un nombre para el autor: ");
                    nombre = sc.nextLine();
                    try{
                        aSv.CrearAutor(nombre, id);
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                case "2"->{
                    System.out.println("Ingrese una id para la editorial: ");
                    id= sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese un nombre para la editorial: ");
                    nombre = sc.nextLine();
                    try{
                        eSv.CrearEditorial(nombre, id);
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                case "3"->{
                    System.out.println("Ingrese un ISBN para el libro: ");
                    isbn= sc.nextLong();
                    sc.nextLine();
                    System.out.println("Ingrese un titulo para el libro: ");
                    titulo= sc.nextLine();
                    System.out.println("Ingrese un ano para el libro: ");
                    anio = sc.nextInt();
                    System.out.println("Ingrese el numero de ejemplares para el libro: ");
                    ejemplares= sc.nextInt();
                    System.out.println("Ingrese el numero de ejemplares prestados para el libro: ");
                    ejemplaresPrestados= sc.nextInt();
                    System.out.println("Ingrese el numero de ejemplares restantes para el libro: ");
                    ejemplaresRestantes= sc.nextInt();
                    System.out.println("Ingrese el id del autor: ");
                    idautor= sc.nextInt();
                    System.out.println("Ingrese el id de la editorial: ");
                    ideditorial= sc.nextInt();
                    try{
                        lSv.CrearLibro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, idautor, ideditorial);
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                case "4"->{
                    System.out.println("Ingrese el isbn de el libro a buscar: ");
                    isbn= sc.nextLong();
                    System.out.println(lSv.BuscarLibroPorISBN(isbn)==null?"No se pudo encontrar el libro":lSv.BuscarLibroPorISBN(isbn));
                }
                case "5"->{
                    sc.nextLine();
                    System.out.println("Ingrese el titulo del libro a buscar: ");
                    titulo= sc.nextLine();
                    System.out.println(lSv.BuscarLibroPorTitulo(titulo)==null?"No se pudo encontrar el libro":lSv.BuscarLibroPorTitulo(titulo));
                }
                case "6"->{
                    sc.nextLine();
                    System.out.println("Ingrese el nombre del autor para buscar sus libros: ");
                    nombre = sc.nextLine();
                    Collection<Libro> listaLibros=  lSv.BuscarLibroPorNombreDeAutor(nombre);
                    if(listaLibros == null)
                        System.out.println("No se pudo encontrar algun libro de este autor");
                    else{
                        listaLibros.forEach(t ->{
                            if(!t.isAlta())
                                System.out.println(t);
                        });
                    }
                }
                case "7"->{
                    sc.nextLine();
                    System.out.println("Ingrese el nombre de la editorial para buscar sus libros: ");
                    nombre = sc.nextLine();
                    Collection<Libro> listaLibros= lSv.BuscarLibroPorNombreDeEditorial(nombre);
                    if(listaLibros == null)
                        System.out.println("No se pudo encontrar algun libro de este autor");
                    else{
                        listaLibros.forEach(t ->{
                            if(!t.isAlta())
                                System.out.println(t);
                        });
                    }
                }
                case "8"->{
                    sc.nextLine();
                    System.out.println("Eliga si quiere dar de alta (S) o revocar la alta del libro (S/N)");
                    eleccion= sc.next();
                    System.out.println("Ingrese el ISBN de el libro");
                    isbn= sc.nextLong();
                    lSv.DarDeAltaLibro(isbn, eleccion.equalsIgnoreCase("S"));
                    
                }
                case "9"->{
                    sc.nextLine();
                    System.out.println("Eliga si quiere dar de alta (S) o revocar la alta del libro (S/N)");
                    eleccion= sc.next();
                    System.out.println("Ingrese el id de el autor");
                    id= sc.nextInt();
                    aSv.DarDeAltaAutor(id, eleccion.equalsIgnoreCase("S"));
                    
                }
                case "10"->{
                    sc.nextLine();
                    System.out.println("Eliga si quiere dar de alta (S) o revocar la alta de la editorial (S/N)");
                    eleccion= sc.next();
                    System.out.println("Ingrese el id de la editorial");
                    id= sc.nextInt();
                    eSv.DarDeAltaEditorial(id, eleccion.equalsIgnoreCase("S"));
                    
                }
                case "11"->{
                    System.out.println("Saliendo del sistema...");
                }
                default->{
                    System.out.println("No elegiste una opcion valida, intenta de nuevo");
                }
            }
            if(opcion.equals("11"))
                break;
        }
    }
    
}
