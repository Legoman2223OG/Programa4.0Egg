/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Comparator;

/**
 *
 * @author mi tamura
 */
public class Pelicula {
    String titulo,director;
    Integer duracionPeli; //SE MIDE EN HORAS
    public Pelicula(){
        titulo="";
        director="Anonimo";
        duracionPeli= new Integer(0);
    }
    public Pelicula(String titulo,String director, int duracionPeli){
        this.titulo= titulo;
        this.director= director;
        this.duracionPeli= new Integer(duracionPeli);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracionPeli() {
        return duracionPeli;
    }

    public void setDuracionPeli(int duracionPeli) {
        this.duracionPeli = duracionPeli;
    }
    
    public static Comparator<Pelicula> compararMayorDuracion= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1,Pelicula p2){
            if(p1.getDuracionPeli()> p2.getDuracionPeli()) return -1;
            else if(p1.getDuracionPeli()==p2.getDuracionPeli()) return 0;
            else return 1;
        }
    };
    public static Comparator<Pelicula> compararMenorDuracion= new Comparator<Pelicula>(){
        public int compare(Pelicula p1,Pelicula p2){
            if(p1.getDuracionPeli()< p2.getDuracionPeli()) return -1;
            else if(p1.getDuracionPeli()==p2.getDuracionPeli()) return 0;
            else return 1;
        }
    };
    public static Comparator<Pelicula> compararAlfabeticamente= new Comparator<Pelicula>(){
        public int compare(Pelicula p1,Pelicula p2){
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    public static Comparator<Pelicula> compararDirectorAlfabeticamente= new Comparator<Pelicula>(){
        public int compare(Pelicula p1,Pelicula p2){
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
}
