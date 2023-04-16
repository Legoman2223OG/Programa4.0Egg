/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class PersonaServicio {
    public Persona crearPersona(){
        Scanner sc= new Scanner(System.in);
        String nombre;
        Date fechaNacimiento= new Date();
        int dia,mes,anio;
        System.out.println("Ingrese un nombre para la persona: ");
        nombre= sc.nextLine();
        System.out.println("Ingrese el dia de nacimiento (1-31): ");
        dia= sc.nextInt();
        System.out.println("Ingrese el mes de nacimiento (1-12): ");
        mes= sc.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        anio= sc.nextInt();
        fechaNacimiento.setDate(dia);
        fechaNacimiento.setMonth(mes-1==0? 1 : mes-1);
        fechaNacimiento.setYear(anio-1900);
        return new Persona(nombre,fechaNacimiento);
    }
    public void calcularEdad(Persona persona){
        Date fechaActual= new Date();
        System.out.println(persona.getFechaNacimiento().getYear()< fechaActual.getYear()+1900?
                Math.abs((persona.getFechaNacimiento().getYear()+1900)-(fechaActual.getYear()+1900))
                :"La edad de esta persona supera el año actual... Vino del futuro??");
    }
    public boolean menorQue(Persona persona, int edad){
        return persona.getFechaNacimiento().getYear()<edad ? true : false;
    }
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre: "+persona.getNombre()+
                "\nFecha de nacimiento: "+persona.getFechaNacimiento().toString());
    }
}
