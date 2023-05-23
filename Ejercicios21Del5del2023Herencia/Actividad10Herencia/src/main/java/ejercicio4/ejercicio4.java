/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author mi tamura
 */
public class ejercicio4 implements calculosFormas{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El area de un circulo de radio 5 es: "+areaCirculo(5));
        System.out.println("El perimetro de un circulo de diametro 10 es: "+perimetroCirculo(10));
        System.out.println("El area de un rectangulo de base 10 y altura 10 es: "+areaRectangulo(10,10));
        System.out.println("El perimetro de un rectangulo de base 10 y altura 10 es: "+perimetroRectangulo(10,10));
    }

    public static double areaCirculo(double radio) {
        return Math.PI*Math.pow(radio,2);
    }

    public static double perimetroCirculo(double diametro) {
        return Math.PI*diametro;
    }

    public static double areaRectangulo(double base, double altura) {
        return base*altura;
    }

    public static double perimetroRectangulo(double base, double altura) {
        return (base+altura)*2;
    }
    
}
