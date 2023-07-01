/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.entidades;

/**
 *
 * @author mi tamura
 */
public class Producto {
    private int codigo;
    private int codigoFabricante;
    private String nombre;
    private double precio;
    private Fabricante fabricante;

    public Producto(int codigo, int codigoFabricante, String nombre, double precio, Fabricante fabricante) {
        this.codigo = codigo;
        this.codigoFabricante = codigoFabricante;
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", codigoFabricante=" + codigoFabricante + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante + '}';
    }
    

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
