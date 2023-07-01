/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
        debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
        ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
        número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
        consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
        ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
        controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
        carácter fallido como un intento.
        */
        Scanner sc= new Scanner(System.in);
        int numIngresado=0,cantIntentos=0;
        int numeroElegido = (int) (Math.random() * 500);
        System.out.println("ADIVINA EL NUMERO!"
                         + "------------------");
        while(true){
            numIngresado=0;
            try{
                System.out.println("Ingrese un numero: ");
                numIngresado= sc.nextInt();
                cantIntentos++;
                if(numIngresado==numeroElegido){
                System.out.println("Adivinaste el numero!, Cantidad de intentos: "+cantIntentos);
                break;
                }
                else if(numIngresado < numeroElegido) System.out.println("No es el numero correcto... El numero es mas grande");
                else System.out.println("No es el numero correcto... El numero es mas chico");
            
            }
            catch(InputMismatchException e){
                System.out.println("No ingresaste un numero... pero contara como un intento");
                cantIntentos++;
            }
            sc.nextLine();
        }
    }
    
}
