/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencias;

import estancias.entidades.Clientes;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author mi tamura
 */
public final class ClientesDAO extends DAO{
    public void guardarCliente(Clientes cliente) throws Exception{
        try{
            if(cliente == null)
                throw new Exception("Debe indicar un cliente");
            String sql= "INSERT into clientes (calle,ciudad,codigo_postal,email,id_cliente,nombre,numero,pais) VALUES('"+cliente.getCalle()+"','"
                    +cliente.getCiudad()+"','"+cliente.getCodigoPostal()+"','"+cliente.getEmail()+"',"+cliente.getIdCliente()+",'"+cliente.getNombre()+"',"+cliente.getNumero()+",'"
                    +cliente.getPais()+"');";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void modificarCliente(Clientes cliente) throws Exception{
        try{
            if(cliente == null)
                throw new Exception("Debe indicar un cliente para modificar");
            String sql= "UPDATE clientes SET calle = '"+cliente.getCalle()+"', ciudad = '"+cliente.getCiudad()+"', codigo_postal = '"+cliente.getCodigoPostal()+"', email = '"+cliente.getEmail()
                    +"',nombre = '"+cliente.getNombre()+"', numero = "+cliente.getNumero()+", pais = '"+cliente.getPais()+
                    "' WHERE id_cliente = "+cliente.getIdCliente()+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void eliminarCliente(int idcliente) throws Exception{
        try{
            String sql= "DELETE from clientes WHERE id_cliente = "+idcliente+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public Clientes buscarClientePorId(int idcliente) throws Exception{
        try{
            String sql= "SELECT * from clientes WHERE id_cliente = "+idcliente+";";
            consultarBase(sql);
            Clientes cliente = null;
            while(resultado.next()){
                cliente = new Clientes();
                cliente.setIdCliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigoPostal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));
            }
            desconectarBase();
            return cliente;
        }
        catch(Exception e){
            desconectarBase();
            throw e;
        }
    }
    public Collection<Clientes> listarClientes() throws Exception{
        try{
            String sql= "SELECT * from clientes";
            consultarBase(sql);
            Clientes cliente;
            ArrayList<Clientes> listaClientes = new ArrayList();
            while(resultado.next()){
                cliente = new Clientes();
                cliente.setIdCliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigoPostal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));
                listaClientes.add(cliente);
            }
            desconectarBase();
            return listaClientes;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
}
