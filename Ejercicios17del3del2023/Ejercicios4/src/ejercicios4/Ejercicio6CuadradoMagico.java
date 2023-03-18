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
public class Ejercicio6CuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
        del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales 
        son idénticas. Crear un programa que permita introducir un cuadrado 
        por teclado y determine si este cuadrado es mágico o no. El programa 
        deberá comprobar que los números introducidos son correctos, es decir, 
        están entre el 1 y el 9.
        */
        int sumac=0,sumaf=0;
        boolean esMagicoF=false;
        boolean esMagicoC=false;
        boolean esMagicoD1=false;
        boolean esMagicoD2=false;
        int[][] cuadradoMagico= new int[3][3];
        for(int i=0;i<cuadradoMagico.length;i++){
            for(int z=0;z<cuadradoMagico.length;z++){
                do{
                System.out.println("Introduzca un valor para la posicion: |"+i+"|"+" |"+z+"|"+" Debe de ser un valor entre (0 y 9)");
                cuadradoMagico[i][z]= new Scanner(System.in).nextInt();
                if(cuadradoMagico[i][z]<0 || cuadradoMagico[i][z]>9) System.out.println("Introduce el numero otra vez");
                }while(cuadradoMagico[i][z]>=0 && cuadradoMagico[i][z]<=9);
            }
        }
        for(int i=0;i<cuadradoMagico.length;i++){
            for(int z=0;z<cuadradoMagico.length;z++){
                sumaf+=cuadradoMagico[i][z];
            }
            if(sumaf!=15){
                esMagicoF=false;
                break;
            }
            else{
                esMagicoF=true;
            }
            sumaf=0;
        }
        for(int i=0;i<cuadradoMagico.length;i++){
            for(int z=0;z<cuadradoMagico.length;z++){
                sumac+=cuadradoMagico[i][z];
            }
            if(sumac!=15){
                esMagicoC=false;
                break;
            }
            else{
                esMagicoC=true;
            }
            sumac=0;
        }
        if(cuadradoMagico[0][0]+cuadradoMagico[1][1]+cuadradoMagico[2][2]==15)
            esMagicoD1= true;
        else esMagicoD1= false;
        if(cuadradoMagico[0][2]+cuadradoMagico[1][1]+cuadradoMagico[2][0]==15)
            esMagicoD2= true;
        else esMagicoD2= false;
        if(esMagicoF&&esMagicoC&&esMagicoD1&&esMagicoD2)
            System.out.println("Es un Cuadrado Magico");
        else
            System.out.println("No es un Cuadrado Magico");
    }
    
}
