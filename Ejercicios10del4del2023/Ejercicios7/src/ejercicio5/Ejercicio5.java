/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Date;

/**
 *
 * @author mi tamura
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Implemente la clase Persona en el paquete entidades. Una persona tiene 
        un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, 
        constructor parametrizado, get y set. 
        
        Crear una clase PersonaService, en el paquete servicio, 
        con los siguientes métodos:
        
        A) Método crearPersona que pida al usuario Nombre y fecha de nacimiento 
        de la persona a crear. Retornar el objeto Persona creado.
        
        B) Método calcularEdad que calcule la edad del usuario utilizando 
        el atributo de fecha de nacimiento y la fecha actual.
        
        C) Método menorQue recibe como parámetro una Persona y una edad. 
        Retorna true si la persona es menor que la edad consultada o false 
        en caso contrario.
        
        D) Método mostrarPersona que muestra la información de la persona deseada.
        */
        PersonaServicio sv= new PersonaServicio();
        Persona persona1= sv.crearPersona();
        sv.calcularEdad(persona1);
        System.out.println("Es "+persona1.getNombre()+" menor de edad?: "+
        (sv.menorQue(persona1, 18)? "Si" : "No"));
        sv.mostrarPersona(persona1);
    }
    
}
