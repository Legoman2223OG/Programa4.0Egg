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
public class Profesor extends Empleado {
    Curso departamento;

    public Profesor(Curso departamento,Date anioIncorporacionFacultad, String numeroDespacho, String nombre, String apellido, String dni, EstadoCivil estadoCivil) {
        super(anioIncorporacionFacultad, numeroDespacho, nombre, apellido, dni, estadoCivil);
        this.departamento=departamento;
    }
    public Curso getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Curso departamento) {
        this.departamento = departamento;
    }
    
}
