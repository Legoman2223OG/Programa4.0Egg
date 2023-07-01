/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.InputMismatchException;
import java.util.Scanner;
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
        Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
        causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
        no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
        número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
        utilizando bloques try/catch para las distintas excepciones
        */
        //Vamos a crear un intento de hacer un programa que divida 2 numeros
        //Pero con muchos casos obvios que pueden dar error
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        try{
            //Lo hago ya que en un sc.next() es imposible de mismatchear el 
            //tipo ya que todo lo comprendera como un string. aun si son palabras
            //reservadas.
            System.out.println("Ingrese un decimal: (De prueba)");
            sc.nextDouble();
            System.out.println("Ingrese el primer numero para dividir");
            num1= Integer.parseInt(sc.next());
            System.out.println("Ingrese el segundo numero para dividir");
            num2= Integer.parseInt(sc.next());
            System.out.println("El numero resultado de la division es: "+ (num1/num2));
        }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }
        catch(InputMismatchException e){
            //SI INPUTMISMATCHEXCEPTION no es un tipo valido de clase
            //necesitaras importar esto: 
            //import java.util.InputMismatchException;
            System.out.println("No coinciden los tipos de datos pedidos (el input era de tipo double)");
        }
        catch(NumberFormatException e){
            System.out.println("No puede traducirse a numero, acaso pusiste una palabra o alguna otra cosa que no sea un numero?");
        }
    }
    
}
