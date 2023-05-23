/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extra;

import java.util.Date;

/**
 *
 * @author mi tamura
 */
public class Empleado extends Persona{
    Date anioIncorporacionFacultad;
    String numeroDespacho;
    //FORMATO:
    //AÑO-ADUANA-TIPO-NUMERO-DV
    //EJ:
    //15-091-IC05-123456-1

    public Empleado(Date anioIncorporacionFacultad, String numeroDespacho, String nombre, String apellido, String dni, EstadoCivil estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorporacionFacultad = anioIncorporacionFacultad;
        this.numeroDespacho = numeroDespacho;
    }

    public Date getAnioIncorporacionFacultad() {
        return anioIncorporacionFacultad;
    }

    public void setAnioIncorporacionFacultad(Date anioIncorporacionFacultad) {
        this.anioIncorporacionFacultad = anioIncorporacionFacultad;
    }

    public String getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(String numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
}
