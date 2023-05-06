/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos2;

/**
 *
 * @author mi tamura
 */
public class Libro {
    String nombre;
    String editor;
    int idEditorial;
    public Libro(){
        nombre="";
        editor="Anonimo";
        idEditorial=0;
    }
    public Libro(String nombre, String editor, int idEditorial){
        this.nombre=nombre;
        this.editor= editor;
        this.idEditorial= idEditorial;
    }
    @Override
    public String toString(){
        return "Titulo: "+nombre+"\nEditor: "+editor+"\nId Editorial: "+idEditorial;
    }
}
