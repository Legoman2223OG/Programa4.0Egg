/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioejemplo2;

/**
 *
 * @author mi tamura
 */
public class Jugador {
    String nombre,apellido;
    int posicion,numero;

    public Jugador(String nombre, String apellido, int posicion, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    public Jugador() {
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

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", numero=" + numero + '}';
    }
    
}
