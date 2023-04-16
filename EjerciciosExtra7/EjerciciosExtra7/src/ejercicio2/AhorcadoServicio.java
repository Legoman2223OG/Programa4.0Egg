/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class AhorcadoServicio {
    String[] palabrasEncontradas;
    int estabaPalabra=0;
    public Ahorcado crearJuego(){
        Ahorcado ahorcado;
        Scanner sc= new Scanner(System.in);
        String palabra;
        int cantJug;
        System.out.println("Ingrese una palabra");
        palabra= sc.next();
        System.out.println("Ingrese la cantidad de jugadas maxima");
        cantJug= sc.nextInt();
        ahorcado= new Ahorcado(palabra.length());
        ahorcado.setCantJugadasMax(cantJug);
        ahorcado.setCantLetrasEncontradas(0);
        String[] letras= new String[palabra.length()];
        for(int i=0;i<palabra.length();i++){
            letras[i]= palabra.substring(i,i+1);
        }
        ahorcado.setPalabra(letras);
        palabrasEncontradas= new String[palabra.length()];
        Arrays.fill(palabrasEncontradas, "'a");
        return ahorcado;
    }
    public void longitud(Ahorcado ahorcado){
        System.out.println("Longitud de la palabra: "+ahorcado.getPalabra().length);
    }
    public boolean buscar(Ahorcado ahorcado, String letra){
        
        for(int i=0;i<ahorcado.getPalabra().length;i++){
            if(ahorcado.getPalabra()[i].equalsIgnoreCase(letra) && !palabrasEncontradas[i].equalsIgnoreCase(letra)){
                palabrasEncontradas[i]=letra;
                return true;
            }
        }
        return false;
    } 
    public boolean encontradas(Ahorcado ahorcado,String letra){
        
        if(buscar(ahorcado,letra)){
            return true;
        }
        return false;
    }
    public void intentos(Ahorcado ahorcado){
        System.out.println(ahorcado.getCantJugadasMax()>0?"Numero de oportunidades: "+ahorcado.getCantJugadasMax(): "Mensaje: Lo sentimos, no hay mas oportunidades");
    }
    public void juego(Ahorcado ahorcado){
        String letra;
        System.out.println("Ingrese una letra: ");
        letra= new Scanner(System.in).next();
        longitud(ahorcado);
        if(ahorcado.getCantLetrasEncontradas()!= ahorcado.getPalabra().length){
            if(encontradas(ahorcado,letra)) {
                if(ahorcado.getCantJugadasMax()>0){
                    ahorcado.setCantLetrasEncontradas(ahorcado.getCantLetrasEncontradas()+1);
                }
                System.out.println("Mensaje: La letra pertenece a la palabra.");
            }
            else System.out.println("Mensaje: La letra no pertenece a la palabra o ya se encotro anteriormente.");
            System.out.println("Numero de letras (encontradas, faltantes): ("+ahorcado.getCantLetrasEncontradas()+","+(ahorcado.getPalabra().length-ahorcado.getCantLetrasEncontradas())+")");
            intentos(ahorcado);
            ahorcado.setCantJugadasMax(ahorcado.getCantJugadasMax()-1);
        }
        else{
            System.out.println("Felicidades has ganado!");
            System.out.println("Palabra completa:");
            System.out.println(Arrays.toString(ahorcado.getPalabra()));
        }
        
    }
}
