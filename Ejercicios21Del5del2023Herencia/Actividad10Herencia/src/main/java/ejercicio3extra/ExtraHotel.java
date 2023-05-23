/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3extra;

/**
 *
 * @author mi tamura
 */
public abstract class ExtraHotel extends Alojamiento {
    Privado priv;
    double cantMetrosCuadrados;

    public Privado getPriv() {
        return priv;
    }

    public void setPriv(Privado priv) {
        this.priv = priv;
    }

    public double getCantMetrosCuadrados() {
        return cantMetrosCuadrados;
    }

    public void setCantMetrosCuadrados(double cantMetrosCuadrados) {
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }

    public ExtraHotel() {
    }

    public ExtraHotel(Privado priv, double cantMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.priv = priv;
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }

    
    
}
