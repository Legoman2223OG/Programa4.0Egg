/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra2;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio3letravocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Elaborar un algoritmo en el cuál se ingrese una letra 
        y se detecte si se trata de una vocal. Caso contrario 
        mostrar un mensaje. Nota: investigar la función equals() 
        de la clase String.
        */
        System.out.println("Ingrese una letra");
        String letra= new Scanner(System.in).next();
        if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||
        letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||
                letra.equalsIgnoreCase("u"))
            System.out.println("Es una vocal");
        else System.out.println("No es vocal");
    }
    
}
