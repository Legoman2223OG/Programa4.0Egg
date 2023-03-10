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
public class Ejercicio10MultiplicacionAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realice un programa para que el usuario adivine el 
        resultado de una multiplicación entre dos números 
        generados aleatoriamente entre 0 y 10. El programa debe 
        indicar al usuario si su respuesta es o no correcta. 
        En caso que la respuesta sea incorrecta se debe permitir al usuario 
        ingresar su respuesta nuevamente. 
        Para realizar este ejercicio investigue como utilizar la función 
        Math.random() de Java.
        */
        int num1,num2,mult,n;
        num1= (int)(Math.random()*10);
        num2= (int)(Math.random()*10);
        mult= num1*num2;
        do{
            System.out.println("Adivina el numero multiplicado");
            n= new Scanner(System.in).nextInt();
            if(n<mult)System.out.println("Incorrecto, el numero es un poco mas grande");
            else if(n>mult)System.out.println("Incorrecto, el numero es mas chico");
        }
        while(n!=mult);
        System.out.println("Acertaste!");
    }
    
}
