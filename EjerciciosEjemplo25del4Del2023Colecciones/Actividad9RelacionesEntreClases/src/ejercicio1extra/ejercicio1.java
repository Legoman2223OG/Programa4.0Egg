/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extra;

import ejercicio1.enumeradores.Raza;
import java.util.ArrayList;
import java.util.Scanner;

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
        Perro perroelegido;
        String nombre,apellido,documento,raza="",nombreperroelegir="",eleccion="";
        Raza razaElegida= null;
        int edad,tamanio;
        Scanner sc= new Scanner(System.in);
        ArrayList<Perro> perros = new ArrayList();
        ArrayList<Persona> personas= new ArrayList();
        while(true){
            System.out.println("//CREACION DE PERRO: ");
            System.out.println("Ingrese un nombre de perro: ");
            nombre= sc.next();
            System.out.println("Ingrese una raza del perro (BORZOI,CORGI,DOGE): ");
            do{
                raza= sc.next();
                raza= raza.toUpperCase();
                switch(raza){
                    case "DOGE":
                        razaElegida= Raza.DOGE;
                        break;
                    case "BORZOI":
                        razaElegida= Raza.BORZOI;
                        break;
                    case "CORGI":
                        razaElegida= Raza.CORGI;
                        break;
                    default:
                        System.out.println("No existe esa raza... Elige de nuevos ");
                }
            }while(!raza.equals("BORZOI")^!raza.equals("CORGI")^!raza.equals("DOGE"));
            System.out.println("Ingrese la edad del perro: ");
            edad = sc.nextInt();
            System.out.println("Ingrese el tamaño del perro: ");
            tamanio= sc.nextInt();
            perros.add(new Perro(nombre,razaElegida,edad,tamanio));
            System.out.println("//CREACION DE PERSONA: ");
            System.out.println("Ingrese el nombre de la persona: ");
            nombre = sc.nextLine();
            sc.nextLine();
            System.out.println("Ingrese el apellido de la persona: ");
            apellido= sc.next();
            System.out.println("Ingrese el documento de la persona: ");
            documento= sc.next();
            System.out.println("Ingrese la edad de la persona: ");
            edad= sc.nextInt();
            System.out.println("Ingrese el perro de la persona: ");
            while(true){
                nombreperroelegir= sc.next();
                if(hayAlgunPropietarioConPerro(personas,nombreperroelegir)) System.out.println("Ese perro ya tiene propietario.");
                else{
                    perroelegido=conseguirPerroDeLista(perros,nombreperroelegir);
                    if(perroelegido==null) System.out.println("El perro no se encontro...");
                    else{
                        break;
                    }
                }
            }
            personas.add(new Persona(documento,nombre,apellido,edad,perroelegido));
            System.out.println("Desea seguir ingresando mas personas y perros? (S/N)");
            eleccion= sc.next();
            if(eleccion.equalsIgnoreCase("N")) break;
        }
        for(Persona per: personas){
            System.out.println(per);
        }
    }
    public static Perro conseguirPerroDeLista(ArrayList<Perro> perros,String nombreperro){
        for(Perro perro: perros){
            if(perro.getNombre().equals(nombreperro)) return perro;
        }
        return null;
    }
    public static boolean hayAlgunPropietarioConPerro(ArrayList<Persona> personas,String nombreperro){
        //Busca en una lista si hay algun propietario con un perro del nombre *nombreperro*
        boolean seEncontro= false;
        for(Persona persona: personas){
            seEncontro= persona.getPerro().getNombre().equals(nombreperro);
            if(seEncontro) break;
        }
        return seEncontro;
    }
    
}
