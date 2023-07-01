/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencias;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

/**
 *
 * @author mi tamura
 */
public final class productoDAO extends DAO {
    private fabricanteDAO daof;
    public productoDAO(){
        this.daof = new fabricanteDAO();
    }
    public void guardarProducto(Producto producto) throws Exception{
        try{
            //Que sea nulo debe ser un problema.
            if(producto== null){
                throw new Exception("Debe indicar un producto");
            }
            String sql= "INSERT INTO producto (codigo,codigo_fabricante,nombre,precio) VALUES("+producto.getCodigo()+","+
                    producto.getCodigoFabricante()+",'"+ producto.getNombre()+"',"+producto.getPrecio()+");";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void modificarProducto(Producto producto) throws Exception{
        try{
            if(producto == null){
                throw new Exception("Debes indicar un producto a modificar");
            }
            String sql = "UPDATE producto SET codigo_fabricante= "+producto.getCodigoFabricante()+
                    ",nombre= '" + producto.getNombre()+"',precio= "+producto.getPrecio()+" WHERE codigo= "+producto.getCodigo()+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void eliminarProducto(int codigo) throws Exception{
        try{
            String sql= "DELETE from producto WHERE codigo= "+codigo+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
     public Producto buscarProductoPorCodigo(int codigo) throws Exception{
        try{
            String sql= "SELECT * FROM producto WHERE codigo ="+ codigo+";";
            consultarBase(sql);
            Producto producto = null;
            while(resultado.next()){
                producto= new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setCodigoFabricante(resultado.getInt(4));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setFabricante(daof.buscarFabricantePorCodigo(producto.getCodigoFabricante()));
            }
            desconectarBase();
            return producto;
        }
        catch(Exception e){
            desconectarBase();
            throw e;
        }
    }
    public Collection<Producto> listarProductosPorNombre(String nombre) throws Exception{
        try{
            String sql= "SELECT * FROM producto WHERE nombre LIKE '%"+nombre+"%';";
            consultarBase(sql);
            Producto producto;
            ArrayList<Producto> listaProductos = new ArrayList();
            while(resultado.next()){
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setCodigoFabricante(resultado.getInt(4));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setFabricante(daof.buscarFabricantePorCodigo(producto.getCodigoFabricante()));
                listaProductos.add(producto);
            }
            desconectarBase();
            return listaProductos;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
    public Collection<Producto> listarProductos() throws Exception{
        try{
            String sql= "SELECT * FROM producto";
            consultarBase(sql);
            Producto producto;
            ArrayList<Producto> listaProductos = new ArrayList();
            while(resultado.next()){
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setCodigoFabricante(resultado.getInt(4));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setFabricante(daof.buscarFabricantePorCodigo(producto.getCodigoFabricante()));
                listaProductos.add(producto);
            }
            desconectarBase();
            return listaProductos;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
    //rango1 debe ser menor a rango2
    public Collection<Producto> listarProductosConRangoDePrecio(double rango1,double rango2) throws Exception{
        try{
            if(rango1>rango2)
                throw new Exception("El primer parametro debe ser menor al segundo parametro");
            else if(rango2<rango1)
                throw new Exception("El segundo parametro debe ser mayor al primer parametro");
            String sql= "SELECT * FROM producto WHERE precio >= "+rango1+" AND precio <= "+rango2+";";
            consultarBase(sql);
            Producto producto = null;
            ArrayList<Producto> listaProductos = new ArrayList();
            while(resultado.next()){
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setCodigoFabricante(resultado.getInt(4));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setFabricante(daof.buscarFabricantePorCodigo(producto.getCodigoFabricante()));
                listaProductos.add(producto);
            }
            desconectarBase();
            return listaProductos;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
    //ASC o DESC, Las columnas deben pertenecer a la tabla y el primer dato solo debe
    //ser true o false.
    public Collection<Producto> listarProductosPorOrdenDeColumnaYMostrarONoSoloPrimerDato(String orden,String columna,boolean primerDato, int cantDatos) throws Exception{
        try{
            orden = orden.toUpperCase();
            columna = columna.toLowerCase();
            if(!orden.equalsIgnoreCase("ASC")&&!orden.equalsIgnoreCase("DESC"))
                throw new Exception("La opcion de orden debe ser DESC o ASC");
            if(!columna.equalsIgnoreCase("nombre")&&!columna.equalsIgnoreCase("codigo")&&!columna.equalsIgnoreCase("codigo_fabricante")&&!columna.equalsIgnoreCase("precio"))
                throw new Exception("La opcion de columnas debe ser nombre o precio o codigo o codigo_fabricante (TAL CUAL ESTA ESCRITO)");
            if(cantDatos <=0)
                throw new Exception("La cantidad de datos a mostrar debe ser mayor a 0");
            String sql= "SELECT * FROM producto ORDER BY "+columna+" "+orden+" "+(primerDato ? ("LIMIT " + cantDatos): "")+";";
            
            consultarBase(sql);
            Producto producto;
            ArrayList<Producto> listaProductos = new ArrayList();
            while(resultado.next()){
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setCodigoFabricante(resultado.getInt(4));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setFabricante(daof.buscarFabricantePorCodigo(producto.getCodigoFabricante()));
                listaProductos.add(producto);
            }
            desconectarBase();
            return listaProductos;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
}
