/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3extra;

/**
 *
 * @author mi tamura
 */
public class Hotel4Estrellas extends Hotel{
     
    String nombreRestaurante,gim; //GIM ES A O B
    int capacidadRestaurante;

    @Override
    public String toString() {
        return "Hotel4Estrellas "+super.getNombre()+": "+
                "\nDireccion: "+super.getDireccion()+
                "\nLocalidad: "+super.getLocalidad()+
                "\nGerente: "+super.getGerente()+
                "\nCantidad de Habitaciones: "+super.cantHabitaciones+
                "\nNumero de camas: "+super.nroCamas+
                "\nCantidad de pisos: "+super.cantPisos+
                "\nTipo de gimnasio: "+gim+
                "\nNombre de restaurante: "+nombreRestaurante+
                "\nCapacidad de restaurante: "+capacidadRestaurante+
                "\nPrecio de habitaciones: "+super.getPrecioHabitaciones();
    }

    public Hotel4Estrellas(String gim, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int nroCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.gim = gim;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        if(capacidadRestaurante<30) super.setPrecioHabitaciones(super.getPrecioHabitaciones()+10);
        else if(capacidadRestaurante>=30&&capacidadRestaurante<=50) super.setPrecioHabitaciones(super.getPrecioHabitaciones()+30);
        else super.setPrecioHabitaciones(super.getPrecioHabitaciones()+50);
        if(gim.equals("A")) super.setPrecioHabitaciones(super.getPrecioHabitaciones()+50);
        else super.setPrecioHabitaciones(super.getPrecioHabitaciones()+30);
    }

    public String getGim() {
        return gim;
    }

    public void setGim(String gim) {
        this.gim = gim;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }
}
