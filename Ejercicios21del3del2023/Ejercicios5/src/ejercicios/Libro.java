/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author mi tamura
 */
/*
/*
        Crear una clase llamada Libro que contenga los siguientes atributos: 
        ISBN, Título, Autor, Número de páginas, y un constructor con todos 
        los atributos pasados por parámetro y un constructor vacío. 
        Crear un método para cargar un libro pidiendo los datos al usuario 
        y luego informar mediante otro método el número de ISBN, el título, 
        el autor del libro y el número de páginas.
        
*/
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int nPaginas;
    public Libro(){
        //Los ISBN son de 13 cifras pero en total solo podemos hacer un numero de
        //10 digitos...
        ISBN= (int)(Math.random()*1000000000);
        titulo= "Sin titulo";
        autor="Autor desconocido";
        nPaginas= 0;
    }
    public Libro(int ISBN,String titulo,String autor,int nPaginas){
        this.ISBN= ISBN;
        this.titulo= titulo;
        this.autor= autor;
        this.nPaginas= nPaginas;
    }
    /*Tip: Si queres hacer getters y setters sin escribirlos manualmente 
    haz click derecho y selecciona Insert Code y selecciona getters and setters
    dentro de la UI selecciona los elementos de libro y listo.*/
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
    
}
