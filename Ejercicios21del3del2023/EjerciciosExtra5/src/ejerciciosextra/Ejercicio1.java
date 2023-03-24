/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Desarrollar una clase Cancion con los siguientes atributos: 
        título y autor. Se deberá́ definir además dos constructores: 
        uno vacío que inicializa el título y el autor a cadenas vacías 
        y otro que reciba como parámetros el título y el autor de la canción. 
        Se deberán además definir los métodos getters y setters correspondientes.
        */
        Cancion cancion= new Cancion();
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el nombre de la cancion y su autor");
        cancion.setTitulo(sc.nextLine());
        cancion.setAutor(sc.nextLine());
        System.out.println("Titulo de la cancion: "+cancion.getTitulo()
                +"\nAutor de la cancion: "+cancion.getAutor()
        );
    }
    
}
