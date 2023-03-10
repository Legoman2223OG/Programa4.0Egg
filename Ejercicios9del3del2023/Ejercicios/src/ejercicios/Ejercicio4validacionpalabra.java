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
public class Ejercicio4validacionpalabra {
    public static void main(String[] args){
        /*
        Escriba un programa que pida una frase o palabra y valide 
        si la primera letra de esa frase es una ‘A’. Si la primera 
        letra es una ‘A’, se deberá de imprimir un mensaje por pantalla 
        que diga “CORRECTO”, en caso contrario, se deberá imprimir 
        “INCORRECTO”. Nota: investigar la función Substring y equals() 
        de Java.
        */
        String frase;
        System.out.println("Ingrese una frase o palabra");
        frase= new Scanner(System.in).nextLine();
        if(frase.substring(0,1).equals("A")) System.out.println("CORRECTO");
        else System.out.println("INCORRECTO");
    }
}
