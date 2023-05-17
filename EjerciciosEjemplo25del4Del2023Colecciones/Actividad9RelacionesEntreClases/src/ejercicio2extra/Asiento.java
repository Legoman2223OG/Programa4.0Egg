/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2extra;

/**
 *
 * @author mi tamura
 */
public class Asiento {
    Espectador propietario;
    int idFila;
    String idLetra;
    public String toString(){
        return idFila+" "+idLetra+" "+ (propietario!=null? "X":"");
    }
    public Asiento(Espectador propietario, int idFila, String idLetra) {
        this.propietario = propietario;
        this.idFila = idFila;
        this.idLetra = idLetra;
    }

    public Espectador getPropietario() {
        return propietario;
    }

    public void setPropietario(Espectador propietario) {
        this.propietario = propietario;
    }

    public int getIdFila() {
        return idFila;
    }

    public void setIdFila(int idFila) {
        this.idFila = idFila;
    }

    public String getIdLetra() {
        return idLetra;
    }

    public void setIdLetra(String idLetra) {
        this.idLetra = idLetra;
    }
    
}
