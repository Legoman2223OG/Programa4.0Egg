/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author mi tamura
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
        generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
        de rango).
        */
        ClaseConArray claseConUnArray= new ClaseConArray();
        try{
            int numero = claseConUnArray.getArregloDeEnteros()[7];
            System.out.println("Se ingreso el numero correctamente");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indice de arreglo fuera de rango");
        }
    }
    
}
