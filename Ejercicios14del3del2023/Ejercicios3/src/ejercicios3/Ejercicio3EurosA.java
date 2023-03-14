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
public class Ejercicio3EurosA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crea una aplicación que a través de una función nos convierta 
        una cantidad de euros introducida por teclado a otra moneda, 
        estas pueden ser a dólares, yenes o libras. La función tendrá 
        como parámetros, la cantidad de euros y la moneda a convertir 
        que será una cadena, este no devolverá ningún valor y mostrará 
        un mensaje indicando el cambio (void).
        El cambio de divisas es:
        *i 0.86 libras es un 1 €
        *ii 1.28611 $ es un 1 €
        *iii 129.852 yenes es un 1 €
        */
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese una cantidad de euros");
        int euros= sc.nextInt();
        System.out.println("Ingrese el tipo de moneda a la que se quiere convertir esos euros"
        +"\nlibras"+"\ndolares"+"\nyenes");
        String divisa= sc.next();
        divisa= divisa.toLowerCase();
        Convercion(euros,divisa);
        
    }
    private static void Convercion(int euros,String divisa){
        switch(divisa){
            case "libras":
                System.out.println("El total de la convercion es de: "+(0.86*euros)+" libras");
                break;
            case "dolares":
                System.out.println("El total de la convercion es de: "+(1.28611*euros)+" dolares");
                break;
            case "yenes":
                System.out.println("El total de la convercion es de: "+(129.852*euros)+" yenes");
                break;
            default:
                System.out.println("Eliga un tipo de moneda valido");
        }
    }
    
}
