/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extra;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author mi tamura
 */
public class Voto {
    Alumno votador;
    HashSet<Alumno> votadosPorAlumno;

    public HashSet<Alumno> getVotadosPorAlumno() {
        return votadosPorAlumno;
    }

    public void setVotadosPorAlumno(HashSet<Alumno> votadosPorAlumno) {
        this.votadosPorAlumno = votadosPorAlumno;
    }

    public Voto(Alumno votador) {
        this.votador = votador;
    }

    public Alumno getVotador() {
        return votador;
    }

    public void setVotador(Alumno votador) {
        this.votador = votador;
    }

   
    
}
