/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.servicios;

import estancias.persistencias.FamiliasDAO;

/**
 *
 * @author mi tamura
 */
public class FamiliasServicio {
    private FamiliasDAO dao;
    public FamiliasServicio(){
        this.dao = new FamiliasDAO();
    }
    public void FamiliasConAlMenosCiertosHijosYEdadMaxima(int hijos,int edadmax){
        try{
            dao.buscarFamiliasConCantHijosYEdadMaximaInferiorA(hijos,edadmax).forEach(t -> System.out.println(t));
        }
        catch(Exception e){
            System.out.println("No se ha podido realizar la consulta.\nRazon: "+e.getMessage());
        }
    }
    public void FamiliasConEmailDeTipo(String tipoemail){
        try{
            dao.buscarFamiliasQueTenganEmailDeTipo(tipoemail).forEach(t -> System.out.println(t));
        }
        catch(Exception e){
            System.out.println("No se ha podido realizar la consulta.\nRazon: "+e.getMessage());
        }
    }
}
