/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author mi tamura
 */
public class Ejercicio3Frase {
    public static void main(String[] args){
        /*
        Escribir un programa que pida una frase y 
        la muestre toda en mayúsculas y 
        después toda en minúsculas. 
        */
        String frase;
        frase= JOptionPane.showInputDialog("Ingrese una frase");
        System.out.println("Frase en minusculas: \n"+frase.toLowerCase());
        System.out.println("Frase en mayusculas: \n"+frase.toUpperCase());
    }
    
}
