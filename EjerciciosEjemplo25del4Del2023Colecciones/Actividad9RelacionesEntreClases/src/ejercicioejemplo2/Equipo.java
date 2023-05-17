/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioejemplo2;

import java.util.ArrayList;

/**
 *
 * @author mi tamura
 */
public class Equipo {
    ArrayList<Jugador> equipo;

    public Equipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }

    public Equipo() {
    }

    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }
}
