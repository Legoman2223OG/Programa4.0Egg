/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author mi tamura
 */
public class Libro {
    String titulo,autor;
    int nroEjemplares,nroEjemplaresPrestados;

    public Libro(String titulo, String autor, int nroEjemplares, int nroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroEjemplares = nroEjemplares;
        this.nroEjemplaresPrestados = nroEjemplaresPrestados;
    }

    public Libro() {
    }
    @Override
    public String toString(){
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nNumero Ejemplares: "+nroEjemplares+"\nNumero Ejemplares Prestados: "+nroEjemplaresPrestados;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroEjemplares() {
        return nroEjemplares;
    }

    public void setNroEjemplares(int nroEjemplares) {
        this.nroEjemplares = nroEjemplares;
    }

    public int getNroEjemplaresPrestados() {
        return nroEjemplaresPrestados;
    }

    public void setNroEjemplaresPrestados(int nroEjemplaresPrestados) {
        this.nroEjemplaresPrestados = nroEjemplaresPrestados;
    }
    
}
