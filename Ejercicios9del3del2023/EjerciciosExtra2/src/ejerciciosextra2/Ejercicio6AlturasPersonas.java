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
public class Ejercicio6AlturasPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Leer la altura de N personas y determinar el promedio de estaturas 
        que se encuentran por debajo de 1.60 mts. y el promedio de estaturas 
        en general.
        
        PD: Les va a tirar error si ponen el decimal con . van a tener que ponerlo con ,
            Un post de Stackoverflow dice que hay que cambiar el locale a US si se quiere
            poner con .
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            y importar el paquete:
            import java.util.Locale;
        */
        double prombajo,promgen,altura;
        prombajo=0;promgen=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a medirles la altura");
        int n= scan.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Introduzca la altura de la persona en metros: ");
            altura= scan.nextDouble();
            if(altura<1.61) {
                prombajo+=altura;
            }
            promgen+=altura;
        }
        System.out.println("El promedio de gente que mide 1.60 es: "+(prombajo/n));
        System.out.println("El promedio general de alturas es: "+(promgen/n));
        
    }
    
}
