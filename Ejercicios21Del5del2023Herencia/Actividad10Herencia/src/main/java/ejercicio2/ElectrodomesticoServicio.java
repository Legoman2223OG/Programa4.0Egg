/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class ElectrodomesticoServicio {
    Scanner sc= new Scanner(System.in);
    public Electrodomestico crearElectrodomestico(){
        String color;
        double peso;
        char consumoElectrico;
        System.out.println("Ingrese el color para el electrodomestico"
                + "(Blanco/Negro/Azul/Rojo/Gris)");
        color= sc.next();
        System.out.println("Ingrese el peso del electrodomestico (kg)");
        peso= sc.nextDouble();
        System.out.println("Ingrese el consumo electrico del electrodomestico"
                + "A-F");
        consumoElectrico= sc.next().charAt(0);
        return new Electrodomestico(1000,color,consumoElectrico,peso);
    }
    public void precioFinal(Electrodomestico electrodomestico){
        switch(electrodomestico.getConsumoElectrico()){
            case 'A':
                electrodomestico.setPrecio(electrodomestico.getPrecio()+1000);
                break;
            case 'B':
                electrodomestico.setPrecio(electrodomestico.getPrecio()+800);
                break;
            case 'C':
                electrodomestico.setPrecio(electrodomestico.getPrecio()+600);
                break;
            case 'D':
                electrodomestico.setPrecio(electrodomestico.getPrecio()+500);
                break;
            case 'E':
                electrodomestico.setPrecio(electrodomestico.getPrecio()+300);
                break;
            case 'F':
                electrodomestico.setPrecio(electrodomestico.getPrecio()+100);
                break;
            default:
                System.out.println("No se encontro ese tipo de consumo electrico.");
        }
        if(electrodomestico.getPeso()>=1&&electrodomestico.getPeso()<=19) electrodomestico.setPrecio(electrodomestico.getPrecio()+100);
        else if(electrodomestico.getPeso()>=20 && electrodomestico.getPeso()<=49) electrodomestico.setPrecio(electrodomestico.getPrecio()+500);
        else if(electrodomestico.getPeso()>=50 && electrodomestico.getPeso()<=79) electrodomestico.setPrecio(electrodomestico.getPrecio()+800);
        else electrodomestico.setPrecio(electrodomestico.getPrecio()+1000);
    }
}
