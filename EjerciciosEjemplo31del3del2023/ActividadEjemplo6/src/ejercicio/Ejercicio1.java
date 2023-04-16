/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author mi tamura
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        ¿Que es una clase servicio?
        Es una clase que sigue un patron llamado GRASP (General Responsibility
        Assignment Software Patterns/Asignamiento General de Patrones de Software)
        La cual consiste de una buena practica que asigna el manejo de creacion de
        clases y encapsulamiento a una clase experta, lo cual facilita la comprehension
        y claridad en el codigo.
        En nuestro caso, la clase servicio se encargara de crear nuevas personas,
        mostrar sus datos, en vez de tener que crear directamente desde la clase persona.
        */
        PersonaService persServicio= new PersonaService();
        Persona terceraPersona= persServicio.crearPersona();
        persServicio.mostrarPersona(terceraPersona);
    }
    
}
