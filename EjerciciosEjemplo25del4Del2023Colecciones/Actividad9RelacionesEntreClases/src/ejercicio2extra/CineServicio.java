/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2extra;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class CineServicio {
    Scanner sc= new Scanner(System.in);
    public Cine rellenarCine(){
        
        double precioEntrada;
        System.out.println("Eliga un precio de entrada: ");
        precioEntrada= sc.nextDouble();
        Pelicula peliculaDelCine= new PeliculaServicio().crearPelicula();
        Cine rellenoCine= new Cine(peliculaDelCine,precioEntrada);
        rellenoCine.setAsientos(rellenarAsientos());
        return rellenoCine;
    }
    public Asiento[][] rellenarAsientos(){
        Asiento[][] sala= new Asiento[8][6];
        String letraActual="";
        for(int i=0;i<8;i++){
            for(int z=0;z<6;z++){
                switch(z){
                    case 0:
                        letraActual="A";
                        break;
                    case 1:
                        letraActual="B";
                        break;
                    case 2:
                        letraActual="C";
                        break;
                    case 3:
                        letraActual="D";
                        break;
                    case 4:
                        letraActual="E";
                        break;
                    case 5:
                        letraActual="F";
                        break;
                    default:
                        letraActual="";
                        break;
                }
                sala[i][z]= new Asiento(null,i,letraActual);
            }
        }
        return sala;
    }
    public void UbicarEspectadorEnSala(Cine cine,Espectador espectador){
        Asiento[][] asientosCine= cine.getAsientos();
        int columnaRandom,filaRandom;
        if(espectador.getDinero()< cine.getPrecioEntrada()){
            System.out.println("El espectador no cuenta con dinero suficiente para ver la pelicula.");
        }
        else if(!VerificarSiEstaLlenaLaSala(cine) && espectador.getEdad()>= cine.getPeliculaElegida().edadMinima){
            espectador.setDinero(espectador.getDinero()-cine.getPrecioEntrada());
            while(true){
                columnaRandom= (int)(Math.random()*6);
                filaRandom=(int)(Math.random()*8);
                if(asientosCine[filaRandom][columnaRandom].propietario==null){
                    asientosCine[filaRandom][columnaRandom].setPropietario(espectador);
                    System.out.println("Espectador "+espectador.getNombre()+" alojado en asiento "+
                                       asientosCine[filaRandom][columnaRandom].getIdFila()+" "+asientosCine[filaRandom][columnaRandom].getIdLetra() );
                    break;
                }
            }
        }
        if(VerificarSiEstaLlenaLaSala(cine)) System.out.println("El cine esta lleno!");
        if(espectador.getEdad()< cine.getPeliculaElegida().edadMinima) System.out.println("El espectador es menor de edad para ver esta pelicula...");
    }
    public boolean VerificarSiEstaLlenaLaSala(Cine cine){
        //Maximo personas: 48
        int contPersonas=0;
        Asiento[][] asientosCine= cine.getAsientos();
        for(int i=0;i<8;i++){
            for(int z=0;z<6;z++){
                if(asientosCine[i][z].propietario!=null) contPersonas++;
            }
        }
        return contPersonas==48;
    }
    public void MostrarAsientosDeSala(Cine cine){
        Asiento[][] asientosCine= cine.getAsientos();
        System.out.println("");
        for(int i=0;i<8;i++){
            for(int z=0;z<6;z++){
                System.out.print(asientosCine[i][z]+"|");
            }
            System.out.println("");
        }
    }
}
