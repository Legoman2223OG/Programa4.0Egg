/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
        números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
        para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
        una división con los dos numeros y mostrar el resultado.
        */
        DivisionNumeroServicio dnSv= new DivisionNumeroServicio();
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1= Integer.parseInt(sc.next());
        System.out.println("Ingrese otro numero: ");
        int num2= Integer.parseInt(sc.next());
        DivisionNumero divNum= new DivisionNumero(num1,num2);
        try{
            System.out.println(dnSv.dividir(divNum));
        }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }
    }
    
}
