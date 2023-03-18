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
public class Ejercicio4AlumnosEggVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Los profesores del curso de programación de Egg necesitan llevar 
        un registro de las notas adquiridas por sus 10 alumnos para luego 
        obtener una cantidad de aprobados y desaprobados. Durante el período 
        de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos 
        evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
        
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        
        Una vez cargadas las notas, se calcula el promedio y se guarda en el 
        arreglo. Al final del programa los profesores necesitan obtener por 
        pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta 
        que solo aprueban los alumnos con promedio mayor o igual al 7 de sus 
        notas del curso.

        */
        int contDesaprobados=0,contAprobados=0;
        Scanner sc= new Scanner(System.in);
        double promedio=0;
        int nota=0;
        double[][] alumnosEgg= new double[10][5];
        for(int i=0;i<10;i++){
            System.out.println("Notas de alumno n°"+(i+1));
            for(int z=0;z<4;z++){
                    switch(z){
                    case 0:
                        System.out.println("Ingrese la nota del primer trabajo practico evaluativo (1-10)");
                        do{
                            nota=sc.nextInt();
                            if(nota<0 || nota>10) System.out.println("Ingrese la nota correctamente");
                        }while(nota<0 || nota>10);
                        promedio+= nota*0.10;
                        break;
                    case 1:
                        System.out.println("Ingrese la nota del segundo trabajo practico evaluativo (1-10)");
                        do{
                            nota=sc.nextInt();
                            if(nota<0 || nota>10) System.out.println("Ingrese la nota correctamente");
                        }while(nota<0 || nota>10);
                        promedio+= nota*0.15;
                        break;
                    case 2:
                            System.out.println("Ingrese la nota del primer integrador (1-10)");
                        do{
                            nota=sc.nextInt();
                            if(nota<0 || nota>10) System.out.println("Ingrese la nota correctamente");
                        }while(nota<0 || nota>10);
                        promedio+= nota*0.25;
                        break;
                    case 3:
                            System.out.println("Ingrese la nota del segundo integrador (1-10)");
                        do{
                            nota=sc.nextInt();
                            if(nota<0 || nota>10) System.out.println("Ingrese la nota correctamente");
                        }while(nota<0 || nota>10);
                        promedio+= nota*0.50;
                        break;
                }
                alumnosEgg[i][z]=nota;
            }
            alumnosEgg[i][4]= promedio;
            promedio=0;
        }
        //APROBADOS Y DESAPROBADOS
        for(int i=0;i<10;i++){
            if(alumnosEgg[i][4]>=7) contAprobados++;
            else contDesaprobados++;
        }
        System.out.println("La cantidad de alumnos aprobados son: "+ contAprobados+"\nLa cantidad de alumnos desaprobados son: "+contDesaprobados);
        
    }
    
}
