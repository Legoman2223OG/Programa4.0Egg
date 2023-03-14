/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio4EsPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crea una aplicación que nos pida un número por teclado y con una función 
        se lo pasamos por parámetro para que nos indique si es o no un 
        número primo, debe devolver true si es primo, sino false.
        Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
        Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, 
        sin embargo, 17 si es primo.
        */
        System.out.println("Introduce un numero: ");
        int numero=new Scanner(System.in).nextInt();
        if(VerificarPrimo(numero)) System.out.println("Es un numero primo");
        else System.out.println("No es un numero primo");
    }
    private static boolean VerificarPrimo(int numero){
        if (numero == 0 || numero == 1 || numero == 4)
            return false;
        for (int x = 2; x < numero / 2; x++) {
             if (numero % x == 0)
                 return false;
        }
        return true;
    }
}
