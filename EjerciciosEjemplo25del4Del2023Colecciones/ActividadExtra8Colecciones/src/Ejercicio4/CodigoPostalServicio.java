/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class CodigoPostalServicio {
    Scanner sc= new Scanner(System.in);
    /*
    CODIGOS POSTALES DE BUENOS AIRES
    CIUDADES: 
    ALGARROBO B2935
    RIO TALA B2944
    RUTA 9 KILOMETRO 169 5 B2930
    CARLOS TEJEDOR B6455
    COLONIA SERE B6459
    EL ESPINILLO B2946
    CURARU B6451
    OLIVERO CESAR B2931
    NECOL ESTACION FCGM B6077
    ALMIRANTE SOLIER B8109
    */
    public HashSet<CodigoPostal> ingresarCodigosPostales(){
        HashSet<CodigoPostal> lista= new HashSet();
        lista.add(new CodigoPostal("ALGARROBO",2935)); lista.add(new CodigoPostal("RIO TALA",2944));
        lista.add(new CodigoPostal("RUTA 9 KILOMETRO 169 5",2930)); lista.add(new CodigoPostal("CARLOS TEJEDOR",6455));
        lista.add(new CodigoPostal("COLONIA SERE",6459)); lista.add(new CodigoPostal("EL ESPINILLO",2946));
        lista.add(new CodigoPostal("CURARU",6451)); lista.add(new CodigoPostal("OLIVERO CESAR",2931));
        lista.add(new CodigoPostal("NECOL ESTACION FCGM",6077)); lista.add(new CodigoPostal("ALMIRANTE SOLIER",8109));
        return lista;
    }
    public void MostrarCodigosPostales(HashSet<CodigoPostal> lista){
        System.out.println("Lista codigos postales: ");
        for(CodigoPostal codPost:lista){
            System.out.println("Codigo Postal: "+codPost.getNumero());
        }
    }
    public void MostrarCiudad(HashSet<CodigoPostal> lista){
        System.out.println("Ingrese un codigo postal para ver su ciudad: ");
        int codigo= sc.nextInt();
        boolean encontrado=false;
        for(CodigoPostal codPost:lista){
            if(codPost.getNumero()==codigo){
                encontrado=true;
                System.out.println("Ciudad: "+codPost.getNombreCiudad());
            }
        }
        if(!encontrado) System.out.println("No se encontro la ciudad ni el codigo postal");
    }
    public void MostrarCiudades(HashSet<CodigoPostal> lista){
        System.out.println("Lista nombres de ciudad: ");
        for(CodigoPostal codPost:lista){
            System.out.println("Ciudad: "+codPost.getNombreCiudad());
        }
    }
    public void AgregarCiudadYCodPost(HashSet<CodigoPostal> lista){
        System.out.println("Ingrese el nombre de la ciudad: ");
        String nombreCiudad= sc.nextLine();
        System.out.println("Ingrese el codigo postal (Sin letras)");
        int codigoPostal= sc.nextInt();
        sc.nextLine();
        lista.add(new CodigoPostal(nombreCiudad,codigoPostal));
    }
    public void EliminarCiudad(HashSet<CodigoPostal> lista){
        System.out.println("Eliminar ciudad por codigo postal");
        System.out.println("Ingrese el codigo postal de la ciudad: ");
        int codigoPostal= sc.nextInt();
        Iterator it= lista.iterator();
        while(it.hasNext()){
            CodigoPostal ciudad= (CodigoPostal) it.next();
            if(ciudad.getNumero()==codigoPostal){
                it.remove();
                System.out.println("Ciudad "+ciudad.getNombreCiudad()+" Removida de la lista");
            }
        }
    }
    public void MostrarTodo(HashSet<CodigoPostal> lista){
        System.out.println("Datos: ");
        for(CodigoPostal codPost:lista){
            System.out.println(codPost);
        }
    }
}
