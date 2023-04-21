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
public class Ejercicio1paroimpar {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear un programa que dado un número determine si es par o impar.
        */
        int num;
        System.out.println("Introduzca un numero");
        num= new Scanner(System.in).nextInt();
        if(num % 2==0){
            System.out.println("El numero: "+num+" es par");
        }
        else{
            System.out.println("El numero: "+num+" es impar");
        }
    }
    
}
