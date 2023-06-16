/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPracticaIntegrador;

/**
 *
 * @author mi tamura
 */
public class Bota{
    boolean funcionaPropulsor;
    float consumoDeEnergia;
    public Bota(boolean funcionaPropulsor) {
        this.funcionaPropulsor = funcionaPropulsor;
    }

    public boolean isFuncionaPropulsor() {
        return funcionaPropulsor;
    }

    public float getConsumoDeEnergia() {
        return consumoDeEnergia;
    }

    public void setConsumoDeEnergia(float consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
    }

    public void setFuncionaPropulsor(boolean funcionaPropulsor) {
        this.funcionaPropulsor = funcionaPropulsor;
    }
}
