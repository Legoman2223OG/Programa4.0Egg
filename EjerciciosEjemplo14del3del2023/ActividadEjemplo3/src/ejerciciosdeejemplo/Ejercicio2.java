/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeejemplo;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crea un procedimiento EsMultiplo que 
        reciba los dos números pasados por el usuario, 
        validando que el primer número múltiplo del segundo 
        e imprima si el primer número es múltiplo del segundo, 
        sino informe que no lo son.
        */
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1= sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2= sc.nextInt();
        EsMultiplo(num1,num2);
        
    }
    private static void EsMultiplo(int num1,int num2){
        if(num1 % num2==0) System.out.println("El primer numero es multiplo del segundo numero");
        else System.out.println("El primer numero no es multiplo del segundo numero");
    }
}
