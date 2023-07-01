/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPracticaIntegrador;

/**
 *
 * @author mi tamura
 */
public class Casco {
    boolean funcionaSintetizador;
    boolean funcionaConsola;
    float consumoDeEnergiaSintetizador;
    float consumoDeEnergiaConsola;

    public float getConsumoDeEnergiaSintetizador() {
        return consumoDeEnergiaSintetizador;
    }

    public void setConsumoDeEnergiaSintetizador(float consumoDeEnergiaSintetizador) {
        this.consumoDeEnergiaSintetizador = consumoDeEnergiaSintetizador;
    }

    public float getConsumoDeEnergiaConsola() {
        return consumoDeEnergiaConsola;
    }

    public void setConsumoDeEnergiaConsola(float consumoDeEnergiaConsola) {
        this.consumoDeEnergiaConsola = consumoDeEnergiaConsola;
    }

    public boolean isFuncionaSintetizador() {
        return funcionaSintetizador;
    }

    public void setFuncionaSintetizador(boolean funcionaSintetizador) {
        this.funcionaSintetizador = funcionaSintetizador;
    }

    public boolean isFuncionaConsola() {
        return funcionaConsola;
    }

    public void setFuncionaConsola(boolean funcionaConsola) {
        this.funcionaConsola = funcionaConsola;
    }

    public Casco(boolean funcionaSintetizador, boolean funcionaConsola, float consumoDeEnergiaSintetizador, float consumoDeEnergiaConsola) {
        this.funcionaSintetizador = funcionaSintetizador;
        this.funcionaConsola = funcionaConsola;
        this.consumoDeEnergiaSintetizador = consumoDeEnergiaSintetizador;
        this.consumoDeEnergiaConsola = consumoDeEnergiaConsola;
    }

}
