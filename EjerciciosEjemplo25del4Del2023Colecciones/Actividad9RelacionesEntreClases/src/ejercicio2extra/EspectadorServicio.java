/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2extra;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class EspectadorServicio {
    Scanner sc= new Scanner(System.in);
    public Espectador crearEspectador(){
        String nombre;
        int edad;
        double dinero;
        System.out.println("Ingrese el nombre del espectador: ");
        nombre= sc.nextLine();
        System.out.println("Ingrese la edad del espectador: ");
        edad= sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el dinero del espectador: ");
        dinero= sc.nextDouble();
        sc.nextLine();
        return new Espectador(nombre,edad,dinero);
    }
}
