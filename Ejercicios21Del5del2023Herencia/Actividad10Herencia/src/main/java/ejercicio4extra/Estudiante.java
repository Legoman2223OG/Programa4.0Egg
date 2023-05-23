/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extra;

/**
 *
 * @author mi tamura
 */
public class Estudiante extends Persona {
    Curso curso;

    public Estudiante(Curso curso, String nombre, String apellido, String dni, EstadoCivil estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
}
