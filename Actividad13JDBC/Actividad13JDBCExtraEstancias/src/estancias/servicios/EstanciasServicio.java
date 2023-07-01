/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.servicios;

import estancias.entidades.Clientes;
import estancias.entidades.Estancias;
import estancias.persistencias.CasasDAO;
import estancias.persistencias.ClientesDAO;
import estancias.persistencias.ComentariosDAO;
import estancias.persistencias.EstanciasDAO;
import java.util.Date;

/**
 *
 * @author mi tamura
 */
public class EstanciasServicio {
    private EstanciasDAO dao;
    private ClientesDAO daocl;
    private CasasDAO daoca;
    private ComentariosDAO daocom;
    public EstanciasServicio(){
        this.daocom= new ComentariosDAO();
        this.dao= new EstanciasDAO();
        this.daocl= new ClientesDAO();
        this.daoca= new CasasDAO();
    }
    public void crearEstancia(int idEstancia,int idCliente,int idCasa,Date fechaDesde,Date fechaHasta) throws Exception{
        try{
            if(daoca.buscarCasaPorId(idCasa) == null)
                throw new Exception("La casa con el id "+idCasa+" no existe");
            if(!daoca.VerificarSiLaCasaConIdTieneFechasDisponiblesDesdeHasta(idCasa, fechaDesde,fechaHasta))
                throw new Exception("Las fechas ingresadas no corresponden al limite de la fecha desde y hasta de la casa");
            if(daocl.buscarClientePorId(idCliente)== null)
                throw new Exception("El cliente con id "+idCliente+" no existe");
            if(dao.buscarClienteConIdEnLasEstancias(idCliente) != null)
                throw new Exception("El cliente con id "+idCliente+" ya tiene una estancia");
            if(dao.buscarEstanciaPorId(idEstancia) != null)
                throw new Exception("La estancia con el id "+idEstancia+" ya existe");
            Estancias estancia= new Estancias();
            estancia.setIdEstancia(idEstancia);
            estancia.setIdCliente(idCliente);
            estancia.setIdCasa(idCasa);
            estancia.setNombreHuesped(daocl.buscarClientePorId(idCliente).getNombre());
            estancia.setFechaDesde(fechaDesde);
            estancia.setFechaHasta(fechaHasta);
            dao.crearEstancia(estancia);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void ClientesQueRealizaronUnaEstanciaYSusCasas(){
        try{
            dao.BuscarEstanciasDeClientesQuePidieron().forEach(t ->{
                try{
                    System.out.println("INFORMACION DE CLIENTE Y SU COMENTARIO DE LA CASA: ");
                    System.out.println(daocl.buscarClientePorId(t.getIdCliente()));
                    System.out.println(daocom.buscarComentarioPorIdCasa(t.getIdCasa()).getComentario());
                    System.out.println("----------------------------------------------------");
                }
                catch(Exception er){
                    System.out.println("No se pudo conseguir el cliente o el comentario.");
                }
            }
            );            
        }
        catch(Exception e){
            System.out.println("No se pudo realizar la consulta.\nRazon: "+e.getMessage());
        }
    }
    public void NombrePaisCiudadDeClienteQueRealizoUnaEstanciaYInfoDeLaCasa(){
        try{
            dao.BuscarEstanciasDeClientesQuePidieron().forEach(t ->{
                try{
                    System.out.println("CLIENTE: ");
                    Clientes cliente = daocl.buscarClientePorId(t.getIdCliente());
                    System.out.println("Nombre: "+cliente.getNombre()+", Pais: "+cliente.getPais()+", Ciudad: "+cliente.getCiudad());
                    System.out.println("CASA: ");
                    System.out.println(daoca.buscarCasaPorId(t.getIdCasa()));
                    System.out.println("---------------------------------------------------------");
                }
                catch(Exception e){
                    System.out.println("No se pudo conseguir el cliente o la casa.");
                }
            });
        }
        catch(Exception e){
            System.out.println("No se pudo realizar la consulta.\nRazon: "+e.getMessage());
        }
    }
}
