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
public class PersonalDeServicio extends Empleado{
    Sector sector;

    public PersonalDeServicio(Sector sector,Date anioIncorporacionFacultad, String numeroDespacho, String nombre, String apellido, String dni, EstadoCivil estadoCivil) {
        super(anioIncorporacionFacultad, numeroDespacho, nombre, apellido, dni, estadoCivil);
        this.sector= sector;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
}
