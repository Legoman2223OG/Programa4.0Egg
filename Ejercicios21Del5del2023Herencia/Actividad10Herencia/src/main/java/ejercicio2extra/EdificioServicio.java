/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2extra;

import java.util.ArrayList;

/**
 *
 * @author mi tamura
 */
public class EdificioServicio {
    public double calcularSuperficie(Edificio edificio){
        return edificio.getLargo()*edificio.getAncho();
    }
    public double calcularVolumen(Edificio edificio){
        return edificio.getAlto()*calcularSuperficie(edificio);
    }
    public void cantPersonas(EdificioDeOficinas ediofc){
        System.out.println("La cantidad de personas que pueden entrar por piso es: "+ ediofc.getCantPersonas()*ediofc.nroOficinas+
                "\nLa cantidad de personas que pueden entrar en todo el edificio es: "+ ediofc.getCantPersonas()*ediofc.getNroPisos());
    }
    public void verVolumenYSuperficieDeEdificios(ArrayList<Edificio> listaEdificio){
        listaEdificio.forEach((Edificio edi)-> System.out.println("Edificio "+edi.getClass().getSimpleName()+
                                "\nSuperficie: "+calcularSuperficie(edi)+
                                "\nVolumen: "+calcularVolumen(edi)));
    }
    public void verCantDeportivosConTechadoYDescubierto(ArrayList<Edificio> listaEdificio){
        int cantTechado=0,cantDescubierto=0;
        for(Edificio edi: listaEdificio){
            if(edi.getClass()==Polideportivo.class){
                Polideportivo poli= (Polideportivo) edi;
                if(poli.getTipoInstalacion() == Instalacion.ABIERTO) cantDescubierto++;
                else cantTechado++;
            }
        }
        System.out.println("La cantidad de polideportivos al descubierto son: "+cantDescubierto+
                "\nLa cantidad de polideportivos techados son: "+cantTechado);
    }
    public void verOficinasConSuCantidadDePersonas(ArrayList<Edificio> listaEdificio){
        for(Edificio edi: listaEdificio){
            if(edi.getClass()==EdificioDeOficinas.class){
                EdificioDeOficinas ediof= (EdificioDeOficinas) edi;
                cantPersonas(ediof);
            }
        }
    }
}
