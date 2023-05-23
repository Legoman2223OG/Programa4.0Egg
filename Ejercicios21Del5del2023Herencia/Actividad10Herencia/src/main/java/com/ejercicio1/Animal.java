/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio1;

/**
 *
 * @author mi tamura
 */
public class Animal {
    String nombre,comida,raza;
    int edad;
    public Animal(String nombre, String comida, int edad, String raza){
        this.nombre= nombre;
        this.comida= comida;
        this.edad= edad;
        this.raza= raza;
    }
    public void Alimentarse(){
        System.out.println(nombre+" se alimenta de: "+comida);
    }
}
