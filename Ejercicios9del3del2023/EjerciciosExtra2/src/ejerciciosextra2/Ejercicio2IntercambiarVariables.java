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
public class Ejercicio2IntercambiarVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Declarar cuatro variables de tipo entero A, B, C y D 
        y asignarle un valor diferente a cada una. 
        A continuación, realizar las instrucciones necesarias 
        para que: B tome el valor de C, C tome el valor de A, A 
        tome el valor de D y D tome el valor de B. Mostrar los 
        valores iniciales y los valores finales de cada variable. 
        Utilizar sólo una variable auxiliar.
        */
        int A,B,BOrig,C,D;
        A=1;
        B=2;
        BOrig=B;
        C=3;
        D=4;
        System.out.println("A: "+A+"\nB: "+B+"\nC: "+C+"\nD: "+D+"\n");
        B=C;
        C=A;
        A=D;
        D=BOrig;
        System.out.println("Intercambiados: \nA: "+A+"\nB: "+B+"\nC: "+C+"\nD: "+D);
        
    }
    
}
