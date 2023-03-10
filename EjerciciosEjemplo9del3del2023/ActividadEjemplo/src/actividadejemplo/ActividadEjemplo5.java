/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadejemplo;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class ActividadEjemplo5 {
    public static void main(String[] args){
        /*
        ¨Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
        e imprima el número ingresado seguido de tantos asteriscos como indique 
        su valor. Por ejemplo:
        5 *****
        3 ***
        11 ***********
        2 **
        */
        int num1,num2,num3,num4;
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        num1=scan.nextInt();
        System.out.println("Ingrese el numero 2");
        num2=scan.nextInt();
        System.out.println("Ingrese el numero 3");
        num3=scan.nextInt();
        System.out.println("Ingrese el numero 4");
        num4=scan.nextInt();
        System.out.println("\n");
        System.out.print(num1+": ");
        for(int i=0;i<num1;i++){
            System.out.print("*");
        }
        System.out.println("\n");
        System.out.print(num2+": ");
        for(int i=0;i<num2;i++){
            System.out.print("*");
        }
        System.out.println("\n");
        System.out.print(num3+": ");
        for(int i=0;i<num3;i++){
            System.out.print("*"); 
        }
        System.out.println("\n");
        System.out.print(num4+": ");
        for(int i=0;i<num4;i++){
            System.out.print("*");
        }
    }
}
