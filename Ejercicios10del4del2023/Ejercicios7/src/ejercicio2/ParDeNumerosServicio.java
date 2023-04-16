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
public class ParDeNumerosServicio {
    public void mostrarValores(ParDeNumeros pdn){
        System.out.println("Numero 1: "+pdn.getNum1()+"\nNumero 2: "+pdn.getNum2());
    }
    public double devolverMayor(ParDeNumeros pdn){
        return pdn.getNum1() >= pdn.getNum2()? pdn.getNum1() : pdn.getNum2();
    }
    public void calcularPotencia(ParDeNumeros pdn){
        double numMayorRedondeado= Math.round(devolverMayor(pdn));
        double numMenorRedondeado= Math.round(devolverMayor(pdn)==pdn.getNum1()?pdn.getNum2(): pdn.getNum1());
        System.out.println("Potencia de num mayor redondeado por el num menor redondeado: "+Math.pow(numMayorRedondeado, numMenorRedondeado));
    }
    public void calculaRaiz(ParDeNumeros pdn){
        double numMenor= pdn.getNum1()< devolverMayor(pdn) ? pdn.getNum1() : pdn.getNum2();
        System.out.println("Raiz cuadrada del numero menor: "+Math.sqrt(Math.abs(numMenor)));
    }
}
