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
public class Ejercicio9SimulacionDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Simular la división usando solamente restas. 
        Dados dos números enteros mayores que uno, 
        realizar un algoritmo que calcule el cociente y el residuo 
        usando sólo restas. Método: Restar el dividendo del divisor 
        hasta obtener un resultado menor que el divisor, este resultado 
        es el residuo, y el número de restas realizadas es el cociente.
        Por ejemplo: 50 / 13:
        50 – 13 = 37     una resta realizada
        37 – 13 = 24     dos restas realizadas
        24 – 13 = 11     tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
        */
        int cont,rest,cociente;
        cont=0;
        cociente=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        int dividendo= sc.nextInt();
        System.out.println("Ingrese el divisor");
        int divisor= sc.nextInt();
        rest=dividendo;
        while(rest-divisor>=0){
            rest=rest-divisor;
            cociente++;
            System.out.println((rest+divisor)+"-"+divisor+"="+rest);
        }
        System.out.println("La divison entre "+dividendo+"/"+divisor+"="+rest+"\ny su cociente es: "+cociente);
    }
    
}
