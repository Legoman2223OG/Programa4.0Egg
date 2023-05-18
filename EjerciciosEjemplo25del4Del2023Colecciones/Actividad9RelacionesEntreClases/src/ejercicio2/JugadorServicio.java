/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author mi tamura
 */
public class JugadorServicio {
    public void disparo(Jugador jugador,RevolverDeAgua revolver){
       RevolverDeAguaServicio svRev= new RevolverDeAguaServicio();
       svRev.siguienteChorro(revolver);
       if(svRev.mojar(revolver)){
           jugador.setMojado(true);
       }
    }
}
