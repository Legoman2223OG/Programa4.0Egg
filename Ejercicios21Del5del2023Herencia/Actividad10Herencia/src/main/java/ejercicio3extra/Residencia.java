/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3extra;

/**
 *
 * @author mi tamura
 */
public class Residencia extends ExtraHotel {
    int cantHabitaciones;

    @Override
    public String toString() {
        return "Residencia "+super.getNombre()+": "+
                "\nDireccion: "+super.getDireccion()+
                "\nLocalidad: "+super.getLocalidad()+
                "\nGerente: "+super.getGerente()+
                "\nPrivado: "+super.getPriv().toString()+
                "\nCantidad Metros Cuadrados: "+super.getCantMetrosCuadrados()+
                "\nCantidad de Habitaciones: "+cantHabitaciones+
                "\nDescuento a gremios: "+(descuentoAGremios?"Si":"No")+
                "\nPosee Campo Deportivo: "+(poseeCampoDeportivo?"Si":"No");
    }

    public Residencia(int cantHabitaciones, boolean descuentoAGremios, boolean poseeCampoDeportivo, Privado priv, double cantMetrosCuadrados,String nombre, String direccion, String localidad, String gerente) {
        super(priv, cantMetrosCuadrados, nombre,  direccion,  localidad,  gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoAGremios = descuentoAGremios;
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }
    boolean descuentoAGremios,poseeCampoDeportivo;

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoAGremios() {
        return descuentoAGremios;
    }

    public void setDescuentoAGremios(boolean descuentoAGremios) {
        this.descuentoAGremios = descuentoAGremios;
    }

    public boolean isPoseeCampoDeportivo() {
        return poseeCampoDeportivo;
    }

    public void setPoseeCampoDeportivo(boolean poseeCampoDeportivo) {
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }
    
}
