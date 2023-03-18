/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra4;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio1Sumaelementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un algoritmo que calcule la suma de todos los elementos 
        de un vector de tamaño N, con los valores ingresados por el usuario.
        */
        int suma=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un tamaño para el vector");
        int maxTam= sc.nextInt();
        int[] vectorNumeros= new int[maxTam];
        for(int i=0;i<vectorNumeros.length;i++){
            System.out.println("Ingrese un numero para el vector");
            vectorNumeros[i]= sc.nextInt();
        }
        for(int i=0;i<vectorNumeros.length;i++){
            suma+=vectorNumeros[i];
        }
        System.out.println("La suma total de todos los elementos es: "+suma);
    }
    
}
