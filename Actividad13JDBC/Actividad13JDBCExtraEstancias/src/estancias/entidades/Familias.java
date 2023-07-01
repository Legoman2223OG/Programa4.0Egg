/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.entidades;

/**
 *
 * @author mi tamura
 */
public class Familias {

    @Override
    public String toString() {
        return "Familias{" + "edadMaxima=" + edadMaxima + ", edadMinima=" + edadMinima + ", email=" + email + ", idCasaFamilia=" + idCasaFamilia + ", idFamilia=" + idFamilia + ", nombre=" + nombre + ", numHijos=" + numHijos + '}';
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdCasaFamilia() {
        return idCasaFamilia;
    }

    public void setIdCasaFamilia(int idCasaFamilia) {
        this.idCasaFamilia = idCasaFamilia;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public Familias() {
    }

    public Familias(int edadMaxima, int edadMinima, String email, int idCasaFamilia, int idFamilia, String nombre, int numHijos) {
        this.edadMaxima = edadMaxima;
        this.edadMinima = edadMinima;
        this.email = email;
        this.idCasaFamilia = idCasaFamilia;
        this.idFamilia = idFamilia;
        this.nombre = nombre;
        this.numHijos = numHijos;
    }
    int edadMaxima,edadMinima;
    String email;
    int idCasaFamilia,idFamilia;
    String nombre;
    int numHijos;
}
