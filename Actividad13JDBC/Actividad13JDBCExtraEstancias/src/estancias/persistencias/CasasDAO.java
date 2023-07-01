/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencias;

import estancias.entidades.Casas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author mi tamura
 */
public final class CasasDAO extends DAO {
    public void guardarCasa(Casas casa) throws Exception{
        try{
            if(casa==null)
                throw new Exception("Debe indicar una casa");
            java.sql.Date fechaDesde = new java.sql.Date(casa.getFechaDesde().getTime());
            java.sql.Date fechaHasta = new java.sql.Date(casa.getFechaHasta().getTime());
            String sql= "INSERT into casas (calle,ciudad,codigo_postal,fecha_desde,fecha_hasta,id_casa,numero,pais,precio_habitacion,tiempo_maximo,tiempo_minimo,tipo_vivienda)"
                    +"VALUES('"+casa.getCalle()+"','"+casa.getCiudad()+"','"+casa.getCodigoPostal()+"',DATE '"+(Integer.toString(fechaDesde.getYear())+"-"+Integer.toString(fechaDesde.getMonth())+"-"+Integer.toString(fechaDesde.getDay()))+
                    "',DATE '"+(Integer.toString(fechaHasta.getYear())+"-"+Integer.toString(fechaHasta.getMonth())+"-"+Integer.toString(fechaHasta.getYear()))+"',"+casa.getIdCasa()+","+casa.getNumero()+",'"
                    +casa.getPais()+"',"+casa.getPrecioHabitacion()+","+casa.getTiempoMaximo()+","+casa.getTiempoMinimo()+",'"+casa.getTipoVivienda()+"');";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void modificarCasa(Casas casa) throws Exception{
        try{
            if(casa == null)
                throw new Exception("Debe indicar una casa");
            java.sql.Date fechaDesde = new java.sql.Date(casa.getFechaDesde().getTime());
            java.sql.Date fechaHasta = new java.sql.Date(casa.getFechaHasta().getTime());
            String sql= "UPDATE casas SET calle = "+casa.getCalle()+",ciudad = "+casa.getCiudad()+
                    ",codigo_postal = "+casa.getCodigoPostal()+",fecha_desde = DATE '"+(Integer.toString(fechaDesde.getYear())+"-"+Integer.toString(fechaDesde.getMonth())+"-"+Integer.toString(fechaDesde.getDay()))+"',fecha_hasta = DATE '"+
                    (Integer.toString(fechaHasta.getYear())+"-"+Integer.toString(fechaHasta.getMonth())+"-"+Integer.toString(fechaHasta.getYear()))+"', numero = "+casa.getNumero()+", pais = "+casa.getPais()+
                    ", precio_habitacion = "+casa.getPrecioHabitacion()+", tiempo_maximo = "+casa.getTiempoMaximo()+", tiempo_minimo = "+casa.getTiempoMinimo()+", tipo_vivienda = "+casa.getTipoVivienda()+" WHERE id_casa = "+casa.getIdCasa()+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public void eliminarCasa(int idcasa) throws Exception{
        try{
            String sql="DELETE from casas WHERE id_casa= "+idcasa+";";
            insertarModificarEliminar(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
    public Casas buscarCasaPorId(int idcasa) throws Exception{
        try{
            String sql= "SELECT * from casas WHERE id_casa ="+idcasa+";";
            consultarBase(sql);
            Casas casa = null;
            while(resultado.next()){
                java.util.Date fechaDesde = new java.util.Date(resultado.getDate(7).getTime());
                java.util.Date fechaHasta = new java.util.Date(resultado.getDate(8).getTime());
                casa= new Casas();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(fechaDesde);
                casa.setFechaHasta(fechaHasta);
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));
            }
            desconectarBase();
            return casa;
        }
        catch(Exception e){
            desconectarBase();
            throw e;
        }
    }
    public Collection<Casas> listarCasas() throws Exception{
        try{
            String sql = "SELECT * FROM casas";
            consultarBase(sql);
            Casas casa;
            ArrayList<Casas> listaCasas = new ArrayList();
            while(resultado.next()){
                java.util.Date fechaDesde = new java.util.Date(resultado.getDate(7).getTime());
                java.util.Date fechaHasta = new java.util.Date(resultado.getDate(8).getTime());
                casa= new Casas();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(fechaDesde);
                casa.setFechaHasta(fechaHasta);
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));
                listaCasas.add(casa);
            }
            desconectarBase();
            return listaCasas;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
    public Collection<Casas> buscarCasaEntreDosFechasYPais(Date fecha1,Date fecha2,String pais) throws Exception{
        try{
            String fecha1YYMMDD= (Integer.toString(fecha1.getYear()+1900)+"-"+Integer.toString(fecha1.getMonth())+"-"+Integer.toString(fecha1.getDate()));
            String fecha2YYMMDD= (Integer.toString(fecha2.getYear()+1900)+"-"+Integer.toString(fecha2.getMonth())+"-"+Integer.toString(fecha2.getDate()));
            
            String sql = "SELECT * FROM casas WHERE (fecha_desde >= '"+fecha1YYMMDD+"' AND fecha_hasta <= '"+fecha2YYMMDD+"' AND pais = '"+pais+"');";
            consultarBase(sql);
            Casas casa;
            ArrayList<Casas> listaCasas = new ArrayList();
            while(resultado.next()){
                Date fechaDesde = new Date(resultado.getDate(7).getTime());
                Date fechaHasta = new Date(resultado.getDate(8).getTime());
                casa= new Casas();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(fechaDesde);
                casa.setFechaHasta(fechaHasta);
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));
                listaCasas.add(casa);
            }
            desconectarBase();
            return listaCasas;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
    public Collection<Casas> buscarCasaDisponibleAPartirDeFechaYDiasMaximos(Date fecha1,int dias) throws Exception{
        try{
            String fecha1YYMMDD= (Integer.toString(fecha1.getYear()+1900)+"-"+Integer.toString(fecha1.getMonth())+"-"+Integer.toString(fecha1.getDate()));
            String sql = "SELECT * FROM casas WHERE (fecha_desde >= '"+fecha1YYMMDD+"' AND  tiempo_maximo >= "+dias+");";
            consultarBase(sql);
            Casas casa;
            ArrayList<Casas> listaCasas = new ArrayList();
            while(resultado.next()){
                Date fechaDesde = new Date(resultado.getDate(7).getTime());
                Date fechaHasta = new Date(resultado.getDate(8).getTime());
                casa= new Casas();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(fechaDesde);
                casa.setFechaHasta(fechaHasta);
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));
                listaCasas.add(casa);
            }
            desconectarBase();
            return listaCasas;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
    public void AumentarPrecioDeCasasDePaisPorPorcentaje(String pais,double porcentaje) throws Exception{
        try{
            if(porcentaje <0){
                throw new Exception("Debe ingresar un porcentaje positivo");
            }
            porcentaje = porcentaje/100;
            String sql= "UPDATE casas SET precio_habitacion = precio_habitacion + (precio_habitacion * "+porcentaje+") WHERE pais = '"+pais+"';";
            insertarModificarEliminar(sql);
        }   
        catch(Exception e){
            throw e;
        }
    }
    public void MostrarCantidadDeCasasPorPais() throws Exception{
        try{
            String sql= "SELECT COUNT(*),pais from casas GROUP BY pais";
            consultarBase(sql);
            while(resultado.next()){
                System.out.println("Numero de casas: "+resultado.getInt(1)+", Pais: "+resultado.getString(2));
            }
            desconectarBase();
            
        }
        catch(Exception e){
            desconectarBase();
            System.out.println("No se pudo mostrar la consulta.\nRazon: "+e.getMessage());
        }
    }
    public Collection<Casas> buscarCasasDePaisQueEstenLimpias(String pais) throws Exception{
        try{
            
            String sql = "SELECT ca.* from casas as ca INNER JOIN comentarios as com WHERE ca.pais= '"+pais+"' AND com.comentario LIKE '%Limpía%';";
            consultarBase(sql);
            Casas casa;
            ArrayList<Casas> listaCasas = new ArrayList();
            while(resultado.next()){
                Date fechaDesde = new Date(resultado.getDate(7).getTime());
                Date fechaHasta = new Date(resultado.getDate(8).getTime());
                casa= new Casas();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(fechaDesde);
                casa.setFechaHasta(fechaHasta);
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));
                listaCasas.add(casa);
            }
            desconectarBase();
            return listaCasas;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
    public boolean VerificarSiLaCasaConIdTieneFechasDisponiblesDesdeHasta(int idcasa, Date fecha1, Date fecha2) throws Exception{
        try{
            if(fecha1.after(fecha2))
                throw new Exception("La fecha desde es superior a la fecha hasta");
            if(fecha2.before(fecha1))
                throw new Exception("La fecha hasta es inferior a la fecha desde");
            Casas casa= buscarCasaPorId(idcasa);
            return (fecha1.after(casa.getFechaDesde()) || fecha1== casa.getFechaDesde()) && (fecha2.before(casa.getFechaHasta()) || fecha2 == casa.getFechaHasta());
        }
        catch(Exception e){
            throw e;
        }
    }
}
