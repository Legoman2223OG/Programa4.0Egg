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
public class Ejercicio13EscaleraNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crear un programa que dibuje una escalera de números, 
        donde cada línea de números comience en uno y termine 
        en el número de la línea. Solicitar la altura de la escalera 
        al usuario al comenzar. Ejemplo: si se ingresa el número 3:
            1
            12
            123

        */
        System.out.println("Ingrese un numero");
        int n= new Scanner(System.in).nextInt();
        for(int i=1;i<=n;i++){
            for(int z=1;z<=i;z++){
                System.out.print(z);
            }
            System.out.println("");
        }
    }
    
}
