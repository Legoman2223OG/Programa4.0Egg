/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author mi tamura
 */
public class TelevisorServicio extends ElectrodomesticoServicio{
    public Televisor crearTelevisor(){
        double resolucion;
        boolean sintonizadorTDT=false;
        String eleccion;
        Electrodomestico electroBase= super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion del televisor: (Pulgadas)");
        resolucion= super.sc.nextDouble();
        System.out.println("Ingrese si el televisor cuenta con el sintonizador TDT (S/N)");
        eleccion= super.sc.next();
        if(eleccion.equalsIgnoreCase("S")) sintonizadorTDT= true;
        return new Televisor(resolucion,sintonizadorTDT,electroBase.getPrecio(),
            electroBase.getColor(),electroBase.getConsumoElectrico(),electroBase.getPeso());
    }
    @Override
    public void precioFinal(Electrodomestico televisor){
        super.precioFinal(televisor);
        Televisor telev= (Televisor) televisor;
        if(telev.getResolucion()>40) televisor.setPrecio(televisor.getPrecio() + ((televisor.getPrecio()*30)/100));
        if(telev.isSintonizadorTDT()) televisor.setPrecio(televisor.getPrecio() + 500);
    }
}
