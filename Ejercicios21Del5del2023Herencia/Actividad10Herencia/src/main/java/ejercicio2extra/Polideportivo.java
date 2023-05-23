/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2extra;

/**
 *
 * @author mi tamura
 */
public class Polideportivo extends Edificio{
    String nombre;
    Instalacion tipoInstalacion;

    public Polideportivo(String nombre, Instalacion tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instalacion getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(Instalacion tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
    
}
