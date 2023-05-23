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
public class Velero extends Barco{
    int numMastiles;

    public Velero(String matricula, double eslora, Date anioDeFabricacion,int numMastiles) {
        super(matricula, eslora, anioDeFabricacion);
        this.numMastiles= numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }
    
}
