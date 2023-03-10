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
public class ActividadEjemplo3 {
    public static void main(String[] args){
        /*
        Escriba un programa que valide si una nota está entre 0 y 10, 
        sino está entre 0 y 10 la nota se pedirá de nuevo hasta que 
        la nota sea correcta.
        */
        int nota;
        Scanner scan= new Scanner(System.in);
        System.out.println("Introduce la nota del alumno (0-10)");
        
        nota= scan.nextInt();
        while(nota<0||nota>10)
        {
            System.out.println("Introduce la nota de vuelta...");
            nota= scan.nextInt();
        }
        System.out.println("Nota correctamente enviada");
    }
}
