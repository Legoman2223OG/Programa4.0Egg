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
public class ActividadEjemplo4 {
    public static void main(String[] args){
        /*
        Escriba un programa que lea 20 números. Si el número leído es igual 
        a cero se debe salir del bucle y mostrar el mensaje "Se capturó el 
        numero cero".  El programa deberá calcular y mostrar el resultado 
        de la suma de los números leídos, pero si el número es negativo 
        no debe sumarse. Nota: recordar el uso de la sentencia break.
        */
        int suma,num,cont;
        suma=0;
        cont=0;
        do{
          System.out.println("Introduzca un numero");
          num= new Scanner(System.in).nextInt();
          if(num==0){ 
            System.out.println("Se detecto un cero, saliendo del bucle");
            break;
          }
          else if(num<0){
              System.out.println("El numero es negativo por lo cual no se sumara");
          }
          else{
              suma+=num;
          }
          cont+=1;
        }while(cont<20);
        System.out.println("La suma total es: "+suma);
    }
}
