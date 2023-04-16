/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra2;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class NIFServicio {
    String[] listaLetras={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z",
    "S","Q","V","H","L","C","K","E"};
    Scanner sc= new Scanner(System.in);
    public String generarNif(long dni){
        int num= (int)(dni%23);
        String cadena= Long.toString(dni)+"-"+listaLetras[num];
        return cadena;
    }
    public NIF crearNif(){
        NIF nuevoNif= new NIF();
        System.out.println("Ingrese su dni: ");
        nuevoNif.setDNI(sc.nextLong());
        nuevoNif.setLetra(generarNif(nuevoNif.getDNI()));
        System.out.println("NIF generado exitosamente");
        return nuevoNif;
    }
    public void mostrar(NIF n){
        System.out.println(n.getLetra());
    }
}
