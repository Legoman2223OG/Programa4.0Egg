/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra2;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio7MaxMinProm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realice un programa que calcule y visualice el valor máximo,
        el valor mínimo y el promedio de n números (n>0). El valor de n 
        se solicitará al principio del programa y los números serán introducidos
        por el usuario. Realice dos versiones del programa, una usando el bucle 
        “while” y otra con el bucle “do - while”.
        */
        int min,max,cont;
        double prom;
        cont=0;
        prom=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n= sc.nextInt();
        min=n;
        max=n;
        while(n>0){
            if(n>max){
                max= n;
            }
            else if(n<min){
                min=n;
            }
            System.out.println("Introduce otro numero");
            n= sc.nextInt();
            prom+=n;
            cont+=1;
        }
        prom/=cont;
        System.out.println("Numero maximo: "+max+"\nNumero minimo: "+min+"\nPromedio: "+prom);
    }
    
}
