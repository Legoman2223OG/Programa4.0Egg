/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio6Menu {
    public static void main(String[] args){
        /*
        ¨Realizar un programa que pida dos números enteros positivos 
        por teclado y muestre por pantalla el siguiente menú:El usuario deberá 
        elegir una opción y el programa deberá mostrar el resultado por pantalla 
        y luego volver al menú. El programa deberá ejecutarse hasta que se elija 
        la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
        en vez de salir del programa directamente, se debe mostrar el siguiente 
        mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
        Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario 
        se vuelve a mostrar el menú.
        */
        int num1,num2,opc;
        String opcSalir="";
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduzca dos numeros: ");
        num1= leer.nextInt();
        num2= leer.nextInt();
        while(!opcSalir.equalsIgnoreCase("S")){
            System.out.println("Elige una opcion: ");
            System.out.println("-1 (Sumar)"
            +"\n-2 (Restar)"
            +"\n-3 (Multiplicar)"
            +"\n-4 (Dividir)"
            +"\n-5 (Salir)");
            opc= leer.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Numero 1="+num1+"\nNumero 2= "+num2+"\nLa suma de los dos numeros es: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Numero 1="+num1+"\nNumero 2= "+num2+"\nLa resta de los dos numeros es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("Numero 1="+num1+"\nNumero 2= "+num2+"\nLa suma de los dos numeros es: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("Numero 1="+num1+"\nNumero 2= "+num2+"\nLa suma de los dos numeros es: "+(num1/num2));
                    break;
                case 5:
                    System.out.println("Desea salir del sistema? (S/N)");
                    opcSalir= leer.next();
                    if(opcSalir.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo del sistema...");
                    }
                    break;
                default:
                    System.out.println("Elige una opcion correcta...");
            }
        }
    }
}
