/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1extra;

import java.util.Date;

/**
 *
 * @author mi tamura
 */
public class BarcoAMotor extends Barco {
    double potencia; //En CV

    public BarcoAMotor(String matricula, double eslora, Date anioDeFabricacion,double potencia) {
        super(matricula, eslora, anioDeFabricacion);
        this.potencia=potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
}
