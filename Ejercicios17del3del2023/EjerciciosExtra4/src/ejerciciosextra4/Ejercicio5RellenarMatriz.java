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
public class Ejercicio5RellenarMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un programa que llene una matriz de tamaño NxM con 
        valores aleatorios y muestre la suma de sus elementos.
        */
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la cant de filas de la matriz");
        int maxFilas= sc.nextInt();
        System.out.println("Ingrese la cant de columnas de la matriz");
        int maxCol= sc.nextInt();
        int[][] matriz= new int[maxFilas][maxCol];
        matriz= RellenarMatriz(matriz,maxFilas,maxCol);
        LeerMatriz(matriz,maxFilas,maxCol);
    }
    private static int[][] RellenarMatriz(int[][] mat,int maxF,int maxC){
        for(int i=0;i<maxF;i++){
            for(int z=0;z<maxC;z++){
                mat[i][z]= (int)(Math.random()*10);
            }
        }
        return mat;
    }
    private static void LeerMatriz(int[][] mat,int maxF,int maxC){
        for(int i=0;i<maxF;i++){
            System.out.println("Fila "+(i+1)+": ");
            for(int z=0;z<maxC;z++){
                System.out.print(mat[i][z]+"|");
            }
            System.out.println("");
        }
    }
}
