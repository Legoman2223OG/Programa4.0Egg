/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.Collection;
import java.util.List;
import javax.persistence.NoResultException;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.DAO;
import libreria.persistencia.DAOException;

/**
 *
 * @author mi tamura
 */
public class LibroServicio extends DAO<Libro>{
    AutorServicio aSv;
    EditorialServicio eSv;
    public LibroServicio(){
        aSv= new AutorServicio();
        eSv= new EditorialServicio();
    }
    public void CrearLibro(long isbn,String titulo,int anio, int ejemplares, int ejemplaresPrestados,int ejemplaresRestantes,int idautor,int ideditorial) throws Exception{
        if(titulo == null || titulo.trim().isEmpty())
            throw new Exception("Debe ingresar un titulo");
        if(BuscarLibroPorTitulo(titulo) != null)
            throw new Exception("Ese titulo ya existe");
        if(anio <0 || ejemplares <0 || ejemplaresPrestados < 0 || ejemplaresRestantes < 0 || idautor < 0 || ideditorial < 0 || isbn < 0)
            throw new Exception("No se admiten valores negativos");
        if(em.find(Libro.class, isbn)!=null)
            throw new Exception("Un libro con ISBN "+isbn+" ya existe");
        if(em.find(Autor.class, idautor)==null)
            throw new Exception("El autor con id "+idautor+" no existe");
        if(em.find(Editorial.class, ideditorial) == null)
            throw new Exception("La editorial con id "+ideditorial+" no existe");
        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        libro.setAlta(false);
        libro.setAutor(em.find(Autor.class, idautor));
        libro.setEditorial(em.find(Editorial.class, ideditorial));
        super.CrearEntidad(libro);
    }
    public void DarDeAltaLibro(long idlibro,boolean alta){
        try{
            if(em.find(Libro.class, idlibro) == null)
                throw new Exception("No se encontro el libro con id "+idlibro);
            Libro libro = em.find(Libro.class, idlibro);
            libro.setAlta(alta);
            super.ModificarEntidad(libro);
        }
        catch(Exception e){
            System.out.println("No se pudo dar de alta el libro.\nRazon: "+e.getMessage());
        }
    }
    public Libro BuscarLibroPorISBN(long isbn){
        return em.find(Libro.class, isbn);
    }
    public Libro BuscarLibroPorTitulo(String titulo){
        try{
            if(titulo == null || titulo.trim().isEmpty())
                throw new DAOException("Debe ingresar un titulo de libro");
            try{
                return (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo").setParameter("titulo", titulo).getSingleResult();
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
    public Collection<Libro> BuscarLibroPorNombreDeAutor(String nombre){
        try{
            if(nombre==null || nombre.trim().isEmpty())
                throw new DAOException("Debe ingresar un nombre de autor");
            if(aSv.BuscarAutorPorNombre(nombre)==null)
                throw new DAOException("El autor no existe");
            try{
                List<Libro> listaLibros= em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getResultList();
                return listaLibros;
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
    public Collection<Libro> BuscarLibroPorNombreDeEditorial(String nombre){
        try{
            if(nombre==null || nombre.trim().isEmpty())
                throw new DAOException("Debe ingresar un nombre de editorial");
            if(eSv.BuscarEditorialPorNombre(nombre)==null)
                throw new DAOException("La editorial no existe");
            try{
                List<Libro> listaLibros= em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre = :nombre").setParameter("nombre", nombre).getResultList();
                return listaLibros;
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
