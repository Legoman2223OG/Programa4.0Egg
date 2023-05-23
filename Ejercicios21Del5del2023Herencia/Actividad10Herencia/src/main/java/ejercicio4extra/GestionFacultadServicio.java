/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extra;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class GestionFacultadServicio {
    Scanner sc= new Scanner(System.in);
    public void CambiarEstadoCivil(Persona persona){
        String eleccion;
        EstadoCivil estadoElegido= null;
        while(true){
            System.out.println("Eliga el estado civil a cambiar (SOLTERO,CASADO): ");
            eleccion= sc.next();
            switch(eleccion){
                case "SOLTERO"->estadoElegido= EstadoCivil.SOLTERO;
                case "CASADO"-> estadoElegido= EstadoCivil.CASADO;
                default->System.out.println("Ese estado civil no existe... Intente de nuevo");
            }
            if(estadoElegido!=null) break;
        }
        persona.setEstadoCivil(estadoElegido);
    }
    public void ReasignarDespacho(Empleado empleado){
        String nuevoDespacho;
        System.out.println("Ingrese un nuevo despacho para el empleado");
        System.out.println("FORMATO: ");
        System.out.println("AÑO-ADUANA-TIPO-NUMERO-DV\n" +
                            "EJ:\n" +
                            "15-091-IC05-123456-1");
        nuevoDespacho= sc.next();
        empleado.setNumeroDespacho(nuevoDespacho);
    }
    public void MatricularNuevoCurso(Estudiante estudiante){
        String eleccion;
        Curso cursoElegido=null;
        
        while(true){
            System.out.println("Ingrese el curso para matricular al estudiante: ");
            System.out.println("(MATEMATICA,LENGUAJE,ARQUITECTURA,FISICA,PROGRAMACION)");
            eleccion=sc.next();
            switch(eleccion){
                case "MATEMATICA"-> cursoElegido= Curso.MATEMATICA;
                case "LENGUAJE"-> cursoElegido= Curso.LENGUAJE;
                case "ARQUITECTURA"-> cursoElegido= Curso.ARQUITECTURA;
                case "FISICA"-> cursoElegido= Curso.FISICA;
                case "PROGRAMACION"-> cursoElegido= Curso.PROGRAMACION;
                default -> System.out.println("Ese curso no existe... Intente de nuevo");
            }
            if(cursoElegido!=null)break;
        }
        estudiante.setCurso(cursoElegido);
    }
    public void CambiarDepartamento(Profesor profesor){
        String eleccion;
        Curso departamentoElegido=null;
        
        while(true){
            System.out.println("Ingrese el nuevo departamento para cambiar para el profesor: ");
            System.out.println("(MATEMATICA,LENGUAJE,ARQUITECTURA,FISICA,PROGRAMACION)");
            eleccion=sc.next();
            switch(eleccion){
                case "MATEMATICA"-> departamentoElegido= Curso.MATEMATICA;
                case "LENGUAJE"-> departamentoElegido= Curso.LENGUAJE;
                case "ARQUITECTURA"-> departamentoElegido= Curso.ARQUITECTURA;
                case "FISICA"-> departamentoElegido= Curso.FISICA;
                case "PROGRAMACION"-> departamentoElegido= Curso.PROGRAMACION;
                default -> System.out.println("Ese departamento no existe... Intente de nuevo");
            }
            if(departamentoElegido!=null)break;
        }
        profesor.setDepartamento(departamentoElegido);
    }
    public void TransladarSeccion(PersonalDeServicio personalDeServicio){
        String eleccion;
        Sector sectorElegido=null;
        while(true){
            System.out.println("Ingrese el sector a transladar al empleado: ");
            System.out.println("(BIBLIOTECA,DECANATO,SECRETARIA,PORTERO)");
            eleccion= sc.next();
            switch(eleccion){
                case "BIBLIOTECA"-> sectorElegido= Sector.BIBLIOTECA;
                case "DECANATO"-> sectorElegido= Sector.DECANATO;
                case "SECRETARIA"-> sectorElegido= Sector.SECRETARIA;
                case "PORTERO"-> sectorElegido= Sector.PORTERO;
                default -> System.out.println("Ese sector no existe... Intente de nuevo");
            }
            if(sectorElegido!=null)break;
        }
        personalDeServicio.setSector(sectorElegido);
    }
}
