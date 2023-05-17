/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2extra;

/**
 *
 * @author mi tamura
 */
public class Cine {
    Asiento[][] asientos= new Asiento[8][6];
    Pelicula peliculaElegida;
    double precioEntrada;

    public Cine(Pelicula peliculaElegida,double precioEntrada) {
        this.peliculaElegida = peliculaElegida;
        this.precioEntrada= precioEntrada;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public Pelicula getPeliculaElegida() {
        return peliculaElegida;
    }

    public void setPeliculaElegida(Pelicula peliculaElegida) {
        this.peliculaElegida = peliculaElegida;
    }
}
