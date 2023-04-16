/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class AdivinarMes {
    String[] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    String mesSecreto;
    public void IntentarAdivinar(){
        String mesAElegir;
        mesSecreto=meses[(int)(Math.random()*12)];
        System.out.println("Intenta adivinar el mes secreto.");
        while(true){
            mesAElegir= new Scanner(System.in).next();
            if(mesAElegir.equals(mesSecreto)){
                System.out.println("¡Ha acertado!");
                break;
            }
            else System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes.");
        }
    }
}
