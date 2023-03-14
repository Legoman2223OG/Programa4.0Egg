/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio1SumResDivMult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crea una aplicación que le pida dos números al usuario y 
        este pueda elegir entre sumar, restar, multiplicar y dividir. 
        La aplicación debe tener una función para cada operación matemática 
        y deben devolver sus resultados para imprimirlos en el main. 
        */
        int decision;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Elige entre las cuatro opciones: \n1- Suma\n2- Resta"
        +"\n3- Multiplicacion\n4- Division");
        decision= sc.nextInt();
        switch(decision){
            case 1:
                System.out.println("La suma de los dos numeros es: "+Sumar(num1,num2));
                break;
            case 2:
                System.out.println("La resta de los dos numeros es: "+Restar(num1,num2));
                break;
            case 3:
                System.out.println("La multiplicacion de los dos numeros es: "+Multiplicar(num1,num2));
                break;
            case 4:
                System.out.println("La division de los dos numeros es: "+Dividir(num1,num2));
                break;
            default:
                System.out.println("Elige una opcion de las listadas anteriormente...");
        }
    }
    private static int Sumar(int num1, int num2){
        return num1+num2;
    }
    private static int Restar(int num1, int num2){
        return num1-num2;
    }
    private static int Multiplicar(int num1, int num2){
        return num1*num2;
    }
    private static double Dividir(int num1, int num2){
        return num1/num2;
    }
}
