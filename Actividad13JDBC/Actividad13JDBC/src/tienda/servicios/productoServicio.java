/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import tienda.entidades.Producto;
import tienda.persistencias.fabricanteDAO;
import tienda.persistencias.productoDAO;

/**
 *
 * @author mi tamura
 */
public class productoServicio {
    //En estos servicios debemos tener una relacion a la clase dao de la entidad.
    private fabricanteDAO daof;
    private productoDAO dao;
    public productoServicio(){
        this.dao = new productoDAO();
        this.daof = new fabricanteDAO();
    }
    public void crearProducto(int codigo,int codigoFabricante,String nombre, double precio) throws Exception{
        try{
            System.out.println(nombre.trim());
            //Validamos
            if(codigoFabricante <= 0)
                throw new Exception("Codigo fabricante debe ser mayor a 0");
            if(nombre == null || nombre.trim().isEmpty())
                throw new Exception("Debe indicar un nombre");
            if(precio<= 0)
                throw new Exception("El precio debe ser mayor a 0");
            /*
            if(dao.buscarProductoPorCodigoFabricante(codigoFabricante)!= null)
                throw new Exception("Ya existe tal producto")
            Esto seria importante pero en este caso no,deberiamos hacerlo por su
            primary key.
            */
            if(daof.buscarFabricantePorCodigo(codigoFabricante) == null)
                throw new Exception("El fabricante con codigo "+codigoFabricante+" no existe");
            if(dao.buscarProductoPorCodigo(codigo) != null)
                throw new Exception("El producto con codigo "+codigo+" ya existe");
            //Creamos el producto
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setCodigoFabricante(codigoFabricante);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setFabricante(daof.buscarFabricantePorCodigo(producto.getCodigoFabricante()));
            dao.guardarProducto(producto);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void modificarProducto(int codigo,int codigoFabricante, String nombre, double precio) throws Exception{
        try{
            if(dao.buscarProductoPorCodigo(codigo) == null)
                throw new Exception("El producto no existe");
            if(daof.buscarFabricantePorCodigo(codigo) == null)
                throw new Exception("El fabricante no existe");
            if(nombre == null || nombre.trim().isEmpty())
                throw new Exception("Debe ingresar un nombre para el producto");
            if(precio<=0)
                throw new Exception("Debe ingresar un precio mayor a 0");
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setCodigoFabricante(codigoFabricante);
            producto.setFabricante(daof.buscarFabricantePorCodigo(codigoFabricante));
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            dao.modificarProducto(producto);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void NombreDeTodosLosProductos(){
        try{
            dao.listarProductos().forEach( (Producto t) -> System.out.println(t.getNombre()));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void NombreYPrecioDeTodosLosProductos(){
        try{
            dao.listarProductos().forEach((Producto t) -> System.out.println("Nombre producto: "+t.getNombre()+", Precio: "+t.getPrecio()));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void ProductosPorRangoEntrePrecio(double rango1,double rango2){
        try{
            dao.listarProductosConRangoDePrecio(rango1, rango2).forEach((Producto t) -> 
            System.out.println(t)
            );
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void ProductosQueSonPortatiles(){
        try{
            dao.listarProductosPorNombre("Portatíl").forEach(t->
            System.out.println(t)
            );
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void ProductoMasBarato(){
        try{
            dao.listarProductosPorOrdenDeColumnaYMostrarONoSoloPrimerDato("ASC", "precio", true, 1).forEach(t ->
            System.out.println("Nombre: "+t.getNombre() + ", Precio: "+ t.getPrecio())
            );
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}