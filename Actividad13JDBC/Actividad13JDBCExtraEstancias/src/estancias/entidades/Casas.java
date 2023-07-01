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
public class Casas {
    String calle,ciudad,codigoPostal;
    Date fechaDesde,fechaHasta;
    int idCasa,numero;
    String pais;
    double precioHabitacion;
    int tiempoMaximo,tiempoMinimo;
    String tipoVivienda;

    @Override
    public String toString() {
        return "Casas{" + "calle=" + calle + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", idCasa=" + idCasa + ", numero=" + numero + ", pais=" + pais + ", precioHabitacion=" + precioHabitacion + ", tiempoMaximo=" + tiempoMaximo + ", tiempoMinimo=" + tiempoMinimo + ", tipoVivienda=" + tipoVivienda + '}';
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public int getTiempoMaximo() {
        return tiempoMaximo;
    }

    public void setTiempoMaximo(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public int getTiempoMinimo() {
        return tiempoMinimo;
    }

    public void setTiempoMinimo(int tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public Casas() {
    }

    public Casas(String calle, String ciudad, String codigoPostal, Date fechaDesde, Date fechaHasta, int idCasa, int numero, String pais, double precioHabitacion, int tiempoMaximo, int tiempoMinimo, String tipoVivienda) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.idCasa = idCasa;
        this.numero = numero;
        this.pais = pais;
        this.precioHabitacion = precioHabitacion;
        this.tiempoMaximo = tiempoMaximo;
        this.tiempoMinimo = tiempoMinimo;
        this.tipoVivienda = tipoVivienda;
    }
}
