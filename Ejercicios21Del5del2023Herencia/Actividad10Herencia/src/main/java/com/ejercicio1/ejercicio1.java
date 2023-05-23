/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ejercicio1;

/**
 *
 * @author mi tamura
 */
public class ejercicio1 {

    public static void main(String[] args) {
        //Declaración del objeto Perro.
        Animal perro1= new Perro("Stitch","Carnivoro",15,"Doberman");
        perro1.Alimentarse();
        //Declaración del otro objeto Perro.
        Animal perro2= new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro2.Alimentarse();
        //Declaración del objeto Gato.
        Animal gato1= new Gato("Pelusa","Galletas",15,"Siamés");
        gato1.Alimentarse();
        //Declaración del objeto Caballo.
        Animal caballo1= new Caballo("Spark","Pasto",25,"Fino");
        caballo1.Alimentarse();
        
    }
}
