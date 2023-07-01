/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencias;

import estancias.entidades.Comentarios;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author mi tamura
 */
public final class ComentariosDAO extends DAO{
    private CasasDAO daoc;
    public ComentariosDAO(){
        this.daoc= new CasasDAO();
    }
    public void crearComentario(Comentarios comentario) throws Exception{
        try{
            if(comentario == null)
                throw new Exception("Debe indicar un comentario");
            String sql = "INSERT into comentarios (comentario,id_casa,id_comentario) VALUES('"+comentario.getComentario()+"',"+comentario.getIdCasa()+","+comentario.getIdComentario()+");";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void modificarComentario(Comentarios comentario) throws Exception{
        try{
            if(comentario == null)
                throw new Exception("Debe indicar un comentario");
            String sql= "UPDATE comentarios SET comentario = '"+comentario.getComentario()+"', id_casa = "+comentario.getIdCasa()+" WHERE id_comentario = "+comentario.getIdComentario()+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void eliminarComentario(int idcomentario) throws Exception{
        try{
            String sql= "DELETE from comentarios WHERE id_comentario = "+idcomentario+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public Comentarios buscarComentarioPorIdCasa(int idcasa) throws Exception{
        try{
            String sql= "SELECT * from comentarios WHERE id_casa = "+idcasa+";";
            consultarBase(sql);
            Comentarios comentario = null;
            while(resultado.next()){
                comentario = new Comentarios();
                comentario.setComentario(resultado.getString(3));
                comentario.setIdCasa(resultado.getInt(2));
                comentario.setIdComentario(resultado.getInt(1));
            }
            desconectarBase();
            return comentario;
        }
        catch(Exception e){
            desconectarBase();
            throw e;
        }
    }
    public Comentarios buscarComentarioPorId(int idcomentario) throws Exception{
        try{
            String sql= "SELECT * from comentarios WHERE id_comentario = "+idcomentario+";";
            consultarBase(sql);
            Comentarios comentario = null;
            while(resultado.next()){
                comentario = new Comentarios();
                comentario.setComentario(resultado.getString(3));
                comentario.setIdCasa(resultado.getInt(2));
                comentario.setIdComentario(resultado.getInt(1));
            }
            desconectarBase();
            return comentario;
        }
        catch(Exception e){
            desconectarBase();
            throw e;
        }
    }
    public Collection<Comentarios> listarComentarios() throws Exception{
        try{
            String sql = "SELECT * from comentarios";
            consultarBase(sql);
            Comentarios comentario;
            ArrayList<Comentarios> listaComentarios = new ArrayList();
            while(resultado.next()){
                comentario = new Comentarios();
                comentario.setComentario(resultado.getString(3));
                comentario.setIdCasa(resultado.getInt(2));
                comentario.setIdComentario(resultado.getInt(1));
                listaComentarios.add(comentario);
            }
            desconectarBase();
            return listaComentarios;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
   
}
