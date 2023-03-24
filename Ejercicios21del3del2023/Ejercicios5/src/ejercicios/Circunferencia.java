/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
/*
        Declarar una clase llamada Circunferencia que tenga como atributo 
        privado el radio de tipo real. A continuación, 
        se deben crear los siguientes métodos:
            -Método constructor que inicialice el radio pasado como parámetro.
        
            -Métodos get y set para el atributo radio de la clase Circunferencia.
        
            -Método para crearCircunferencia(): que le pide el radio y lo 
            guarda  en el atributo del objeto.
        
            -Método area(): para calcular el área de la circunferencia 
            (Area=〖π*radio〗^2).
        
            -Método perimetro(): para calcular el perímetro 
            (Perimetro=2*π*radio).

        */
public class Circunferencia {
    private double radio;
    public Circunferencia(double radio){
        this.radio=radio;
    }
    public void perimetro(){
        double perimetro=2*Math.PI*radio;
        System.out.println("El calculo del perimetro es de: "+perimetro);
    }
    public void area(){
        double area= Math.pow((Math.PI*radio), 2);
        System.out.println("El calculo del area es de: "+area);
    }
    public void crearCircunferencia(){
        System.out.println("Introduzca un radio para crear una circunferencia");
        //PD: Talvez tengas que escribirlo con , en vez de . cuando te lo pida.
        radio= new Scanner(System.in).nextDouble();
    }
    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
