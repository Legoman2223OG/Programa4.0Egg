/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Date;

/**
 *
 * @author mi tamura
 */
public class Persona {
    String nombre;
    Date fechaNacimiento;
    public Persona(){
        nombre="";
        fechaNacimiento= new Date();
    }
    public Persona(String nombre, Date fechaNacimiento){
        this.nombre= nombre;
        this.fechaNacimiento= fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
