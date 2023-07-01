/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencias;

import estancias.entidades.Clientes;
import estancias.entidades.Estancias;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author mi tamura
 */
public final class EstanciasDAO extends DAO{
    private ClientesDAO daocl;
    private CasasDAO daoc;
    public EstanciasDAO(){
        this.daoc = new CasasDAO();
        this.daocl = new ClientesDAO();
    }
    public void crearEstancia(Estancias estancia) throws Exception{
        try{
            if(estancia == null)
                throw new Exception("Debe indicar una estancia");
            java.sql.Date fechaDesde = new java.sql.Date(estancia.getFechaDesde().getTime());
            java.sql.Date fechaHasta = new java.sql.Date(estancia.getFechaHasta().getTime());
            String fechaDesdeYYMMDD=  (Integer.toString(fechaDesde.getYear())+"-"+Integer.toString(fechaDesde.getMonth())+"-"+Integer.toString(fechaDesde.getYear()));
            String fechaHastaYYMMDD= (Integer.toString(fechaHasta.getYear())+"-"+Integer.toString(fechaHasta.getMonth())+"-"+Integer.toString(fechaHasta.getYear()));
            String sql = "INSERT into estancias (fecha_desde,fecha_hasta,id_casa,id_cliente,id_estancia,nombre_huesped) VALUES(DATE '"+fechaDesdeYYMMDD+"',DATE '"+fechaHastaYYMMDD+"',"+estancia.getIdCasa()+","+estancia.getIdCliente()+","+estancia.getIdEstancia()+",'"+estancia.getNombreHuesped()+"');";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void modificarEstancia(Estancias estancia) throws Exception{
        try{
            if(estancia == null)
                throw new Exception("Debe indicar una estancia");
            java.sql.Date fechaDesde = new java.sql.Date(estancia.getFechaDesde().getTime());
            java.sql.Date fechaHasta = new java.sql.Date(estancia.getFechaHasta().getTime());
            String fechaDesdeYYMMDD=  (Integer.toString(fechaDesde.getYear())+"-"+Integer.toString(fechaDesde.getMonth())+"-"+Integer.toString(fechaDesde.getYear()));
            String fechaHastaYYMMDD= (Integer.toString(fechaHasta.getYear())+"-"+Integer.toString(fechaHasta.getMonth())+"-"+Integer.toString(fechaHasta.getYear()));
            String sql = "UPDATE estancias SET fecha_desde = DATE '"+fechaDesdeYYMMDD+"', fecha_hasta = DATE '"+fechaHastaYYMMDD+"', id_casa = "+estancia.getIdCasa()+", id_cliente = "+estancia.getIdCliente()+", nombre_huesped = '"+ estancia.getNombreHuesped()+"' WHERE id_estancia = "+estancia.getIdEstancia()+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void eliminarEstancia(int idestancia) throws Exception{
        try{
            String sql= "DELETE from estancias WHERE id_estancia = "+idestancia+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public Estancias buscarEstanciaPorId(int idestancia) throws Exception{
       try{
           String sql= "SELECT * from estancias WHERE id_estancia = "+idestancia+";";
           consultarBase(sql);
           Estancias estancia = null;
           while(resultado.next()){
               estancia = new Estancias();
               java.util.Date fechaDesde = new java.util.Date(resultado.getDate(5).getTime());
               java.util.Date fechaHasta = new java.util.Date(resultado.getDate(6).getTime());
               estancia.setIdEstancia(resultado.getInt(1));
               estancia.setIdCliente(resultado.getInt(2));
               estancia.setIdCasa(resultado.getInt(3));
               estancia.setNombreHuesped(resultado.getString(4));
               estancia.setFechaDesde(fechaDesde);
               estancia.setFechaHasta(fechaHasta);
           }
           desconectarBase();
           return estancia;
       } 
       catch(Exception e){
           desconectarBase();
           throw e;
       }
    }
    public Collection<Estancias> listarEstancias() throws Exception{
        try{
            String sql="SELECT * from estancias";
            consultarBase(sql);
            Estancias estancia;
            ArrayList<Estancias> listaEstancias = new ArrayList();
            while(resultado.next()){
               estancia = new Estancias();
               java.util.Date fechaDesde = new java.util.Date(resultado.getDate(5).getTime());
               java.util.Date fechaHasta = new java.util.Date(resultado.getDate(6).getTime());
               estancia.setIdEstancia(resultado.getInt(1));
               estancia.setIdCliente(resultado.getInt(2));
               estancia.setIdCasa(resultado.getInt(3));
               estancia.setNombreHuesped(resultado.getString(4));
               estancia.setFechaDesde(fechaDesde);
               estancia.setFechaHasta(fechaHasta);
               listaEstancias.add(estancia);
            }
            desconectarBase();
            return listaEstancias;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
    public Collection<Estancias> BuscarEstanciasDeClientesQuePidieron() throws Exception{
        try{
            String sql="SELECT es.* FROM estancias as es INNER JOIN  clientes as cl on es.id_cliente = cl.id_cliente;";
            consultarBase(sql);
            Estancias estancia;
            ArrayList<Estancias> listaEstancias = new ArrayList();
            while(resultado.next()){
               estancia = new Estancias();
               java.util.Date fechaDesde = new java.util.Date(resultado.getDate(5).getTime());
               java.util.Date fechaHasta = new java.util.Date(resultado.getDate(6).getTime());
               estancia.setIdEstancia(resultado.getInt(1));
               estancia.setIdCliente(resultado.getInt(2));
               estancia.setIdCasa(resultado.getInt(3));
               estancia.setNombreHuesped(resultado.getString(4));
               estancia.setFechaDesde(fechaDesde);
               estancia.setFechaHasta(fechaHasta);
               listaEstancias.add(estancia);
            }
            desconectarBase();
            return listaEstancias;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
    public Clientes buscarClienteConIdEnLasEstancias(int idcliente) throws Exception{
        try{
            String sql="SELECT id_cliente FROM estancias WHERE id_cliente = "+idcliente+";";
            consultarBase(sql);
            Clientes cliente=null;
            while(resultado.next()){
                cliente = daocl.buscarClientePorId(resultado.getInt(1));
            }
            desconectarBase();
            return cliente;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
}
