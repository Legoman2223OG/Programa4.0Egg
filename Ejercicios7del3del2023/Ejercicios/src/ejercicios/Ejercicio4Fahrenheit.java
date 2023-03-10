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
public class Ejercicio4Fahrenheit {
    public static void main(String[] args){
        /*
        Dada una cantidad de grados centígrados se 
        debe mostrar su equivalente en grados Fahrenheit. 
        La fórmula correspondiente es: F = 32 + (9 * C / 5).
        */
        double C= Double.parseDouble(JOptionPane.showInputDialog("Introduce los grados"));
        double F= 32+(9*C/5);
        System.out.println("Los grados en fahrenheit son: "+F);
    }
}
