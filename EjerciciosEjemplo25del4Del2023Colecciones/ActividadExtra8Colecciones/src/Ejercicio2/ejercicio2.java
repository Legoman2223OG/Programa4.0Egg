/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
        */
        Scanner sc= new Scanner(System.in);
        String opcion;
        CantanteFamosoServicio cSv= new CantanteFamosoServicio();
        ArrayList<CantanteFamoso> cantantes= cSv.crearCantantes();
        while(true){
            System.out.println("-----MENU------"+
                               "\nEliga una opcion: "+
                               "\n1- Mostrar cantantes\n2- Agregar cantante\n3- Remover cantante\n4- Salir");
            opcion= sc.next();
            switch(opcion){
                case "1":
                    cSv.MostrarCantantes(cantantes);
                    break;
                case "2":
                    cSv.AgregarCantante(cantantes);
                    break;
                case "3":
                    cSv.EliminarCantante(cantantes);
                    break;
                case "4":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion incorrecta intente de nuevo");
            }
            if(opcion.equals("4")) break;
        }
        
    }
    
}
