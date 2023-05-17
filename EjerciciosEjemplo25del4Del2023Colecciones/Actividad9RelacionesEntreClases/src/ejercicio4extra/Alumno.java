/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extra;

/**
 *
 * @author mi tamura
 */
public class Alumno {
    String nombreCompleto;
    String dni;
    int cantVotos;


    public Alumno(String nombreCompleto, String dni, int cantVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", cantVotos=" + cantVotos + '}';
    }

    public Alumno() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }
    
}
