/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.enumeradores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Palo[] palos= Palo.values();
        ArrayList<Carta> cartas = new ArrayList();
        for(int i=0; i < palos.length;i++){
            for(int z=1;z<13;z++){
                if(z!=8&&z!=9){
                    cartas.add(new Carta(palos[i],z));
                }
            }
        }
        Baraja baraja= new Baraja(cartas);
        BarajaServicio bSv= new BarajaServicio();
        bSv.barajar(baraja);
        bSv.mostrarBaraja(baraja);
        System.out.println("Cartas disponibles: "+ bSv.cartasDisponibles(baraja));
        System.out.println(bSv.siguienteCarta(baraja));
        bSv.darCartas(baraja, 2);
        System.out.println("Cartas disponibles: "+ bSv.cartasDisponibles(baraja));
        bSv.cartasMonton(baraja);
    }
    
}
