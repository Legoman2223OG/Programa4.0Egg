/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.entidades;

/**
 *
 * @author mi tamura
 */
public class Comentarios {
    String comentario;
    int idCasa,idComentario;

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public Comentarios() {
    }

    public Comentarios(String comentario, int idCasa, int idComentario) {
        this.comentario = comentario;
        this.idCasa = idCasa;
        this.idComentario = idComentario;
    }
}
