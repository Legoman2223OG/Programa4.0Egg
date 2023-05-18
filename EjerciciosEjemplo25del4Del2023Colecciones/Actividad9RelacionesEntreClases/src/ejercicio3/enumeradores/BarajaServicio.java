/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.enumeradores;

import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author mi tamura
 */
public class BarajaServicio {
    public void barajar(Baraja baraja){
        //Cambia la posicion aleatoriamente de todas las cartas.
        Collections.shuffle(baraja.getCartas());
    }
    public Carta siguienteCarta(Baraja baraja){
        Iterator it= baraja.getCartas().iterator();
        while(it.hasNext()){
            return (Carta) it.next();
        }
        System.out.println("No se encontro una siguiente carta");
        return null;
    }
    public int cartasDisponibles(Baraja baraja){
        return baraja.getCartas().size();
    }
    public void darCartas(Baraja baraja,int cant){
        if(cant > cartasDisponibles(baraja)) System.out.println("No quedan suficientes cartas para dar.");
        else{
            Iterator it= baraja.getCartas().iterator();
            for(int i=0;i<cant;i++){
                it.next();
                it.remove();
            }
        }
    }
    public void cartasMonton(Baraja baraja){
        System.out.println("Cantidad de cartas salidas: "+(40-cartasDisponibles(baraja)));
    }
    public void mostrarBaraja(Baraja baraja){
        baraja.getCartas().forEach((Carta carta) -> System.out.println(carta));
    }
}
