/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class AlquilerServicio {
    Scanner sc= new Scanner(System.in);
    SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
    //Aca se vera que se indica algo de  throw en la clase
    //Esto es porque algunos metodos pueden tener funciones/procedimientos
    //Que no del todo puedan ejecutarse perfectamente por lo cual se tiene
    //que entre ponerlo con un try/catch o indicarle que la funcion/procedimiento
    //Hace un throw de la excepcion del tipo de error que puede suceder en la
    //funcion si no llega a funcionar.
    //Eso lo veremos mas adelante.
    //PD: SimpleDateFormat es el que tiene este tipo de error que puede suceder.
    public Alquiler crearAlquiler(HashSet<Barco> listaBarcos) throws ParseException{
        String nombre,documento,fechaAlquiler,fechaDevolucion,tipoamarre,matricula;
        Date fechaAl,fechaDev;
        Amarre posAmarre;
        Barco barcoElegido=null;
        System.out.println("Ingrese el nombre del cliente: ");
        nombre= sc.next();
        System.out.println("Ingrese el documento del cliente (Debe ser de 8 digitos): ");
        documento= sc.next();
        System.out.println("Ingrese la fecha de alquiler (dd/mm/yyyy): ");
        fechaAlquiler= sc.next();
        fechaAl= sdf.parse(fechaAlquiler);
        System.out.println("Ingrese la fecha de devolucion (dd/mm/yyyy): ");
        fechaDevolucion= sc.next();
        fechaDev= sdf.parse(fechaDevolucion);
        System.out.println("Eliga el tipo de posicion de amarre para el barco "+"\nTIPOS: \n"
                + "-BARCO_A_BARCO\n-AMARRE_UNICO\n-AMARRE_MULTIBOYA\n-AMARRE_BALTICO\n-AMARRE_MEDITERRANEO\n-AMARRE_CON_ANCLA");
        tipoamarre= sc.next();
        switch(tipoamarre){
            case "BARCO_A_BARCO" -> posAmarre= Amarre.BARCO_A_BARCO;
            case "AMARRE_UNICO" -> posAmarre= Amarre.AMARRE_UNICO;
            case "AMARRE_MULTIBOYA" -> posAmarre= Amarre.AMARRE_MULTIBOYA;
            case "AMARRE_BALTICO" -> posAmarre= Amarre.AMARRE_BALTICO;
            case "AMARRE_MEDITERRANEO" -> posAmarre= Amarre.AMARRE_MEDITERRANEO;
            case "AMARRE_CON_ANCLA" -> posAmarre= Amarre.AMARRE_CON_ANCLA;
            default -> { 
                System.out.println("Ese amarre no existe, por lo cual se elegira Amarre unico por default");
                posAmarre= Amarre.AMARRE_UNICO;
            }
        }
        
        System.out.println("Eliga un barco de la lista de barcos (Eliga por su matricula):");
        listaBarcos.forEach((barco)-> System.out.println("Matricula: "+barco.getMatricula()+"\nTipo de barco: "+barco.getClass().getSimpleName()));
        while(true){
            matricula= sc.next();
            for(Barco barco: listaBarcos){
                if(barco.getMatricula().equals(matricula)) barcoElegido= barco;
            }
            if(barcoElegido!=null) break;
            else System.out.println("No existe un barco con tal matricula... intente de nuevo");
        }
        return new Alquiler(nombre, documento, fechaAl, fechaDev,posAmarre, barcoElegido); 
    }
    public void calcularPrecioFinal(Alquiler alquiler){
        int dias= Math.abs((int) ((alquiler.getFechaAlquiler().getTime()- alquiler.getFechaDevolucion().getTime())/86400000));
        System.out.println("Precio final del alquiler: "+dias*alquiler.getBarco().getEslora()); 
    }
}
