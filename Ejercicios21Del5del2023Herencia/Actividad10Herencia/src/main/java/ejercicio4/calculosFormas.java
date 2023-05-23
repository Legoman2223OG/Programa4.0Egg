/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author mi tamura
 */
public interface calculosFormas {
    public static double areaCirculo(double radio){
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
