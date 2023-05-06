/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class CantanteFamosoServicio {
    Scanner sc= new Scanner(System.in);
    public ArrayList<CantanteFamoso> crearCantantes(){
        ArrayList<CantanteFamoso> cantantes= new ArrayList();
        String nombre,discoFamoso;
        for(int i=0;i<5;i++){
            System.out.println("Ingrese el nombre de un cantante: ");
            nombre= sc.nextLine();
            System.out.println("Ingrese el nombre de su disco mas famoso: ");
            discoFamoso= sc.nextLine();
            cantantes.add(new CantanteFamoso(nombre,discoFamoso));
        }
        return cantantes;
    }
    public void MostrarCantantes(ArrayList<CantanteFamoso> lista){
        System.out.println("Lista de cantantes: ");
        for(CantanteFamoso cantante: lista){
            System.out.println(cantante);
        }
    }
    public void AgregarCantante(ArrayList<CantanteFamoso> lista){
        String nombre,discoFamoso;
        System.out.println("Agregar nuevo cantante: ");
        System.out.println("Ingrese el nombre de un cantante: ");
        nombre= sc.next();
        System.out.println("Ingrese el nombre de su disco mas famoso: ");
        discoFamoso= sc.next();
        lista.add(new CantanteFamoso(nombre,discoFamoso));
    }
    public void EliminarCantante(ArrayList<CantanteFamoso> lista){
        String nombre;
        boolean encontrado=false;
        Iterator it= lista.iterator();
        System.out.println("Eliminar un cantante:");
        System.out.println("Ingrese el nombre de un cantante: ");
        nombre= sc.next();
        while(it.hasNext()){
            CantanteFamoso cant= (CantanteFamoso) it.next();
            if(cant.getNombre().equalsIgnoreCase(nombre)){
                encontrado=true;
                it.remove();
                System.out.println("Se removio el cantante "+nombre);
            }
        }
        if(!encontrado) System.out.println("No se encontro el cantante");
    }
    
}
