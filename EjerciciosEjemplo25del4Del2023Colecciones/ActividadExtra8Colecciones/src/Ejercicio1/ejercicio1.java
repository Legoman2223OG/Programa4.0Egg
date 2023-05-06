/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author mi tamura
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
        y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
        introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
        programa mostrará por pantalla el número de valores que se han leído, su suma y su
        media (promedio).
        */
        ArrayServicio aSv= new ArrayServicio();
        ArrayList<Integer> numeros= aSv.crearListaNumeros();
        aSv.MostrarNumeros(numeros);
    }
    
}
