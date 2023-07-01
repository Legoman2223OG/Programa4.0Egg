/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencias;

import estancias.entidades.Familias;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author mi tamura
 */
public final class FamiliasDAO extends DAO{
    private CasasDAO daoc;
    public FamiliasDAO(){
        this.daoc= new CasasDAO();
    }
    public void crearFamilia(Familias familia) throws Exception{
        try{
            if(familia == null)
                throw new Exception("Debe indicar una familia");
            String sql = "INSERT into familias (edad_maxima,edad_minima,email,id_casa_familia,id_familia,nombre,num_hijos) VALUES("+familia.getEdadMaxima()+","+familia.getEdadMinima()+",'"+familia.getEmail()+"',"+
                    familia.getIdCasaFamilia()+","+familia.getIdFamilia()+",'"+familia.getNombre()+"',"+familia.getNumHijos()+");";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void modificarFamilia(Familias familia) throws Exception{
        try{
            if(familia == null)
                throw new Exception("Debe indicar una familia");
            String sql="UPDATE familias SET edad_maxima = "+familia.getEdadMaxima()+", edad_minima = "+familia.getEdadMinima()+", email = '"+familia.getEmail()+"', id_casa_familia = "+familia.getIdCasaFamilia()+", nombre = '"+familia.getNombre()+", num_hijos = "+familia.getNumHijos()+" WHERE id_familia = "+familia.getIdFamilia()+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void eliminarFamilia(int idfamilia) throws Exception{
        try{
            String sql ="DELETE from familias WHERE id_familia = "+idfamilia+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public Familias buscarFamiliaPorId(int idfamilia) throws Exception{
        try{
            String sql= "SELECT * from familias WHERE id_familia ="+idfamilia+";";
            consultarBase(sql);
            Familias familia = null;
            while(resultado.next()){
                familia = new Familias();
                familia.setIdFamilia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdadMinima(resultado.getInt(3));
                familia.setEdadMaxima(resultado.getInt(4));
                familia.setNumHijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setIdCasaFamilia(resultado.getInt(7));
            }
            desconectarBase();
            return familia;
        }
        catch(Exception e){
            desconectarBase();
            throw e;
        }
    }
    public Collection<Familias> listarFamilias() throws Exception{
        try{
            String sql= "SELECT * from familias";
            consultarBase(sql);
            Familias familia;
            ArrayList<Familias> listaFamilias = new ArrayList();
            while(resultado.next()){
                familia = new Familias();
                familia.setIdFamilia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdadMinima(resultado.getInt(3));
                familia.setEdadMaxima(resultado.getInt(4));
                familia.setNumHijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setIdCasaFamilia(resultado.getInt(7));
                listaFamilias.add(familia);
            }
            desconectarBase();
            return listaFamilias;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
    public Collection<Familias> buscarFamiliasConCantHijosYEdadMaximaInferiorA(int hijos, int edad) throws Exception{
        try{
            String sql = "SELECT * FROM familias WHERE num_hijos = "+hijos+" AND edad_maxima < "+edad+";";
            consultarBase(sql);
            Familias familia;
            ArrayList<Familias> listaFamilias= new ArrayList();
            while(resultado.next()){
                familia = new Familias();
                familia.setIdFamilia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdadMinima(resultado.getInt(3));
                familia.setEdadMaxima(resultado.getInt(4));
                familia.setNumHijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setIdCasaFamilia(resultado.getInt(7));
                listaFamilias.add(familia);
            }
            desconectarBase();
            return listaFamilias;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
    public Collection<Familias> buscarFamiliasQueTenganEmailDeTipo(String email) throws Exception{
        try{
            String sql= "SELECT * from familias WHERE email LIKE '%"+email+"%';";
            consultarBase(sql);
            Familias familia;
            ArrayList<Familias> listaFamilias = new ArrayList();
            while(resultado.next()){
                familia = new Familias();
                familia.setIdFamilia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdadMinima(resultado.getInt(3));
                familia.setEdadMaxima(resultado.getInt(4));
                familia.setNumHijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setIdCasaFamilia(resultado.getInt(7));
                listaFamilias.add(familia);
            }
            desconectarBase();
            return listaFamilias;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
}
