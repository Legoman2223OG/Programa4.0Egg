/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio2DatosPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Diseñe una función que pida el nombre y la edad de N personas 
        e imprima los datos de las personas ingresadas por teclado e 
        indique si son mayores o menores de edad. Después de cada persona, 
        el programa debe preguntarle al usuario si quiere seguir mostrando 
        personas y frenar cuando el usuario ingrese la palabra “No”.
        */
        Scanner sc= new Scanner(System.in);
        String decision="";
        while(!decision.equalsIgnoreCase("No")){
            System.out.println("Ingrese el nombre: ");
            String nombre= sc.next();
            System.out.println("Ingrese la edad: ");
            int edad= sc.nextInt();
            MostrarInfoPersona(nombre,edad);
            System.out.println("\nDesea continuar? (Si/No)");
            decision= sc.next();
        }
        System.out.println("\nOperacion terminada");
    }
    private static void MostrarInfoPersona(String nombre,int edad){
        System.out.println("Nombre: "+nombre);
        //El operador ternario funciona de la siguiente manera
        //Primero pondremos la validacion que se tiene que hacer, en mi caso
        //Tiene que validar si edad es mayor a 18 
        //Pondremos un ? para iniciar la seleccion de posibles datos
        //(Seria como el {} del if)
        // : funcionara como el else si es que da lo contrario
        //Esto nos ayudara mucho a resumir el codigo y variables que pueden 
        //Tener diferentes valores
        System.out.println("Edad: "+edad+"\n"+ (edad>=18 ? "Es mayor de edad" : "Es menor de edad"));
        
    }
}
