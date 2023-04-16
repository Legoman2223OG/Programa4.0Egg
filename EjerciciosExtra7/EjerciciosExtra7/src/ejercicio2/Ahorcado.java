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
public class Ahorcado {
    String[] palabra;
    int cantLetrasEncontradas;
    int cantJugadasMax;
    public Ahorcado(){
        
    }
    public Ahorcado(int longitudPalabra){
        palabra= new String[longitudPalabra];
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabras) {
        this.palabra = palabras;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }
    
}
