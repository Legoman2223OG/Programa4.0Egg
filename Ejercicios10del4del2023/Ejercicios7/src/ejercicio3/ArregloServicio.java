/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Arrays;

/**
 *
 * @author mi tamura
 */
/*
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números
aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

*/
public class ArregloServicio {
    public void inicializarA(double[] arreglo){
        for(int i=0;i<50;i++){
            arreglo[i]=Math.random()*10;
        }
    } 
    public void mostrar(double[] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
    public void ordenar(double[] arreglo){
        Arrays.sort(arreglo);
    }
    public void inicializarB(double[] arregloA, double[] arregloB){
        for(int i=0;i<10;i++){
            arregloB[i]=arregloA[i];
        }
        Arrays.fill(arregloB,10,20,0.5);
    }
}
