/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra2;

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
        Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs 
        con su correspondiente letra (NIF). Los atributos serán el número de DNI
        (entero largo) y la letra (String o char) que le corresponde. 
        En NIFService se dispondrá de los siguientes métodos:
        Métodos getters y setters para el número de DNI y la letra.
        
        Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la 
        letra que le corresponderá. Una vez calculado, le asigna la letra que 
        le corresponde según
        
        Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion
        y la letra en mayúscula; por ejemplo: 00395469-F).
        La letra correspondiente al dígito verificador se calculará a traves 
        de un método que funciona de la siguiente manera: Para calcular la letra
        se toma el resto de dividir el número de DNI por 23 (el resultado debe 
        ser un número entre 0 y 22). El método debe buscar en un array (vector) 
        de caracteres la posición que corresponda al resto de la división para 
        obtener la letra correspondiente. La tabla de caracteres es la siguiente:

        POSICIÓN LETRA
        0        T
        1        R
        2        W
        3        A
        4        G
        5        M
        6        Y
        7        F
        8        P
        9        D
        10       X
        11       B
        12       N
        13       J
        14       Z
        15       S
        16       Q
        17       V
        18       H
        19       L
        20       C
        21       K
        22       E
        */
        NIFServicio NSv= new NIFServicio();
        NIF miNif= NSv.crearNif();
        NSv.mostrar(miNif);
    }
    
}
