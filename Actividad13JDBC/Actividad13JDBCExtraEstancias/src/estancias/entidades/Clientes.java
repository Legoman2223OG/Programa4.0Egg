/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.entidades;

/**
 *
 * @author mi tamura
 */
public class Clientes {

    @Override
    public String toString() {
        return "Clientes{" + "calle=" + calle + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + ", email=" + email + ", idCliente=" + idCliente + ", nombre=" + nombre + ", numero=" + numero + ", pais=" + pais + '}';
    }
    String calle,ciudad,codigoPostal,email;
    int idCliente;
    String nombre;
    int numero;
    String pais;

    public Clientes() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Clientes(String calle, String ciudad, String codigoPostal, String email, int idCliente, String nombre, int numero, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.email = email;
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.numero = numero;
        this.pais = pais;
    }
}
