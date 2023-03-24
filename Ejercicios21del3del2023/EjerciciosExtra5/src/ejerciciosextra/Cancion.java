/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

/**
 *
 * @author mi tamura
 */
/*
        Desarrollar una clase Cancion con los siguientes atributos: 
        título y autor. Se deberá́ definir además dos constructores: 
        uno vacío que inicializa el título y el autor a cadenas vacías 
        y otro que reciba como parámetros el título y el autor de la canción. 
        Se deberán además definir los métodos getters y setters correspondientes.
        */
public class Cancion {
    private String titulo,autor;
    public Cancion(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    public Cancion(){
        titulo="";
        autor="";
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
    
}
