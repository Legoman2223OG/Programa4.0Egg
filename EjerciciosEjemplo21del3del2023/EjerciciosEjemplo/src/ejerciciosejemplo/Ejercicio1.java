/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosejemplo;

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
        Ir al archivo Persona.java para seguir los ejercicios del ejemplo.
        */
        Persona juanito= new Persona("Juanito","Juarez",20);
        System.out.println("Nombre: "+juanito.getNombre()+", Apellido: "+juanito.getApellido()+", Edad: "+juanito.getEdad());
        /*6) Cambiamos la identidad de juanito*/
        juanito.setNombre("Jorge");
        juanito.setApellido("Nuñez");
        juanito.setEdad(30);
        System.out.println("Nombre: "+juanito.getNombre()+", Apellido: "+juanito.getApellido()+", Edad: "+juanito.getEdad());
    }
    
}
