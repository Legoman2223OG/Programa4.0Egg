/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.HashSet;

/**
 *
 * @author mi tamura
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
4. Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap
        */
        CodigoPostalServicio cSv= new CodigoPostalServicio();
        HashSet<CodigoPostal> listaCiudades=  cSv.ingresarCodigosPostales();
        for(int i=0;i<10;i++)
        {
            cSv.AgregarCiudadYCodPost(listaCiudades);
        }
        cSv.MostrarTodo(listaCiudades);
        cSv.MostrarCiudad(listaCiudades);
        cSv.MostrarCiudades(listaCiudades);
        cSv.AgregarCiudadYCodPost(listaCiudades);
        for(int i=0;i<3;i++){
            cSv.EliminarCiudad(listaCiudades);
        }
    }
    
}
