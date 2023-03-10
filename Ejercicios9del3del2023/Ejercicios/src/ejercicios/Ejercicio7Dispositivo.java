/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio7Dispositivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que simule el funcionamiento de un 
        dispositivo RS232, este tipo de dispositivo lee cadenas 
        enviadas por el usuario. Las cadenas deben llegar con un formato 
        fijo: tienen que ser de un máximo de 5 caracteres de largo, el 
        primer carácter tiene que ser X y el último tiene que ser una O.
        
        Las secuencias leídas que respeten el formato se consideran correctas,
        la secuencia especial “&&&&&” marca el final de los envíos 
        (llamémosla FDE), y toda secuencia distinta de FDE, 
        que no respete el formato se considera incorrecta.
        
        Al finalizar el proceso, se imprime un informe indicando la cantidad 
        de lecturas correctas e incorrectas recibidas. 
        Para resolver el ejercicio deberá investigar cómo se utilizan 
        las siguientes funciones de Java Substring(), Length(), equals().
        */
        String envio;
        int contCorrecto,contIncorrecto;
        contCorrecto=0;
        contIncorrecto=0;
        while(true){
            System.out.println("Introduce tu cadena de longitud 5\nIndique &&&&& para salir");
            envio= new Scanner(System.in).next();
            if(envio.equals("&&&&&")){
                break;
            }
            if(envio.substring(0,1).equals("X") && envio.substring(envio.length()-1,envio.length()).equals("O") && envio.length()==5){
               System.out.println("Enviado correctamente");
               contCorrecto+=1;
            }
            else{
                System.out.println("Envio incorrecto");
                contIncorrecto+=1;
            }

        }
        System.out.println("\nCantidad de envios correctos: "+contCorrecto+"\nCantidad de envios incorrectos: "+contIncorrecto);
    }
    
}
