/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extra;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mi tamura
 */
/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
*/
public class ejercicio4 {
    public static void main(String[] args){
        GestionFacultadServicio gfSv= new GestionFacultadServicio();
        ArrayList<Persona> sistemaGestorUniversidad= new ArrayList();
        sistemaGestorUniversidad.add(new Estudiante(Curso.ARQUITECTURA,"Juarez","Lorez","33405949",EstadoCivil.CASADO));
        sistemaGestorUniversidad.add(new PersonalDeServicio(Sector.BIBLIOTECA,new Date(200,4,5),"10-020-IC03-123456-9","Lolo","Perez","90403020",EstadoCivil.SOLTERO));
        sistemaGestorUniversidad.add(new Profesor(Curso.ARQUITECTURA,new Date(200,4,2),"30-010-IC01-129302-1","Silviana","Suarez","30401020",EstadoCivil.CASADO));
        gfSv.CambiarEstadoCivil(sistemaGestorUniversidad.get(2));
        System.out.println(sistemaGestorUniversidad.get(2).getNombre()+"\n"+sistemaGestorUniversidad.get(2).getEstadoCivil().toString());
        Estudiante estudiante= (Estudiante) sistemaGestorUniversidad.get(0);
        gfSv.MatricularNuevoCurso(estudiante);
        
        System.out.println(estudiante.getNombre()+"\n"+estudiante.getCurso().toString());
        gfSv.CambiarDepartamento((Profesor) sistemaGestorUniversidad.get(2));
        Profesor prof= (Profesor) sistemaGestorUniversidad.get(2);
        System.out.println(prof.getNombre()+"\n"+prof.getDepartamento());
        gfSv.TransladarSeccion((PersonalDeServicio) sistemaGestorUniversidad.get(1));
        PersonalDeServicio pdesv= (PersonalDeServicio) sistemaGestorUniversidad.get(1);
        System.out.println(pdesv.getNombre()+"\n"+pdesv.getSector());
    }
}
