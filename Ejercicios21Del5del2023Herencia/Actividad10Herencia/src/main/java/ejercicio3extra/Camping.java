/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3extra;

/**
 *
 * @author mi tamura
 */
public class Camping extends ExtraHotel {
    int cantMaxCarpas,cantBanios;
    boolean poseeRestaurante;

    public Camping(int cantMaxCarpas, int cantBanios, boolean poseeRestaurante, Privado priv, double cantMetrosCuadrados,String nombre, String direccion, String localidad, String gerente) {
        super(priv, cantMetrosCuadrados, nombre,  direccion,  localidad,  gerente);
        this.cantMaxCarpas = cantMaxCarpas;
        this.cantBanios = cantBanios;
        this.poseeRestaurante = poseeRestaurante;
    }

    @Override
    public String toString() {
        return "Camping "+super.getNombre()+": "+
                "\nDireccion: "+super.getDireccion()+
                "\nLocalidad: "+super.getLocalidad()+
                "\nGerente: "+super.getGerente()+
                "\nPrivado: "+super.getPriv().toString()+
                "\nCantidad Metros Cuadrados: "+super.getCantMetrosCuadrados()+
                "\nCantidad maxima de carpas: "+cantMaxCarpas+
                "\nCantidad de baños: "+cantBanios+
                "\nPosee Restaurante: "+(poseeRestaurante?"Si":"No");
    }

    public Camping() {
    }

    public int getCantMaxCarpas() {
        return cantMaxCarpas;
    }

    public void setCantMaxCarpas(int cantMaxCarpas) {
        this.cantMaxCarpas = cantMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isPoseeRestaurante() {
        return poseeRestaurante;
    }

    public void setPoseeRestaurante(boolean poseeRestaurante) {
        this.poseeRestaurante = poseeRestaurante;
    }

   
    
}
