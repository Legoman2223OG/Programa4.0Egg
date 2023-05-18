/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author mi tamura
 */
public class JuegoServicio {
    public Juego llenarJuego(ArrayList<Jugador> jugadores,RevolverDeAgua r){
        Juego nuevoJuego= new Juego(r);
        nuevoJuego.setListaJugadores(jugadores);
        return nuevoJuego;
    }
    public void ronda(Juego juego){
        JugadorServicio jSv= new JugadorServicio();
        int contRonda=1;
        String jugadorMojado="";
        while(jugadorMojado.equals("")){
            System.out.println("Ronda "+contRonda);
            for(Jugador jugador: juego.getListaJugadores()){
                System.out.println("El jugador "+jugador.getNombre()+" va a disparar.");
                jSv.disparo(jugador, juego.getRevolver());
                jugadorMojado= jugador.isMojado()? jugador.getNombre(): "";
                System.out.println(jugador.isMojado()?"Se mojo!":"No paso nada");
                if(!jugadorMojado.equals("")) break;
            }
            contRonda++;
        }
        System.out.println("Se termino el juego!\nEl jugador que se mojo fue: "+jugadorMojado);
    }
}
