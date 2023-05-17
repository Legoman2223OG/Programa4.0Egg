/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1extra;

import ejercicio1.*;

/**
 *
 * @author mi tamura
 */
public class Persona {
    String documento,nombre,apellido;
    int edad;
    Perro perro;

    @Override
    public String toString() {
        return "Persona{" + "documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", perro=\n" + perro + '}';
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public Persona(String documento, String nombre, String apellido, int edad, Perro perro) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.perro = perro;
    }

    public Persona() {
    }
    
}
