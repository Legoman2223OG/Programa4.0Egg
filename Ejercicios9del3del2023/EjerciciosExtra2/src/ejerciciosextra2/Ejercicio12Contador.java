/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra2;

/**
 *
 * @author mi tamura
 */
public class Ejercicio12Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Necesitamos mostrar un contador con 3 dígitos (X-X-X), 
        que muestre los números del 0-0-0 al 9-9-9, con la particularidad 
        que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
            0-0-0
            0-0-1
            0-0-2
            0-0-E
            0-0-4
            0-1-2
            0-1-E
        Nota: investigar función equals() y como convertir números a String.
        */
        for(int i=0;i<=9;i++){
            for(int z=0;z<=9;z++){
                for(int c=0;c<=9;c++){
                    //Esto se llama operador ternario
                    //Solo se utiliza si es que haremos operaciones if de una sola linea
                    //En variables cuando solo devuelven 1 solo valor
                    String contador= (Integer.toString(i).equals("3") ? "E" : Integer.toString(i))+"-"+
                                     (Integer.toString(z).equals("3") ? "E" : Integer.toString(z))+"-"+
                                     (Integer.toString(c).equals("3") ? "E" : Integer.toString(c));
                    System.out.println(contador);
                }
            }
        }
    }
    
}
