/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra4;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio6SopaDeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 
        caracteres y, a medida que el usuario las va ingresando, construya 
        una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
        Las palabras se ubicarán todas en orden horizontal en una fila que 
        será seleccionada de manera aleatoria. Una vez concluida la ubicación
        de las palabras, rellene los espacios no utilizados con un número
        aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de 
        letras creada.
        */
        String palabra="";
        int cont=0;
        String[][] sopaDeLetras= new String[20][20];
        for(int i=0;i<5;i++){
            System.out.println("Ingrese una palabra de 3 a 5 letras");
            do{
                palabra= new Scanner(System.in).next();
            }while(palabra.length()<3 || palabra.length()>5);
            if(cont>=20) cont=0;
            for(int z=0;z<palabra.length();z++){
                int seleccionFila= (int)(Math.random()*19);
                sopaDeLetras[seleccionFila][cont]= palabra.substring(i,(i+1));
                cont++;
                System.out.println(cont);
            }
        }
        for(int i=0;i<20;i++){
            for(int z=0;z<20;z++){
                if(sopaDeLetras[i][z]==null){
                    sopaDeLetras[i][z]=Integer.toString(((int)(Math.random()*9.9)));
                }
            }
        }
        for(int i=0;i<20;i++)
        {
            System.out.println("------------------------------------------------------------");
            for(int z=0;z<20;z++){
                System.out.print("|"+sopaDeLetras[i][z]);
            }
            System.out.print("|");
            System.out.println("");
        }
    }
    
}
