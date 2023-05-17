/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ejercicio1.enumeradores.Raza;

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
        Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
        clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
        atributos: nombre, apellido, edad, documento y Perro.
        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
        pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
        la clase Persona, la información del Perro y de la Persona.
        */
        Perro perro1= new Perro("Sancho",Raza.CORGI,5,30);
        Perro perro2= new Perro("Pepe",Raza.BORZOI,9,20);
        Persona p1= new Persona("30349599","Juan","Marisco",15,perro1);
        Persona p2= new Persona("90394839","Jose","Hernandez",20,perro2);
        System.out.println(p1);
        System.out.println(p2);
    }
    
}
