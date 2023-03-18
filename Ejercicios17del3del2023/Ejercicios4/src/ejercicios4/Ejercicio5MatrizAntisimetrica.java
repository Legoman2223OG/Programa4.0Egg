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
public class Ejercicio5MatrizAntisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realice un programa que compruebe si una matriz dada es antisimétrica.
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su 
        propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica 
        si A = -AT. La matriz traspuesta de una matriz A se denota por AT y 
        se obtiene cambiando sus filas por columnas (o viceversa).
        */
        boolean esAntisimetrica= false;
        int[][] matrizAntisimetrica= {
            {0,-2,4},
            {2,0,2},
            {-4,-2,0}
        };
        
        for(int i=0;i<matrizAntisimetrica.length;i++){
            for(int z=0;z<matrizAntisimetrica.length;z++){
                System.out.println(matrizAntisimetrica[i][z]+"=="+matrizAntisimetrica[z][i]);
                if(matrizAntisimetrica[i][z]==-matrizAntisimetrica[z][i])
                    esAntisimetrica=true;
                else{
                    esAntisimetrica=false;
                    break;
                } 
            }
        }
        System.out.println(esAntisimetrica ? "Es una matriz antisimetrica" : "No es una raiz antisimetrica...");
    }
    
}
