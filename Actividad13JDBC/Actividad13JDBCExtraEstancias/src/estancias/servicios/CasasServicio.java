/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.servicios;

import estancias.persistencias.CasasDAO;
import java.util.Date;

/**
 *
 * @author mi tamura
 */
public class CasasServicio {
    private CasasDAO dao;
    public CasasServicio(){
        this.dao= new CasasDAO();
    }
    public void CasasConEntreFechaDesdeyFechaHasta(Date fecha1, Date fecha2,String pais){
        try{
            dao.buscarCasaEntreDosFechasYPais(fecha1,fecha2,pais).forEach(t -> System.out.println(t));
        }
        catch(Exception e){
            System.out.println("No se pudo realizar la consulta.\nRazon: "+e.getMessage());
        }
    }
    public void CasasDisponiblesAPartirDeLaFechaYDiasMaximos(Date fecha1,int diasmax){
        try{
            dao.buscarCasaDisponibleAPartirDeFechaYDiasMaximos(fecha1, diasmax).forEach(t -> System.out.println(t));
        }
        catch(Exception e){
            System.out.println("No se pudo realizar la consulta.\nRazon: "+e.getMessage());
        }
    }
    public void AumentoDePrecioPorPorcentajeACasasDePais(double porcentaje,String pais){
        try{
            dao.AumentarPrecioDeCasasDePaisPorPorcentaje(pais, porcentaje);
        }
        catch(Exception e){
            System.out.println("No se pudo realizar los cambios.\nRazon: "+e.getMessage());
        }
    }
    public void MostrarCantidadDeCasasPorPais(){
        try{
            dao.MostrarCantidadDeCasasPorPais();
        }
        catch(Exception e){
            System.out.println("No se pudo realizar la consulta.\nRazon: "+e.getMessage());
        }
    }
    public void MostrarCasasDeUnPaisQueEstenLimpias(String pais){
        try{
            dao.buscarCasasDePaisQueEstenLimpias("Reino Unido").forEach(t ->
            System.out.println(t)
            );
        }
        catch(Exception e){
            System.out.println("No se pudo realizar la consulta.\nRazon: "+e.getMessage());
        }
    }
}
