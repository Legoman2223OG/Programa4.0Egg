/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class ArrayServicio {
    Scanner sc= new Scanner(System.in);
    /*
    CREA UNA LISTA DE NUMEROS ENTEROS EXCEPTO CON EL NUMERO -99 (CUAL CANCELA LA INTRODUCCION DE DATOS)
    */
    public ArrayList<Integer> crearListaNumeros(){
        ArrayList<Integer> listaNumeros= new ArrayList();
        int numero;
        while(true){
            System.out.println("Ingrese un numero (-99 cancelara el bucle de introduccion de datos): ");
            numero= sc.nextInt();
            if(numero==-99) break;
            else listaNumeros.add(numero);
        }
        return listaNumeros;
    }
    public void MostrarNumeros(ArrayList<Integer> lista){
        System.out.println("Lista de numeros: ");
        for(int numero: lista){
            System.out.println(numero);
        }
    }
}
