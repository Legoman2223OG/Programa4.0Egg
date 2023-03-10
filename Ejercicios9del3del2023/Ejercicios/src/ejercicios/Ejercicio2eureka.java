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
public class Ejercicio2eureka {
    public static void main(String[] args){
        /*
        Crear un programa que pida una frase y si esa frase es 
        igual a “eureka” el programa pondrá un mensaje de Correcto, 
        sino mostrará un mensaje de Incorrecto. Nota: investigar la 
        función equals() en Java.
        */
        String frase;
        System.out.println("Introduzca una frase");
        frase= new Scanner(System.in).next();
        if(frase.equalsIgnoreCase("eureka")) System.out.println("Correcto!");
        else System.out.println("Incorrecto");
    }
}
