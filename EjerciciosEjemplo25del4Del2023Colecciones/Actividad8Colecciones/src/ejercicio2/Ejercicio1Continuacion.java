/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio1Continuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Continuando el ejercicio anterior, después de mostrar los perros, al 
        usuario se le pedirá un perro y se recorrerá la lista con un Iterator, 
        se buscará el perro en la lista. Si el perro está en la lista, se 
        eliminará el perro que ingresó el usuario y se mostrará la lista
        ordenada. Si el perro no se encuentra en la lista, se le informará al 
        usuario y se mostrará la lista ordenada.
        */
        String eleccion="";
        Scanner sc= new Scanner(System.in);
        ArrayList<String> razasDePerro= new ArrayList();
        while(true){
            System.out.println("Ingrese una raza de perro");
            razasDePerro.add(sc.next());
            System.out.println("Desea continuar? (SI/NO)");
            eleccion= sc.next();
            if(eleccion.equalsIgnoreCase("NO")) break;
        }
        System.out.println("LISTA DE RAZAS DE PERRO: ");
        for(String nombreRaza: razasDePerro){
            System.out.println(nombreRaza);
        }
        System.out.println("Ingrese una raza de perro a borrar: ");
        String eleccionBorrar= sc.next();
        Iterator it= razasDePerro.iterator();
        boolean encontrado=false;
        while(it.hasNext()){
            if(it.next().equals(eleccionBorrar)){
                encontrado=true;
                System.out.println("Se borro: "+eleccionBorrar);
                it.remove();
            }
        }
        if(!encontrado){
            System.out.println("No se encontro la raza");
        }
        razasDePerro.sort((p1,p2)-> p1.compareTo(p2));
        System.out.println("LISTA DE RAZAS DE PERRO EN ORDEN: ");
        for(String nombreRaza: razasDePerro){
            System.out.println(nombreRaza);
        }
    }
    
}
