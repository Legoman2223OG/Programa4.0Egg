/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author mi tamura
 */
public class RevolverDeAguaServicio {
    //Llena un revolver de agua con posiciones aleatorias.
    //Las posiciones van entre 0-10
    public RevolverDeAgua llenarRevolver(){
        int posAgua= (int) (Math.random()*10);
        int posAct= (int)(Math.random()*10);
        return new RevolverDeAgua((posAgua-posAct),posAgua);
    }
    public boolean mojar(RevolverDeAgua revolver){
        return revolver.posicionActual==revolver.posicionAgua;
    }
    public void siguienteChorro(RevolverDeAgua revolver){
        revolver.setPosicionActual(revolver.getPosicionActual()+1);
    }
}
