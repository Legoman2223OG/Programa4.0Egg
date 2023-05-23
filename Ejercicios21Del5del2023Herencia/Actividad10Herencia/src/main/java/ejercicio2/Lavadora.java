/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author mi tamura
 */
public class Lavadora extends Electrodomestico{
    double carga; //en kg.

    public Lavadora(double precio, String color, char consumoElectrico, double peso,double carga) {
        super(precio, color, consumoElectrico, peso);
        this.carga=carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    
}
