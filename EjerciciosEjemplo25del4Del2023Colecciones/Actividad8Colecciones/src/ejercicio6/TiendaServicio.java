/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class TiendaServicio {
    public HashMap<String,Double> crearProductos(){
        HashMap<String,Double> tienda= new HashMap();
        String nombre,eleccion;
        double precio;
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Ingrese el nombre del producto: ");
            nombre= sc.next();
            System.out.println("Ingrese el precio del producto: ");
            precio= sc.nextDouble();
            tienda.put(nombre,precio);
            System.out.println("¿Desea seguir añadiendo mas productos? (S/N)");
            eleccion= sc.next();
            if(eleccion.equalsIgnoreCase("N")) break;
        }
        return tienda;
    }
    public void agregarProducto(HashMap<String,Double> tienda){
        Scanner sc= new Scanner(System.in);
        String nombreProd;
        double precio;
        System.out.println("Ingrese el nombre del nuevo producto: ");
        nombreProd= sc.next();
        System.out.println("Ingrese el precio del nuevo producto: ");
        precio= sc.nextDouble();
        if(tienda.containsKey(nombreProd)){
            System.out.println("Ese producto ya existe");
        }
        else{
            tienda.put(nombreProd, precio);
            System.out.println("Producto: "+nombreProd+" con precio de "+precio+" fue agregado con exito");
        }
    }
    public void modificarPrecio(HashMap<String,Double> tienda){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el producto a modificar su precio: ");
        String nombreProd= sc.next();
        if(tienda.containsKey(nombreProd)){
            System.out.println("Ingrese el nuevo precio: ");
            tienda.put(nombreProd, sc.nextDouble());
        }
        else{
            System.out.println("No pudimos encontrar tal producto");
        }
    }
    public void eliminarProducto(HashMap<String,Double> tienda){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el producto a eliminar: ");
        String nombreProd= sc.next();
        if(tienda.containsKey(nombreProd)){
            tienda.remove(nombreProd);
            System.out.println("Se elimino "+nombreProd);
        }
        else{
            System.out.println("No se encuentra tal producto");
        }
    }
    public void mostrarProductos(HashMap<String,Double> tienda){
        System.out.println("Lista de productos ");
        System.out.println("-------------------");
        for(Map.Entry<String,Double> prods:tienda.entrySet()){
            System.out.println("Producto: "+prods.getKey()+"\nPrecio: "+prods.getValue());
        }
        System.out.println("-------------------");
    }
}
