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
public class Ejercicio11cantdigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escribir un programa que lea un número entero y devuelva 
        el número de dígitos que componen ese número. Por ejemplo, 
        si introducimos el número 12345, el programa deberá devolver 5. 
        Calcular la cantidad de dígitos matemáticamente utilizando el operador 
        de división. Nota: recordar que las variables de tipo entero truncan 
        los números o resultados.
        */
        int digitos=0;
        System.out.println("Introduzca un numero");
        int numero= new Scanner(System.in).nextInt();
        while(numero>0){
            numero/=10;
            digitos++;
        }
        System.out.println("La cantidad de digitos que tiene el numero es de: "+digitos);
    }
    
}
