/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios4;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio2VectorNRepetidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un algoritmo que llene un vector de tamaño N con valores 
        aleatorios y le pida al usuario un número a buscar en el vector. 
        El programa mostrará dónde se encuentra el numero y si se encuentra 
        repetido
        */
        int cont,indice;
        boolean numEncontrado=false;
        indice=0;
        cont=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese una cantidad de espacios para el vector de numeros");
        int cantMax= sc.nextInt();
        int numeros[]= new int[cantMax];
        for(int i=0;i<numeros.length;i++){
            numeros[i]+=(int)(Math.random()*10);
            System.out.println(numeros[i]);
        }
        System.out.println("Ingrese algun numero a buscar en el vector");
        int numBuscar= sc.nextInt();
        for(int i=0;i<numeros.length;i++){
            if(!numEncontrado && numeros[i]==numBuscar){
                indice=numeros[i];
                numEncontrado=true;
            }
            if(numEncontrado && numeros[i]==numBuscar) cont++;
            
        }
        if(numEncontrado) System.out.println("El indice del numero " + numBuscar+
                " es: "+indice+" y tiene "+ cont+" repeticiones");
        else System.out.println("No se encontro el numero...");
    }
    
}
