/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1extra;

import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author mi tamura
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    /*
    En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
    nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
    amarre y el barco que lo ocupará.
    Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
    Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
    • Número de mástiles para veleros.
    • Potencia en CV para barcos a motor.
    • Potencia en CV y número de camarotes para yates de lujo.
    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
    multiplicando por 10 los metros de eslora).
    En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
    sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
    en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
    el número de camarotes.
    Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
    métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
    precio final de su alquiler.
    */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        AlquilerServicio aSv= new AlquilerServicio();
        HashSet<Barco> listaBarcos= new HashSet();
        listaBarcos.add(new BarcoAMotor("5-CB-2-300-20", 30, new Date(99,5,14),10));
        listaBarcos.add(new Yate("5-CB-2-300-20", 30, new Date(100,1,19),20,3));
        listaBarcos.add(new Velero("3-BA-3-999-20", 20, new Date(100,3,20), 2));
        Alquiler usuario= aSv.crearAlquiler(listaBarcos);
        aSv.calcularPrecioFinal(usuario);
    }
    
}
