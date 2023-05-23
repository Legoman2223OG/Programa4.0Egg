/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3extra;

/**
 *
 * @author mi tamura
 */
public class Hotel5Estrellas extends Hotel4Estrellas {
    int cantSalonesDeConferencia,cantSuites,cantLimosinas;

    @Override
    public String toString() {
        return "Hotel5Estrellas "+super.getNombre()+": "+
                "\nDireccion: "+super.getDireccion()+
                "\nLocalidad: "+super.getLocalidad()+
                "\nGerente: "+super.getGerente()+
                "\nCantidad de Habitaciones: "+super.cantHabitaciones+
                "\nNumero de camas: "+super.nroCamas+
                "\nCantidad de pisos: "+super.cantPisos+
                "\nTipo de gimnasio: "+gim+
                "\nNombre de restaurante: "+nombreRestaurante+
                "\nCapacidad de restaurante: "+capacidadRestaurante+
                "\nCantidad de salones de conferencia: "+cantSalonesDeConferencia+
                "\nCantidad de suites: "+cantSuites+
                "\nCantidad de limosinas: "+cantLimosinas+
                "\nPrecio de habitaciones: "+super.getPrecioHabitaciones();
    }

    public Hotel5Estrellas(int cantSalonesDeConferencia,int cantSuites, int cantLimosinas,String gim, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int nroCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(gim, nombreRestaurante, capacidadRestaurante, cantHabitaciones, nroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.cantSalonesDeConferencia= cantSalonesDeConferencia;
        this.cantSuites= cantSuites;
        this.cantLimosinas= cantLimosinas;
        super.setPrecioHabitaciones(super.getPrecioHabitaciones()+(15*cantLimosinas));
    }

    public int getCantSalonesDeConferencia() {
        return cantSalonesDeConferencia;
    }

    public void setCantSalonesDeConferencia(int cantSalonesDeConferencia) {
        this.cantSalonesDeConferencia = cantSalonesDeConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }
    
}
