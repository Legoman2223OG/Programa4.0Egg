/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author mi tamura
 */
public class CodigoPostal {
    String nombreCiudad;
    int numero;

    public CodigoPostal(String nombreCiudad, int numero) {
        this.nombreCiudad = nombreCiudad;
        this.numero = numero;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Ciudad: "+nombreCiudad+"\nNumero: "+numero;
    }
    
}
