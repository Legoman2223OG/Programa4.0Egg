/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

/**
 *
 * @author mi tamura
 */
public class RaicesServicio {
    public double getDiscriminante(Raices r){
        return (Math.pow(r.b,2))-(4*r.a*r.c);
    }
    public boolean tieneRaices(Raices r){
        return getDiscriminante(r)>=0;
    }
    public boolean tieneRaiz(Raices r){
        return getDiscriminante(r)==0;
    }
    public void obtenerRaices(Raices r){
        if(tieneRaices(r)){
            System.out.println(getDiscriminante(r));
            System.out.println(-getDiscriminante(r));
        }
    }
    public void obtenerRaiz(Raices r){
        if(tieneRaiz(r)) System.out.println(getDiscriminante(r));
    }
    public void calcular(Raices r){
        if(tieneRaiz(r)){
            obtenerRaiz(r);
        }
        else if(tieneRaices(r)){
            obtenerRaices(r);
        }
        else{
            System.out.println("No se pudo obtener las raices...");
        }
    }
}
