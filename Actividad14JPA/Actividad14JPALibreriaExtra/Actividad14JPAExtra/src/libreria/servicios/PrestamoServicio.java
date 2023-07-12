/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.NoResultException;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.persistencia.DAO;

/**
 *
 * @author mi tamura
 */
public class PrestamoServicio extends DAO<Prestamo> {
    LibroServicio lSv;
    public PrestamoServicio(){
        lSv= new LibroServicio();
    }
    public void CrearPrestamo(int id,Date fechaPrestamo,Date fechaDevolucion,long idlibro,int idcliente) throws Exception{
        if(idlibro < 0 || id < 0 || idcliente < 0)
            throw new Exception("No se aceptan valores negativos");
        if(em.find(Prestamo.class, id) != null)
            throw new Exception("El prestamo con id "+id+" ya existe");
        if(fechaPrestamo.after(fechaDevolucion))
            throw new Exception("La fecha de prestamo supera la fecha de devolucion");
        if(fechaDevolucion.before(fechaPrestamo))
            throw new Exception("La fecha de devolucion es inferior a la fecha de prestamo");
        if(em.find(Libro.class, idlibro) == null)
            throw new Exception("No existe tal libro");
        if(em.find(Cliente.class, idcliente) == null)
            throw new Exception("No existe tal cliente");
        if(em.find(Libro.class, idlibro).getEjemplaresRestantes()<=0)
            throw new Exception("No quedan mas ejemplares para prestar");
        Prestamo prestamo = new Prestamo();
        prestamo.setId(id);
        prestamo.setFechaDevolucion(fechaDevolucion);
        prestamo.setFechaPrestamo(fechaPrestamo);
        prestamo.setCliente(em.find(Cliente.class, idcliente));
        prestamo.setLibro(em.find(Libro.class, idlibro));
        Libro libro= em.find(Libro.class, idlibro);
        libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes()-1);
        lSv.ModificarEntidad(libro);
        super.CrearEntidad(prestamo);
    }
    public void DevolverLibro(int idprestamo) throws Exception{
        Prestamo prestamo = em.find(Prestamo.class, idprestamo);
        prestamo.getLibro().setEjemplaresPrestados(prestamo.getLibro().getEjemplaresPrestados()-1);
        prestamo.getLibro().setEjemplaresRestantes(prestamo.getLibro().getEjemplaresRestantes()+1);
        lSv.ModificarEntidad(prestamo.getLibro());
        super.EliminarEntidad(prestamo);
    }
    public Collection<Prestamo> BuscarPrestamosDeUnClientePorSuId(int idcliente){
        try{
            if(em.find(Cliente.class, idcliente) == null)
                throw new Exception("El cliente con id "+idcliente+" no existe");
            try{
                List<Prestamo> listaPrestamos= em.createQuery("SELECT p FROM Prestamo p JOIN p.cliente c WHERE c.id = :idcliente").setParameter("idcliente", idcliente).getResultList();
                return listaPrestamos;
            }
            catch(NoResultException e){
                return null;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
