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
        /*
        Escribir un programa que pida dos números 
        enteros por teclado y calcule la suma de los dos. 
        El programa deberá después mostrar el resultado de la suma
        */
        int num1,num2;
        System.out.println("Ingrese el primer numero \n");
        num1= new Scanner(System.in).nextInt();
        System.out.println("Ingrese el segundo numero \n");
        num2= new Scanner(System.in).nextInt();
        int suma= num1+num2;
        System.out.println("La suma de los dos numeros es: "+suma);
    }
    
}
