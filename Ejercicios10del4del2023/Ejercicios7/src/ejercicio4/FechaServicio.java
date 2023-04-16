/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class FechaServicio {
    public Date fechaNacimiento(){
        Scanner sc= new Scanner(System.in);
        int dia,mes,anio; 
        System.out.println("Ingrese su dia de nacimiento (1-31): ");
        dia= sc.nextInt();
        System.out.println("Ingrese el mes de nacimiento (1-12): ");
        mes= sc.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        anio= sc.nextInt();
        
        return new Date(dia,mes,anio);
    }
    public Date fechaActual(){
        return new Date();
    }
    public int diferencia(Date fecha1,Date fecha2){
        return fecha1.getYear()>fecha2.getYear()? fecha1.getYear()-fecha2.getYear(): fecha2.getYear()-fecha1.getYear();
    }
}
