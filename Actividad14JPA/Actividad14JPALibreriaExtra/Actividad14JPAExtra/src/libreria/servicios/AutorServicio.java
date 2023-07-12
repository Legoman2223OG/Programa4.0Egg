/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import javax.persistence.NoResultException;
import libreria.entidades.Autor;
import libreria.persistencia.DAO;
import libreria.persistencia.DAOException;



/**
 *
 * @author mi tamura
 */
public class AutorServicio extends DAO<Autor>{
    public void CrearAutor(String nombre,int id) throws Exception{
        if(nombre == null || nombre.trim().isEmpty())
            throw new Exception("Debe indicar el nombre del autor");
        if(em.find(Autor.class, id) != null)
            throw new Exception("Ese autor ya existe");
        if(BuscarAutorPorNombre(nombre) != null)
            throw new Exception("Ya hay un autor con ese nombre");
        Autor autor = new Autor();
        autor.setAlta(false);
        autor.setNombre(nombre);
        autor.setId(id);
        super.CrearEntidad(autor);
    }
    
    public Autor BuscarAutorPorNombre(String nombre){
        try{
            if(nombre==null || nombre.trim().isEmpty())
                throw new DAOException("Debe especificar un nombre de autor");
            try{
                Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
                return autor;
            }
            catch(NoResultException e){
                return null;
            }
        }
        catch(DAOException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
