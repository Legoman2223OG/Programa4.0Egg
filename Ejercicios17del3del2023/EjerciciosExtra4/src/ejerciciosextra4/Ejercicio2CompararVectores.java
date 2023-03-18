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
public class Ejercicio2CompararVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escriba un programa que averigüe si dos vectores de N enteros son iguales 
        (la comparación deberá detenerse en cuanto se detecte alguna diferencia 
        entre los elementos).
        */
        boolean iguales= false;
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba el tamaño de los vectores");
        int tamMax= sc.nextInt();
        int vec1[]= new int[tamMax];
        int vec2[]= new int[tamMax];
        for(int i=0;i<tamMax;i++){
            System.out.println("Ingrese el valor "+(i+1)+" para el vector 1");
            vec1[i]= sc.nextInt();
            System.out.println("Ingrese el valor "+(i+1)+" para el vector 2");
            vec2[i]= sc.nextInt();
        }
        for(int i=0;i<3;i++){
            iguales=vec1[i]==vec2[i];
        }
        System.out.println(iguales ? "Son iguales" : "No son iguales");
    }
    
}
