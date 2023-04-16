/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author mi tamura
 */
public class Persona {
    String Nombre;
    
    int Nrold;
    public Persona(){
        Nrold=(int)(Math.random()*100);
    }

    public int getNrold() {
        return Nrold;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
