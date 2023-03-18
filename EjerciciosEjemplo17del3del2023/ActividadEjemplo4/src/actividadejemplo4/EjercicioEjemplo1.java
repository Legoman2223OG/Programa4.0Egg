/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadejemplo4;

/**
 *
 * @author mi tamura
 */
public class EjercicioEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de 
        compañeros de equipo y define su tipo de dato de tal manera que te 
        permita alojar sus nombres más adelante.
        */
        
        //Creamos el array/vector de tipo String el cual lo llamaremos Equipo
        //y le asignaremos estos valores por default
        //PD: Otra alternativa puede ser creando la variable de arreglo como
        //la siguiente:
        //String Equipo[]={"Datos","Aaa"...}
        //Pero sigue siendo lo mismo
        //O otra alternativa es instanciandolo
        //String Equipo[]= new String[cantidad];
        //Y luego vamos agregando los valores por sus respectivos indices
        //Equipo[0] = "Alejandro"  //Este es el indice 1 Siempre empieza de
        //0 a la cantidad maxima restandole 1.
        //Ya que los arrays usan el 0 como su primer numero.
        String[] Equipo= {"Jorge","Juarez","Simba","Sarabambiche"};
        //Lo recorremos en un bucle para/for
        for(int i=0;i<Equipo.length;i++){
            System.out.println("Integrante del equipo: "+ Equipo[i]);
        }
    }
    
}
