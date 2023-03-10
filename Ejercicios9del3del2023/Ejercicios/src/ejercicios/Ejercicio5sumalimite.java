/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author mi tamura
 */
public class Ejercicio5sumalimite {
    /*
    Escriba un programa en el cual se ingrese un valor 
    limite positivo, y a continuación solicite numeros 
    al usuario hasta que la suma de los números introducidos 
    supere el límite inicial.
    */
    public static void main(String[] args){
        int limite,suma;
        suma=0;
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduzca el limite en valor positivo");
        do{
            limite= leer.nextInt();
        }while(limite<1);
        do{
            System.out.println("Introduce un numero para sumarlo");
            suma+= leer.nextInt();
        }
        while(suma<=limite);
        System.out.println("La suma total es: "+suma);
    }
    
}
