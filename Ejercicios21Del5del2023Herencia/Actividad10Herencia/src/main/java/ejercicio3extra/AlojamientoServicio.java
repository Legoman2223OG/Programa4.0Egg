/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3extra;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author mi tamura
 */
public class AlojamientoServicio {
    public void MostrarAlojamientos(ArrayList<Alojamiento> listaAlojamientos){
        System.out.println("LISTA DE ALOJAMIENTOS");
        System.out.println("------------------------------------");
        listaAlojamientos.forEach((Alojamiento aloja)-> System.out.println(aloja));
        System.out.println("------------------------------------");
    }
    private ArrayList<Hotel> obtenerListaHoteles(ArrayList<Alojamiento> listaAlojamiento){
        ArrayList<Hotel> listaHoteles = new ArrayList();
        for(Alojamiento aloj: listaAlojamiento){
            if(aloj.getClass() == Hotel4Estrellas.class || aloj.getClass()== Hotel5Estrellas.class) {
                Hotel hot= (Hotel) aloj;
                listaHoteles.add(hot);
            }
        }
        return listaHoteles;
    }
    public void MostrarHotelesCarosABaratos(ArrayList<Alojamiento> listaAlojamiento){
        ArrayList<Hotel> listaHoteles= obtenerListaHoteles(listaAlojamiento);
        listaHoteles.sort(new Comparator<Hotel>(){
            public int compare(Hotel hot1, Hotel hot2){
                if(hot1.getPrecioHabitaciones()> hot2.getPrecioHabitaciones()) return -1;
                else if(hot1.getPrecioHabitaciones()==hot2.getPrecioHabitaciones()) return 0;
                else return 1;
            }
        });
        
        System.out.println("LISTA DE HOTELES DE CARO A MAS BARATO");
        System.out.println("------------------------------------");
        listaHoteles.forEach((Hotel hot)-> System.out.println(hot));
        System.out.println("------------------------------------");
    }
    public void MostrarCampingsConRestaurante(ArrayList<Alojamiento> listaAlojamiento){
        System.out.println("LISTA DE CAMPAMENTOS CON RESTAURANTE");
        System.out.println("------------------------------------");
        for(Alojamiento aloj:listaAlojamiento){
            if(aloj.getClass()== Camping.class){
                Camping camp= (Camping) aloj;
                if(camp.isPoseeRestaurante()) System.out.println(camp.getNombre());
            }
        }
        System.out.println("------------------------------------");
    }
    public void MostrarResidenciasConDescuento(ArrayList<Alojamiento> listaAlojamiento){
        System.out.println("LISTA DE RESIDENCIAS CON DESCUENTO A GREMIO");
        System.out.println("------------------------------------");
        for(Alojamiento aloj:listaAlojamiento){
            if(aloj.getClass()== Residencia.class){
                Residencia resd= (Residencia) aloj;
                if(resd.isDescuentoAGremios()) System.out.println(resd.getNombre());
            }
        }
        System.out.println("------------------------------------");
    }
}
