/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class PersonaService {
    public Persona crearPersona(){
        Persona nuevaPersona = new Persona();
        System.out.println("Elige un nombre: ");
        nuevaPersona.setNombre(new Scanner(System.in).next());
        return nuevaPersona;
    }
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre: "+persona.getNombre()+"\nId: "+persona.getNrold());
    }
}
