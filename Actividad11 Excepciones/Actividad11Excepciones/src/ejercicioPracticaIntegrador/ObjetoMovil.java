/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPracticaIntegrador;

/**
 *
 * @author mi tamura
 */
public class ObjetoMovil extends ObjetoInmovil{
    double velocidad; //KpH o la medida que prefieran.

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public ObjetoMovil(Distancia distancia, int resistencia, double velocidad) {
        super(distancia, resistencia);
        this.velocidad= velocidad;
    }
    
}
