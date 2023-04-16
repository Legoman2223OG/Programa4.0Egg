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
/*
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
public class CafeteraServicio {
    public void llenarCafetera(Cafetera cafet){
        cafet.setCantidadActual(cafet.getCapacidadMaxima());
        System.out.println("Se lleno la cafetera");
    }
    public void servirTaza(Cafetera cafet, int tamanio){
        if((cafet.getCantidadActual()-tamanio)<0){
            System.out.println("No se pudo llenar la taza completamente"
                    + " la taza quedo en "+cafet.getCantidadActual());
            cafet.setCantidadActual(0);
        }
        else {
            cafet.setCantidadActual(cafet.getCantidadActual()-tamanio);
            System.out.println("Taza servida completamente");
        }
    }
    public void vaciarCafetera(Cafetera cafet){
        cafet.setCantidadActual(0);
        System.out.println("Se vacio la cafetera");
    }
    public void agregarCafe(Cafetera cafet,int cant){
        if((cafet.getCantidadActual()+cant)>cafet.getCapacidadMaxima()){
            System.out.println("No se puede agregar mas de la capacidad actual");
        }
        else if((cafet.getCantidadActual()+cant)<=cafet.getCapacidadMaxima()){
            cafet.setCantidadActual(cafet.getCantidadActual()+cant);
            System.out.println("Se agrego "+cant+" de cafe a la cafetera");
        }
    }
}
