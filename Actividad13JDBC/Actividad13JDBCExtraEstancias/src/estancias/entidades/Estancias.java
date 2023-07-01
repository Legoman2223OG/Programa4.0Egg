/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.entidades;

import java.util.Date;

/**
 *
 * @author mi tamura
 */
public class Estancias {

    @Override
    public String toString() {
        return "Estancias{" + "fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", idCasa=" + idCasa + ", idCliente=" + idCliente + ", idEstancia=" + idEstancia + ", nombreHuesped=" + nombreHuesped + '}';
    }
    Date fechaDesde,fechaHasta;

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEstancia() {
        return idEstancia;
    }

    public void setIdEstancia(int idEstancia) {
        this.idEstancia = idEstancia;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public Estancias() {
    }

    public Estancias(Date fechaDesde, Date fechaHasta, int idCasa, int idCliente, int idEstancia, String nombreHuesped) {
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.idCasa = idCasa;
        this.idCliente = idCliente;
        this.idEstancia = idEstancia;
        this.nombreHuesped = nombreHuesped;
    }
    int idCasa,idCliente,idEstancia;
    String nombreHuesped;
}
