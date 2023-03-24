/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

/**
 *
 * @author mi tamura
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    /*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario
los dos números y los ingresa en los atributos del objeto. Después, a través 
de otro método calcular y devolver la distancia que existe entre los dos puntos
que existen en la clase Puntos. Para conocer como calcular la distancia entre 
dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
*/
    public static void main(String[] args) {
        // TODO code application logic here
        Puntos puntos= new Puntos();
        puntos.crearPuntos();
        System.out.println("La distancia entre ("+puntos.getX1()+","+puntos.getY1()+")"+" y ("+puntos.getX2()+","+puntos.getY2()+")"
                        +" es de "+puntos.distanciaEntrePuntos()
        );
    }
    
}
