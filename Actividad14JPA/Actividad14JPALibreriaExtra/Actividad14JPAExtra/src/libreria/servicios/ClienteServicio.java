/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import javax.persistence.NoResultException;
import libreria.entidades.Cliente;
import libreria.persistencia.DAO;
import libreria.persistencia.DAOException;

/**
 *
 * @author mi tamura
 */
public class ClienteServicio extends DAO<Cliente>{
    public void CrearCliente(int id,long documento,String nombre,String apellido,String telefono) throws Exception{
        if(em.find(Cliente.class, id)!= null)
            throw new Exception("El cliente con id "+id+" ya existe");
        if(nombre==null || nombre.trim().isEmpty())
            throw new Exception("Debe indicar el nombre del cliente");
        if(apellido==null || apellido.trim().isEmpty())
            throw new Exception("Debe indicar el apellido del cliente");
        if(telefono==null || telefono.trim().isEmpty())
            throw new Exception("Debe indicar el telefono del cliente");
        if(id < 0 || documento < 0 )
            throw new Exception("No se admiten valores negativos");
        if(documento < 10000000 || documento > 99999999)
            throw new Exception("El documento debe tener 8 digitos");
        if(BuscarClientePorDocumento(documento) != null)
            throw new Exception("Ya existe un cliente con ese documento");
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setDocumento(documento);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);
        super.CrearEntidad(cliente);
    }
    public Cliente BuscarClientePorDocumento(long documento){
        try{
            if(documento < 10000000 || documento > 99999999)
                throw new DAOException("El documento debe tener 8 digitos");
            try{
                Cliente cliente = (Cliente) em.createQuery("SELECT c FROM Cliente c WHERE c.documento = :documento").setParameter("documento", documento).getSingleResult();                
                return cliente;
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
    public Cliente BuscarClientePorTelefono(String telefono){
        try{
            if(telefono==null || telefono.trim().isEmpty())
                throw new DAOException("Debe indicar el telefono de un cliente");
            
            try{
                Cliente cliente = (Cliente) em.createQuery("SELECT c FROM Cliente c WHERE c.telefono = :telefono").setParameter("telefono", telefono).getSingleResult();                
                return cliente;
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
    public Cliente BuscarClientePorNombreYApellido(String nombre,String apellido){
        try{
            if(nombre==null || nombre.trim().isEmpty())
                throw new DAOException("Debe indicar un nombre de un cliente");
            if(apellido==null || apellido.trim().isEmpty())
                throw new DAOException("Debe indicar el apellido de un cliente");
            try{
                Cliente cliente = (Cliente) em.createQuery("SELECT c FROM Cliente c WHERE c.nombre = :nombre AND c.apellido = :apellido").setParameter("nombre", nombre).setParameter("apellido", apellido).getSingleResult();
                return cliente;
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
