/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos2;

import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList<Libro> libreria= new ArrayList();
        libreria.add(new Libro("Las Aventuras De Manoplo","Saenz Peña",3949));
        libreria.add(new Libro("Al fondo de la tierra","Junio Mambes",3040));
        Iterator it= libreria.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
