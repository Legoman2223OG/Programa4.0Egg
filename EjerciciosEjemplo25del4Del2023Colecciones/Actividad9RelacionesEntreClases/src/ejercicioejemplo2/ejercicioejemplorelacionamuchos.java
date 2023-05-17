/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioejemplo2;

import java.util.ArrayList;

/**
 *
 * @author mi tamura
 */
public class ejercicioejemplorelacionamuchos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo equipo= new Equipo();
        ArrayList<Jugador> jugadores= new ArrayList();
        jugadores.add(new Jugador("Jonia","Silviana",1,10));
        jugadores.add(new Jugador("Sesi","Amongus",2,12));
        jugadores.add(new Jugador("Mega","Man",3,30));
        equipo.setEquipo(jugadores);
        equipo.getEquipo().forEach((Jugador juga) -> System.out.println(juga));
    }
    
}
