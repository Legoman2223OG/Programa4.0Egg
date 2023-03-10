/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio8Caja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Dibujar un cuadrado de N elementos por lado utilizando 
        el carácter “*”. Por ejemplo, si el cuadrado tiene 4 
        elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
        */
        System.out.println("Ingrese un numero");
        int n= new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            for(int z=0;z<n;z++){
                if(i>0 && i<n-1 && z > 0 && z < n-1) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
