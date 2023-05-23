/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extra;

/**
 *
 * @author mi tamura
 */
public class Persona {
    String nombre,apellido,dni;
    EstadoCivil estadoCivil;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }
    
}
