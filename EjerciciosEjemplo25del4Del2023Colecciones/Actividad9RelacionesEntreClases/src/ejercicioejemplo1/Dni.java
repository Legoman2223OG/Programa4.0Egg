/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioejemplo1;

/**
 *
 * @author mi tamura
 */
public class Dni {
    String serie;
    int numero;

    public Dni() {
    }

    public Dni(String serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }
    public String toString(){
        return "Serie: "+serie+"\nNumero: "+numero;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
