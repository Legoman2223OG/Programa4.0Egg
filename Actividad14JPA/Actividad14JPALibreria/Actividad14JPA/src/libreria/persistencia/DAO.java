/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
/**
 *
 * @author mi tamura
 */
public class DAO<T> {
    protected EntityManager em= null;
    public DAO(){
        em= Persistence.createEntityManagerFactory("PersistenciaLibreria").createEntityManager();
    }
    public void CrearEntidad(T entidad) throws DAOException{
        try{
            if(entidad == null)
                throw new DAOException("Debe indicar un "+entidad.getClass().getName());
            em.getTransaction().begin();
            em.persist(entidad);
            em.getTransaction().commit();
        }
        catch(DAOException e){
            throw e;
        }
        catch(Exception e){
            e.printStackTrace();
            throw new DAOException("Error del sistema");
        }
    }
    public void ModificarEntidad(T entidad) throws DAOException{
        try{
            if(entidad==null)
                throw new DAOException("Debe indicar un "+entidad.getClass().getName());
            em.getTransaction().begin();
            em.merge(entidad);
            em.getTransaction().commit();
        }
        catch(DAOException e){
            throw e;
        }
        catch(Exception e){
            e.printStackTrace();
            throw new DAOException("Error del sistema");
        }
    }
    public void EliminarEntidad(T entidad) throws DAOException{
        try{
            if(entidad==null)
                throw new DAOException("Debe indicar un "+entidad.getClass().getName());
            em.getTransaction().begin();
            em.remove(entidad);
            em.getTransaction().commit();
        }
        catch(DAOException e){
            throw e;
        }
        catch(Exception e){
            e.printStackTrace();
            throw new DAOException("Error del sistema");
        }
    }
}
