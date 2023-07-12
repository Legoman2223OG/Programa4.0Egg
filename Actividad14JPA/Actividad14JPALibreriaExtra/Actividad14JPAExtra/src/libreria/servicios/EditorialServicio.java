/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import javax.persistence.NoResultException;
import libreria.entidades.Editorial;
import libreria.persistencia.DAO;
import libreria.persistencia.DAOException;

/**
 *
 * @author mi tamura
 */
public class EditorialServicio extends DAO<Editorial>{
    public void CrearEditorial(String nombre,int id) throws Exception{
        if(nombre == null || nombre.trim().isEmpty())
            throw new Exception("Debe indicar el nombre de la editorial");
        if(em.find(Editorial.class, id) != null)
            throw new Exception("Esa editorial ya existe");
        if(BuscarEditorialPorNombre(nombre)!=null)
            throw new Exception("Ese autor con ese nombre ya existe");
        Editorial editorial = new Editorial();
        editorial.setAlta(false);
        editorial.setNombre(nombre);
        editorial.setId(id);
        super.CrearEntidad(editorial);
    }
    
    public Editorial BuscarEditorialPorNombre(String nombre){
        try{
            if(nombre==null || nombre.trim().isEmpty())
                throw new DAOException("Debe especificar un nombre de autor");
            try{
                Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
                return editorial;
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
