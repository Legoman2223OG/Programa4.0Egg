/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios4;

/**
 *
 * @author mi tamura
 */
public class Ejercicio1RellenarVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un algoritmo que llene un vector con los 100 
        primeros números enteros y los muestre por pantalla en 
        orden descendente.
        */
        int[] numeros= new int[100];
        for(int i=0;i<numeros.length;i++){
            numeros[i]+=i+1;
        }
        System.out.println("Numeros: ");
        for(int i=0;i<numeros.length;i++){
            System.out.println("-"+numeros[i]);
        }
    }
    
}
