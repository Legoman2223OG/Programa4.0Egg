/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author mi tamura
 */
public class Alumno {
    String nombre;
    ArrayList<Integer> notas;
    public Alumno(){
        nombre="Anonimo";
        int[] notavacia= {0,0,0};
        notas.add(0);
        notas.add(0);
        notas.add(0);
    }
    public Alumno(String nombre,ArrayList<Integer> notas){
        this.nombre=nombre;
        this.notas=notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
}
