/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class ListaPaisServicio {
    public HashSet<String> ingresarPaises(){
        HashSet<String> paises= new HashSet();
        Scanner sc= new Scanner(System.in);
        String confirmar,nombre;
        while(true){
            System.out.println("Ingrese el nombre del pais: ");
            nombre= sc.next();
            paises.add(nombre);
            System.out.println("Quiere agregar mas paises? (S/N)");
            confirmar= sc.next();
            if(confirmar.equalsIgnoreCase("N")) break;
        }
        return paises;
    }
    public void MostrarPaisesOrdenadosAlf(HashSet<String> paises){
        ArrayList<String> paisesOrdenado= new ArrayList(paises);
        paisesOrdenado.sort((String p1,String p2)-> p1.compareTo(p2));
        System.out.println("Lista paises ordenadamente");
        for(String pais: paises){
            System.out.println(pais);
        }
    }
}
