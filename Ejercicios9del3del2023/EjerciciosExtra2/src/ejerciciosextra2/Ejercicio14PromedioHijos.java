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
public class Ejercicio14PromedioHijos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Se dispone de un conjunto de N familias, cada una de las cuales 
        tiene una M cantidad de hijos. Escriba un programa que pida la 
        cantidad de familias y para cada familia la cantidad de hijos 
        para averiguar la media de edad de los hijos de todas las familias.
        */
        int promedio=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Indique la cantidad de familias");
        int familias= sc.nextInt();
        for(int i=0;i<familias;i++){
            System.out.println("Indique la cantidad de hijos de la familia "+(i+1));
            promedio+=sc.nextInt();
        }
        System.out.println("El promedio de la media de edad de los hijos es: "+(promedio/familias));
    }
    
}
