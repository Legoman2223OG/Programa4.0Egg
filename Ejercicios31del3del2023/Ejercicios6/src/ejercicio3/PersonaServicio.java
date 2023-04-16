/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class PersonaServicio {
    
    Scanner sc= new Scanner(System.in);
    public Persona crearPersona(){
        String sexo="";
        Persona nuevaPersona= new Persona();
        System.out.println("Introduce el nombre: ");
        nuevaPersona.setNombre(sc.next());
        System.out.println("Introduce su edad: ");
        nuevaPersona.setEdad(sc.nextInt());
        System.out.println("Introduce su sexo (H (HOMBRE),M (MUJER),O (OTRO)): ");
        sexo=sc.next();
        while(!sexo.equalsIgnoreCase("H")^!sexo.equalsIgnoreCase("M")^!sexo.equalsIgnoreCase("O")){
            
            System.out.println("Introduce H (Hombre), M (Mujer), O (Otro)");
            sexo=sc.nextLine();
        }
        nuevaPersona.setSexo(sexo);
        System.out.println("Introduce su peso en kilogramos: ");
        nuevaPersona.setPeso(sc.nextDouble());
        System.out.println("Introduce su altura: ");
        nuevaPersona.setAltura(sc.nextDouble());
        return nuevaPersona;
    }
    public boolean esMayorDeEdad(Persona pers){
        if(pers.getEdad()>=18) return true;
        return false;
    }
    // -1 representa que esta debajo del peso ideal
    // 0 representa que esta en el peso ideal
    // 1 representa que tiene sobrepeso
    public int calcularIMC(Persona pers){
        double calculoPesoIdeal= pers.getPeso()/(Math.pow(pers.getAltura(), 2));
        if(calculoPesoIdeal<20) return -1;
        else if(calculoPesoIdeal>=20&&calculoPesoIdeal<=25) return 0;
        return 1;
    }
}
