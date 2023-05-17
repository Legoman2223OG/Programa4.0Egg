/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioejemplo1;

/**
 *
 * @author mi tamura
 */
public class ejercicioejemplorelacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realiza un programa en donde una clase Persona tenga como atributo nombre,
        apellido y un objeto de clase Dni. La clase Dni tendrá como atributos la 
        serie (carácter) y número. Prueba acceder luego a los atributos del dni 
        de la persona creando objetos y jugando desde el main.
        */
        Persona per= new Persona();
        Dni dni= new Dni();
        dni.setNumero(2030);
        dni.setSerie("adada");
        per.setApellido("Juarez");
        per.setNombre("Soarez");
        per.setDni(dni);
        System.out.println(per);
    }
    
}
