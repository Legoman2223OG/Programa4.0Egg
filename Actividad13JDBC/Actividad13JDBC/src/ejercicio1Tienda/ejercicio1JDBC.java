/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1Tienda;

import java.util.Scanner;
import tienda.servicios.fabricanteServicio;
import tienda.servicios.productoServicio;

/**
 *
 * @author mi tamura
 */
public class ejercicio1JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        productoServicio pSv= new productoServicio();
        fabricanteServicio fSv= new fabricanteServicio();
        Scanner sc= new Scanner(System.in);
        String eleccion,nombre;
        int codigo=0,codigoFabricante=0;
        double precio=0;
        while(true){
            System.out.println("MENU DE TIENDA\n"
                              +"---------------------------------\n"
                              +"\n1- Nombre de todos los productos"
                              +"\n2- Nombre y precio de todos los productos"
                              +"\n3- Productos entre el precio 120 y 202"
                              +"\n4- Productos que son Computadoras Portatíles"
                              +"\n5- Producto mas barato"
                              +"\n6- Ingresar nuevo producto"
                              +"\n7- Ingresar nuevo fabricante"
                              +"\n8- Editar un producto"
                              +"\n9- Salir"
            );
            eleccion = sc.next();
            switch(eleccion){
                case "1"-> pSv.NombreDeTodosLosProductos();
                case "2"-> pSv.NombreYPrecioDeTodosLosProductos();
                case "3"-> pSv.ProductosPorRangoEntrePrecio(120, 202);
                case "4"-> pSv.ProductosQueSonPortatiles();
                case "5"-> pSv.ProductoMasBarato();
                case "6"-> {
                    System.out.println("Ingrese un nombre de producto: ");
                    sc.nextLine();
                    nombre = sc.nextLine();
                    System.out.println("Ingrese el codigo de producto: ");
                    codigo= sc.nextInt();
                    System.out.println("Ingrese el codigo de fabricante del producto: ");
                    codigoFabricante = sc.nextInt();
                    System.out.println("Ingrese el precio del producto: ");
                    precio = sc.nextDouble();
                    try{
                        pSv.crearProducto(codigo, codigoFabricante, nombre, precio);
                    }
                    catch(Exception e){
                        System.out.println("No se pudo crear el producto."
                                           +"\nRazon: "+e.getMessage());
                    }
                }
                case "7"->{
                    sc.nextLine();
                    System.out.println("Ingrese el nombre del fabricante: ");
                    nombre = sc.nextLine();
                    
                    System.out.println("Ingrese el codigo del fabricante: ");
                    codigo= sc.nextInt();
                    try{
                       fSv.crearFabricante(nombre, codigo);
                    }
                    catch(Exception e){
                        System.out.println("No se pudo crear el fabricante."
                                           +"\nRazon: "+e.getMessage());
                    }
                }
                case "8"->{
                    System.out.println("Elige un codigo de producto a modificar: ");
                    codigo= sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el nuevo nombre del producto: ");
                    nombre= sc.nextLine();
                    System.out.println("Ingrese el nuevo codigo de fabricante del producto: ");
                    codigoFabricante = sc.nextInt();
                    System.out.println("Ingrese el nuevo precio del producto: ");
                    precio= sc.nextDouble();
                    try{
                        pSv.modificarProducto(codigo, codigoFabricante, nombre, precio);
                    }
                    catch(Exception e){
                        System.out.println("No se pudo modificar el producto."
                                           +"\nRazon: "+e.getMessage());
                    }
                }
                case "9"->{
                    System.out.println("Saliendo del sistema.");
                }
                default ->{
                    System.out.println("No es una opcion valida, eliga de nuevo.");
                }
            }
            if(eleccion.equals("9")) break;
        }
    }
}
