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
public class Ejercicio5rcydobleytriple {
    /*
    Escribir un programa que lea un número entero por teclado 
    y muestre por pantalla el doble, 
    el triple y la raíz cuadrada de ese número. 
    */
    public static void main(String[] args){
        System.out.println("Introduzca un numero");
        int num= new Scanner(System.in).nextInt();
        System.out.println("El doble de este numero es: "+num*2+"\nEl triple del numero es: "+num*3+"\nLa raiz cuadrada del numero es: "+Math.sqrt(num));
    }
}
