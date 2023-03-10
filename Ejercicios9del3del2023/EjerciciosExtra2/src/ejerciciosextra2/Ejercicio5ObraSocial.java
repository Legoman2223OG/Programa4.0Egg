/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra2;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio5ObraSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego 
un valor real que represente el costo del tratamiento (previo al descuento) 
y determine el importe en efectivo a pagar por dicho socio.
        */
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el tipo de socio (A,B,C)");
        String tipoSocio= scan.next();
        double costoT= scan.nextDouble();
        switch(tipoSocio){
            case "A":
                System.out.println("Se debe abonar una cuota mayor, pero al ser socio de tipo A se tendra un 50% de descuento en el tratamiento");
                System.out.println("Coste del tratamiento con descuento: "+(costoT-(costoT*0.5)));
                break;
            case "B":
                System.out.println("Se debe abonar una cuota moderada pero al ser socio de tipo B se tendra un 35% de descuento en tratamientos\nde los socios de tipo A");
                System.out.println("Coste del tratamiento con descuento: "+(costoT-(costoT*0.35)));
                break;
            case "C":
                System.out.println("Se debe aportar una cantidad minima pero al ser socio de tipo C no tendras descuento en los tratamientos");
                System.out.println("Coste del tratamiento: "+costoT);
                break;
            default:
                System.out.println("Tipo de socio desconocido");
        }
    }
    
}
