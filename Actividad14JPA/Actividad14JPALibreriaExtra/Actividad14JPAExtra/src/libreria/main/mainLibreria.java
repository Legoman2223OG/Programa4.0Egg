/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria.main;

import java.util.Collection;
import java.util.Date;
import java.util.Scanner;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.servicios.AutorServicio;
import libreria.servicios.ClienteServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;

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
        PrestamoServicio pSv= new PrestamoServicio();
        ClienteServicio cSv= new ClienteServicio();
        LibroServicio lSv= new LibroServicio();
        EditorialServicio eSv= new EditorialServicio();
        AutorServicio aSv= new AutorServicio();
        Scanner sc= new Scanner(System.in);
        String nombre,titulo,opcion,eleccion,apellido,telefono;
        int id=0,anio=0,ejemplares=0,ejemplaresPrestados=0,ejemplaresRestantes=0,idautor=0,ideditorial=0,idlibro=0,idcliente=0;
        int mes=0,dia=0,idprestamo=0;
        boolean alta;
        long isbn=0,documento=0;
        Date fechaPrestamo,fechaDevolucion;
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
                             "\n8- Ingresar nuevo cliente"+
                             "\n9- Ingresar nuevo prestamo de un libro"+
                             "\n10- Devolver un libro"+
                             "\n11- Mostrar prestamos de un cliente por su id"+
                             "\n12- Salir"+
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
                    System.out.println("Ingrese el id del autor: ");
                    idautor= sc.nextInt();
                    System.out.println("Ingrese el id de la editorial: ");
                    ideditorial= sc.nextInt();
                    try{
                        lSv.CrearLibro(isbn, titulo, anio, ejemplares, idautor, ideditorial);
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
                    
                    System.out.println("Ingrese el id del cliente: ");
                    id = sc.nextInt();
                    System.out.println("Ingrese el documento del cliente (8 digitos): ");
                    documento = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Ingrese el nombre del cliente: ");
                    nombre= sc.nextLine();
                    System.out.println("Ingrese el apellido del cliente: ");
                    apellido= sc.nextLine();
                    System.out.println("Ingrese el telefono del cliente: ");
                    telefono= sc.nextLine();
                    try{
                        cSv.CrearCliente(id, documento, nombre, apellido, telefono);
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                case "9"->{
                    System.out.println("Ingrese el id del prestamo: ");
                    id= sc.nextInt();
                    System.out.println("Ingrese el año de la fecha de prestamo (YYYY): ");
                    anio= sc.nextInt();
                    System.out.println("Ingrese el mes de la fecha de prestamo (MM): ");
                    mes= sc.nextInt();
                    System.out.println("Ingrese el dia de la fecha de prestamo (DD): ");
                    dia= sc.nextInt();
                    fechaPrestamo= new Date((anio-1900),mes,dia);
                    System.out.println("Ingrese el año de la fecha de devolucion (YYYY): ");
                    anio= sc.nextInt();
                    System.out.println("Ingrese el mes de la fecha de devolucion (MM): ");
                    mes= sc.nextInt();
                    System.out.println("Ingrese el dia de la fecha de devolucion (DD): ");
                    dia= sc.nextInt();
                    fechaDevolucion= new Date((anio-1900),mes,dia);
                    System.out.println("Ingrese el id del libro: ");
                    idlibro= sc.nextInt();
                    System.out.println("Ingrese el id del cliente: ");
                    idcliente= sc.nextInt();
                    try{
                        pSv.CrearPrestamo(id, fechaPrestamo, fechaDevolucion, idlibro, idcliente);
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    
                }
                case "10"->{
                    System.out.println("Ingrese la id del prestamo: ");
                    idprestamo= sc.nextInt();
                    try{
                        pSv.DevolverLibro(idprestamo);
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                case "11"->{
                    System.out.println("Ingrese el id del cliente: ");
                    idcliente= sc.nextInt();
                    Collection<Prestamo> listaPrestamos= pSv.BuscarPrestamosDeUnClientePorSuId(idcliente);
                    if(listaPrestamos == null)
                        System.out.println("No se pudo conseguir la lista de prestamos del cliente");
                    else{
                        listaPrestamos.forEach(t -> System.out.println(t));
                    }
                }
                case "12"->{
                    System.out.println("Saliendo del sistema...");
                }
                default->{
                    System.out.println("No elegiste una opcion valida, intenta de nuevo");
                }
            }
            if(opcion.equals("12"))
                break;
        }
    }
    
}
