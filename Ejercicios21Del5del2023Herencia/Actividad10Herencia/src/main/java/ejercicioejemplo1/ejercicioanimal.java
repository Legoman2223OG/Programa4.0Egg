/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioejemplo1;

import java.util.ArrayList;

/**
 *
 * @author mi tamura
 */
public class ejercicioanimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo 
        “Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el 
        método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear 
        un ArrayList de animales y los siguientes animales
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al 
        método hacerRuido() de cada ítem.
        */
        ArrayList<Animal> listaAnimales= new ArrayList();
        listaAnimales.add(new Animal());
        listaAnimales.add(new Perro());
        listaAnimales.add(new Gato());
        listaAnimales.forEach(animal-> animal.hacerRuido());
    }
    
}
