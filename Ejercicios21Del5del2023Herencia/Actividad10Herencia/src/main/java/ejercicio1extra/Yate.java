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
public class Yate extends Barco{
    double potencia;// En CV
    int numCamarotes;

    public Yate(String matricula, double eslora, Date anioDeFabricacion,double potencia, int numCamarotes) {
        super(matricula, eslora, anioDeFabricacion);
        this.potencia= potencia;
        this.numCamarotes= numCamarotes;
    }
    
}
