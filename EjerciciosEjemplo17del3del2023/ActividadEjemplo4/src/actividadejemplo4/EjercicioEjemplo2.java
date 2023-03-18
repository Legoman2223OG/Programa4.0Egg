/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadejemplo4;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class EjercicioEjemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Utilizando un Bucle for, aloja en el vector Equipo, 
        los nombres de tus compañeros de equipo
        */
        String[] EquipoNombres= new String[8];
        for(int i=0;i<EquipoNombres.length;i++){
            System.out.println("Introduce el nombre de tu compañero");
            EquipoNombres[i]= new Scanner(System.in).next();
        }
        System.out.println("Nombres de compañeros: ");
        for(int i=0;i<EquipoNombres.length;i++){
            System.out.println("-"+EquipoNombres[i]);
        }
    }
    
}
