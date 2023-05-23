/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2extra;

/**
 *
 * @author mi tamura
 */
public class EdificioDeOficinas extends Edificio {
    int nroOficinas;
    int cantPersonas; //Por oficina.
    int nroPisos;

    public EdificioDeOficinas(int nroOficinas, int cantPersonas, int nroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.cantPersonas = cantPersonas;
        this.nroPisos = nroPisos;
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }
    
}
