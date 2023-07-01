/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPracticaIntegrador;

/**
 *
 * @author mi tamura
 */
public class ObjetoInmovil {
    Distancia distancia;
    int resistencia; //No se sabe con que esta calculado.
    boolean esHostil = false;

    public ObjetoInmovil(Distancia distancia, int resistencia) {
        this.distancia = distancia;
        this.resistencia = resistencia;
    }

    public Distancia getDistancia() {
        return distancia;
    }

    public void setDistancia(Distancia distancia) {
        this.distancia = distancia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public boolean isEsHostil() {
        return esHostil;
    }

    public void setEsHostil(boolean esHostil) {
        this.esHostil = esHostil;
    }
}
