/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import tienda.entidades.Fabricante;
import tienda.persistencias.fabricanteDAO;

/**
 *
 * @author mi tamura
 */
public class fabricanteServicio {
    private fabricanteDAO dao;
    public fabricanteServicio(){
        this.dao= new fabricanteDAO();
    }
    public void crearFabricante(String nombre, int codigo) throws Exception{
        try{
            if(nombre == null || nombre.trim().isEmpty())
                throw new Exception("Debe indicar un nombre para el fabricante");
            if(codigo<=0)
                throw new Exception("El codigo del fabricante debe ser mayor a 0");
            if(dao.buscarFabricantePorCodigo(codigo) != null)
                throw new Exception("El fabricante con el codigo "+codigo+" ya existe");
            Fabricante fabricante = new Fabricante();
            fabricante.setCodigo(codigo);
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);
        }
        catch(Exception e){
            throw e;
        }
    }
}
