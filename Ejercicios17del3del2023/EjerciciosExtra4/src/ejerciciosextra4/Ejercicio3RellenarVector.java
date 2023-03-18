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
public class Ejercicio3RellenarVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crear una función rellene un vector con números aleatorios, 
        pasándole un arreglo por parámetro. Después haremos otra función 
        o procedimiento que imprima el vector.
        */
        System.out.println("Introduce un tamaño para un vector");
        int tamMax= new Scanner(System.in).nextInt();
        int[] vector= new int[tamMax];
        vector= RellenarVector(vector);
        LeerVector(vector);
    }
    private static int[] RellenarVector(int[] arreglo){
        for(int i=0;i<arreglo.length;i++){
            arreglo[i]= (int)(Math.random()*10);
        }
        return arreglo;
    }
    private static void LeerVector(int[] arreglo){
        for(int i=0;i<arreglo.length;i++){
            System.out.print("|"+arreglo[i]+"| ");
        }
    }
}
