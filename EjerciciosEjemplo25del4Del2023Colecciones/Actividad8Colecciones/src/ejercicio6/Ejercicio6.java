/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Se necesita una aplicación para una tienda en la cual queremos almacenar
        los distintos productos que venderemos y el precio que tendrán. Además, 
        se necesita que la aplicación cuente con las funciones básicas.
        Estas las realizaremos en el servicio. Como, introducir un elemento, 
        modificar su precio, eliminar un producto y mostrar los productos que 
        tenemos con su precio (Utilizar Hashmap). 
        El HashMap tendrá de llave el nombre del producto y de valor el precio.
        Realizar un menú para lograr todas las acciones previamente mencionadas.
        */
        Scanner sc= new Scanner(System.in);
        String eleccion;
        TiendaServicio tiendaSv= new TiendaServicio();
        HashMap<String,Double> tienda= new HashMap();
        while(true){
            System.out.println("--------------------------------"
                           + "\n          MENU DE TIENDA        "
                           + "\n--------------------------------"
                           + "\n1- Agregar Producto"
                           + "\n2- Modificar Precio Producto"
                           + "\n3- Eliminar Producto"
                           + "\n4- Mostrar Productos"
                           + "\n5- Salir");
            eleccion= sc.next();
            switch(eleccion){
                case "1":
                    tiendaSv.agregarProducto(tienda);
                    break;
                case "2":
                    tiendaSv.modificarPrecio(tienda);
                    break;
                case "3":
                    tiendaSv.eliminarProducto(tienda);
                    break;
                case "4":
                    tiendaSv.mostrarProductos(tienda);
                    break;
                case "5":
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Operacion equivocada, intente de nuevo");
            }
            if(eleccion.equals("5")) break;
        }
    }
    
}
