/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

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
        Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
        método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
        try-catch para probar la nueva excepción que debe ser controlada.
        PD: Estas clases estan en la carpeta Ejercicios6 en el paquete ejercicio3.
        */
        Persona personaVacia=null;
        PersonaService pSv= new PersonaService();
        try{
            pSv.esMayorDeEdad(personaVacia);
        }
        catch(NullPointerException e){
            System.out.println("La persona no esta instanciada...");
            System.out.println("Tipo de excepcion: " + e.fillInStackTrace());
        }
    }
    
}
