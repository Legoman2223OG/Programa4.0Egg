/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mi tamura
 */
public class Ejercicio2nombre {
    public static void main(String[] args){
        /*
        Escribir un programa que pida tu nombre, 
        lo guarde en una variable y lo muestre por pantalla.
        */
        String nombre;
        System.out.println("Introduce tu nombre");
        nombre= new Scanner(System.in).next();
        System.out.println("Tu nombre es: "+nombre);
    }
}
