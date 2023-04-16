/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author mi tamura
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar una clase llamada ParDeNumeros que tenga como atributos dos 
        números reales con los cuales se realizarán diferentes operaciones 
        matemáticas. La clase debe tener un constructor vacío, getters y setters. 
        En el constructor vacío se usará el Math.random para generar los dos 
        números. 
        Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá 
        además implementar los siguientes métodos:
        A) Método mostrarValores que muestra cuáles son los dos números 
        guardados.
        B) Método devolverMayor para retornar cuál de los dos atributos tiene 
        el mayor valor
        C) Método calcularPotencia para calcular la potencia del mayor valor de 
        la clase elevado al menor número. Previamente se deben redondear ambos 
        valores.
        D) Método calculaRaiz, para calcular la raíz cuadrada del menor de los 
        dos valores. Antes de calcular la raíz cuadrada se debe obtener el 
        valor absoluto del número.
        */
        ParDeNumeros pdn= new ParDeNumeros();
        ParDeNumerosServicio sv= new ParDeNumerosServicio();
        sv.mostrarValores(pdn);
        sv.devolverMayor(pdn);
        sv.calcularPotencia(pdn);
        sv.calculaRaiz(pdn);
    }
    
}
