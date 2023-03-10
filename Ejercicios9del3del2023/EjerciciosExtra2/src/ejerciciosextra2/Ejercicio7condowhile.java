/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra2;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio7condowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realice un programa que calcule y visualice el valor máximo,
        el valor mínimo y el promedio de n números (n>0). El valor de n 
        se solicitará al principio del programa y los números serán introducidos
        por el usuario. Realice dos versiones del programa, una usando el bucle 
        “while” y otra con el bucle “do - while”.
        */
        int min,max,cont,n;
        double prom=0;
        cont=0;
        n=0;
        min=0;
        max=0;
        boolean startminmax=true;
        do{
            System.out.println("Introduce un numero: ");
            n= new Scanner(System.in).nextInt();
            if(startminmax){
                min=n;
                max=n;
                startminmax=false;
            }
            if(n>max)max=n;
            else if (n<min && n>0) min=n;
            cont+=1;
            prom+=n;
        }while(n>0);
        prom/=cont;
        System.out.println("Numero maximo: "+max+"\nNumero minimo: "+min+"\nPromedio: "+prom);
    }
    
}
