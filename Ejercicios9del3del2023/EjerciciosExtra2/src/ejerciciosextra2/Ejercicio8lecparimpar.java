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
public class Ejercicio8lecparimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escriba un programa que lea números enteros. Si el número es 
        múltiplo de cinco debe detener la lectura y mostrar la cantidad 
        de números leídos, la cantidad de números pares y la cantidad de 
        números impares. Al igual que en el ejercicio anterior los números 
        negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
        */
        int cont,num,cantimp,cantpar;
        cont=0;cantimp=0;cantpar=0;
        while(true){
            System.out.println("Introduce un numero: ");
            num= new Scanner(System.in).nextInt();
            if(num % 5==0)break;
            if(num>0)cont++;
            if(num % 2==0) cantpar++;
            else cantimp++;
        }
        System.out.println("Cantidad de impares: "+cantimp+"\nCantidad de pares: "+cantpar+"\nCantidad de numeros leidos: "+cont);
    }
    
}
