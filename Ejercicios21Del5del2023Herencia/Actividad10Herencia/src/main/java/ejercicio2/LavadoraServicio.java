/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author mi tamura
 */
public class LavadoraServicio extends ElectrodomesticoServicio {
    public Lavadora crearLavadora(){
        Electrodomestico electrodomBase= super.crearElectrodomestico();
        double carga;
        System.out.println("Ingrese la carga de la lavadora (kg)");
        carga= super.sc.nextDouble();
        return new Lavadora(electrodomBase.getPrecio(),electrodomBase.getColor(),electrodomBase.getConsumoElectrico()
        ,electrodomBase.getPeso(),carga);
    }
    @Override
    public void precioFinal(Electrodomestico lavadora){
        super.precioFinal(lavadora);
        var lavad= (Lavadora) lavadora;
        if(lavad.getCarga()>30) lavadora.setPrecio(lavadora.getPrecio()+500);
    }
}
