/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencias;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

/**
 *
 * @author mi tamura
 */
public final class fabricanteDAO extends DAO {
    public void guardarFabricante(Fabricante fabricante) throws Exception{
        try{
            if(fabricante == null)
                throw new Exception("Debe ingresar un fabricante");
            String sql = "INSERT INTO fabricante (codigo,nombre) VALUES("+fabricante.getCodigo()+",'"
                    +fabricante.getNombre()+"')";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void modificarFabricante(Fabricante fabricante) throws Exception{
        try{
            if(fabricante == null)
                throw new Exception("Debe ingresar un fabricante");
            String sql= "UPDATE fabricante SET nombre = '"+fabricante.getNombre()+"' WHERE codigo ="
                    +fabricante.getCodigo()+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void eliminarFabricante(int codigo) throws Exception{
        try{
            String sql= "DELETE from fabricante WHERE codigo="+codigo+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public Fabricante buscarFabricantePorCodigo(int codigo) throws Exception{
        try{
            String sql= "SELECT * FROM fabricante WHERE codigo ="+codigo+";";
            consultarBase(sql);
            Fabricante fabricante= null;
            while(resultado.next()){
                fabricante= new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;
        }
        catch(Exception e){
            desconectarBase();
            throw e;
        }
    }
    public Collection<Fabricante> listarFabricantes() throws Exception{
        try{
            String sql= "SELECT * FROM fabricante";
            consultarBase(sql);
            Fabricante fabricante = null;
            ArrayList<Fabricante> listaFabricantes= new ArrayList();
            while(resultado.next()){
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                listaFabricantes.add(fabricante);
            }
            desconectarBase();
            return listaFabricantes;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
}