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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escribir un programa que procese una secuencia de caracteres 
        ingresada por teclado y terminada en punto, y luego codifique 
        la palabra o frase ingresada de la siguiente manera: cada vocal 
        se reemplaza por el carácter que se indica en la tabla y el resto 
        de los caracteres (incluyendo a las vocales acentuadas) se mantienen 
        sin cambios.
        
        a e i o u
        @ # $ % *

        Realice un subprograma que reciba una secuencia de caracteres 
        y retorne la codificación correspondiente. Utilice la estructura 
        “según” para la transformación. 
        Por ejemplo, si el usuario ingresa:     
        Ayer, lunes, salimos a las once y 10.
        La salida del programa debería ser:  
        @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

        */
        System.out.println("Escriba una frase");
        String frase= new Scanner(System.in).nextLine();
        System.out.println(codificarFrase(frase));
    }
    private static String codificarFrase(String frase){
        String nuevaFrase ="";
        for(int i=0;i<frase.length();i++){
            switch(frase.charAt(i)){
                case 'a':
                    nuevaFrase= nuevaFrase.concat("@");
                    break;
                case 'A':
                    nuevaFrase= nuevaFrase.concat("@");
                    break;
                case 'e':
                    nuevaFrase= nuevaFrase.concat("#");
                    break;
                case 'E':
                    nuevaFrase= nuevaFrase.concat("#");
                    break;
                case 'i':
                    nuevaFrase= nuevaFrase.concat("$");
                    break;
                case 'I':
                    nuevaFrase= nuevaFrase.concat("$");
                    break;
                case 'o':
                    nuevaFrase= nuevaFrase.concat("%");
                    break;
                case 'O':
                    nuevaFrase= nuevaFrase.concat("%");
                    break;
                case 'u':
                    nuevaFrase= nuevaFrase.concat("*");
                    break;
                case 'U':
                    nuevaFrase= nuevaFrase.concat("*");
                    break;
                default: 
                    nuevaFrase+= frase.charAt(i);
            }
            
        }
        return nuevaFrase;
    }
}
