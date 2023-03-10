/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadejemplo;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class ActividadEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio 6
        Implementar un programa que le pida dos números enteros 
        al usuario y determine si ambos o alguno de ellos es mayor 
        a 25.
        */
        int num1,num2;
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1= scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2= scan.nextInt();
        
        if(num1>25&&num2>25){
            System.out.println("Ambos numeros son mayores a 25");
        }
        else if(num1>25||num2>25){
            System.out.println("Uno de los numeros es mayor a 25");
        }
        
        //Si quisieramos fijarnos anidariamos un if para saber cual es el mayor
        //Sino hacemos 1 else if num1> 25 y un else para comprobar que el otro
        //Lo es
    }
    
}
