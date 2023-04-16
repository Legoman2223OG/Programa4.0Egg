/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author mi tamura
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crear en el Main dos arreglos. El arreglo A de 50 números reales y el 
        arreglo B de 20 números reales. 
        Crear la clase ArregloService, en el paquete servicio, con los 
        siguientes métodos:
        A) Método inicializarA recibe un arreglo por parámetro y lo inicializa 
        con números aleatorios.
        B) Método mostrar recibe un arreglo por parámetro y lo muestra por 
        pantalla.
        C) Método ordenar recibe un arreglo por parámetro y lo ordena de 
        mayor a menor.
        D) Método inicializarB copia los primeros 10 números del arreglo A en 
        el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 
        0.5.
        
        En el Main nuevamente: inicializar A, mostrar A, ordenar A, 
        inicializar B, mostrar A y B.
        */
        double[] arregloA= new double[50];
        double[] arregloB= new double[20];
        ArregloServicio sv= new ArregloServicio();
        sv.inicializarA(arregloA);
        sv.mostrar(arregloA);
        sv.ordenar(arregloA);
        sv.inicializarB(arregloA, arregloB);
        sv.mostrar(arregloA);
        sv.mostrar(arregloB);
    }
    
}
