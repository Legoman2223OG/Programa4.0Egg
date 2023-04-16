/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author mi tamura
 */
/*
        capacidadMáxima (la cantidad máxima de café que puede contener la cafetera)
        y cantidadActual (la cantidad actual de café que hay en la cafetera). 
        Agregar constructor vacío y con parámetros así como setters y getters.
*/
public class Cafetera {
    double capacidadMaxima;
    double cantidadActual;
    public Cafetera(){
        capacidadMaxima=0; cantidadActual=0;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
}
