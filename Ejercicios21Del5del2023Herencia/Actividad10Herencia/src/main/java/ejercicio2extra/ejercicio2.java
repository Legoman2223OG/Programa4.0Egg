/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2extra;

import java.util.ArrayList;

/**
 *
 * @author mi tamura
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    /*
    Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
    edificio tendrá como métodos:
    • Método calcularSuperficie(): calcula la superficie del edificio.
    • Método calcularVolumen(): calcula el volumen del edifico.
    Estos métodos serán abstractos y los implementarán las siguientes clases:
    • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
    Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
    • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
    por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
    los atributos del padre.
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
    usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
    (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
    cuantas personas entrarían en un piso y cuantas en todo el edificio.

    16
    Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
    dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
    métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
    superficie y el volumen de cada edificio.
    Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
    techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
    cantPersonas() y mostrar los resultados de cada edificio de oficinas.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        EdificioServicio eSv= new EdificioServicio();
        ArrayList<Edificio> listaEdificios= new ArrayList();
        listaEdificios.add(new Polideportivo("Jorge lopez",Instalacion.ABIERTO,10,10,10));
        listaEdificios.add(new Polideportivo("Ana juana",Instalacion.TECHADO,5,5,5));
        listaEdificios.add(new EdificioDeOficinas(3,5,5,4,4,4));
        listaEdificios.add(new EdificioDeOficinas(2,10,3,6,6,6));
        eSv.verVolumenYSuperficieDeEdificios(listaEdificios);
        eSv.verCantDeportivosConTechadoYDescubierto(listaEdificios);
        eSv.verOficinasConSuCantidadDePersonas(listaEdificios);
    }
    
}
