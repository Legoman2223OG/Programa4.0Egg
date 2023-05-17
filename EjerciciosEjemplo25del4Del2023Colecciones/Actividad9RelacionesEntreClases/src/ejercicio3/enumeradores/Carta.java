/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.enumeradores;

/**
 *
 * @author mi tamura
 */
public class Carta {
    Palo palo;
    int numero; //Debe ser un numero entre 1-7 7-12
    public Carta(Palo palo, int numero){
        this.palo= palo;
        this.numero= numero;
    }
    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", numero=" + numero + '}';
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
