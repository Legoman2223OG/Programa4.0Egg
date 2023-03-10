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
public class Ejercicio1EquivalenteMins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Dado un tiempo en minutos, calcular su equivalente en días y horas. 
        Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
        calcular su equivalente: 1 día, 2 horas.
        */
        int min,dias,horas;
        dias=0;
        horas=0;
        System.out.println("Ingrese la cantidad de minutos");
        min= new Scanner(System.in).nextInt();
        while(min>0){
            if(min>=1440){
                dias+=1;
                min-=1440;
            }
            else if(min>=60){
                horas+=1;
                min-=60;
            }
            else{
                min=0;
            }
        }
        System.out.println("Dias: "+dias+"\nHoras: "+horas);
    }
    
}
