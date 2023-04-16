/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author mi tamura
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Programa Nespresso. Desarrolle una clase Cafetera en el paquete 
        Entidades con los atributos capacidadMáxima (la cantidad máxima 
        de café que puede contener la cafetera) y cantidadActual (la cantidad 
        actual de café que hay en la cafetera). Agregar constructor vacío y 
        con parámetros así como setters y getters. Crear clase CafeteraServicio 
        en el paquete Servicios con los siguiente:
        
        -Método llenarCafetera(): hace que la cantidad actual sea igual a 
        la capacidad máxima. 
        
        -Método servirTaza(int): se pide el tamaño de una taza vacía, 
        el método recibe el tamaño de la taza y simula la acción de servir 
        la taza con la capacidad indicada. Si la cantidad actual de café 
        “no alcanza” para llenar la taza, se sirve lo que quede. El método 
        le informará al usuario si se llenó o no la taza, y de no haberse 
        llenado en cuanto quedó la taza.
        
        -Método vaciarCafetera(): pone la cantidad de café actual en cero. 
        
        -Método agregarCafe(int): se le pide al usuario una cantidad de café, 
        el método lo recibe y se añade a la cafetera la cantidad de café indicada.

        */
        CafeteraServicio cafetServicio= new CafeteraServicio();
        Cafetera cafetera= new Cafetera(200);
        cafetServicio.llenarCafetera(cafetera);
        cafetServicio.servirTaza(cafetera, 50);
        cafetServicio.agregarCafe(cafetera, 50);
        cafetServicio.servirTaza(cafetera, 180);
        cafetServicio.servirTaza(cafetera, 30);
    }
    
}
