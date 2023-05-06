/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class AlumnoServicio {
    public ArrayList<Alumno> crearAlumnos(){
        ArrayList<Alumno> listaAlumnos= new ArrayList();
        Scanner sc= new Scanner(System.in);
        String nombre,eleccion;
        ArrayList<Integer> notas = new ArrayList();
        while(true){
            System.out.println("Ingrese un nombre para el alumno");
            nombre= sc.next();
            System.out.println("Ingrese su primera nota");
            notas.add(sc.nextInt());
            System.out.println("Ingrese su segunda nota");
            notas.add(sc.nextInt());
            System.out.println("Ingrese su tercera nota");
            notas.add(sc.nextInt());
            listaAlumnos.add(new Alumno(nombre,notas));
            System.out.println("¿Desea seguir añadiendo alumnos? (S/N)");
            eleccion= sc.next();
            if(eleccion.equalsIgnoreCase("N")) break;
        }
        return listaAlumnos;
    }
    /* SI NO SE ENCUENTRA EL ALUMNO DEVUELVE 0*/
    public double notaFinal(ArrayList<Alumno> listaAlumnos){
        String nombre;
        System.out.println("Ingrese el nombre de algun alumno para obtener su nota final: ");
        nombre= new Scanner(System.in).next();
        for(Alumno alum:listaAlumnos){
            if(alum.getNombre().equals(nombre)){
                return calcPromedio(alum.getNotas());
            }
        }
        return 0;
    }
    public double calcPromedio(ArrayList<Integer> notas){
        double prom=0;
        for(Integer nota:notas){
            prom+= nota;
        }
        return prom/notas.size();
    }
}
