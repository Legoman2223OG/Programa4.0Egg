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
public class Ejercicio4RellenarYTransponerMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un programa que rellene un matriz de 4 x 4 
        de valores aleatorios y muestre la traspuesta de la matriz.
        La matriz traspuesta de una matriz A se denota por B y se obtiene 
        cambiando sus filas por columnas (o viceversa).
        */
        int[][] matrizNumeros= new int[3][3];
        for(int i=0;i<matrizNumeros.length;i++){
            for(int z=0;z<matrizNumeros.length;z++){
                matrizNumeros[i][z]= (int)(Math.random()*9.9);
            }
        }
        System.out.println("Matriz A");
        System.out.println("---------");
        for(int i=0;i<matrizNumeros.length;i++){
            
            for(int z=0;z<matrizNumeros.length;z++){
                System.out.print("|"+matrizNumeros[i][z]+"|");
            }
            System.out.println("");
            System.out.println("---------");
        }
        System.out.println("Matriz B");
        System.out.println("---------");
        for(int i=0;i<matrizNumeros.length;i++){
            
            for(int z=0;z<matrizNumeros.length;z++){
                System.out.print("|"+matrizNumeros[z][i]+"|");
            }
            System.out.println("");
            System.out.println("---------");
        }
    }
    
}
