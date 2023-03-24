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
/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
privado base y un atributo privado altura. La clase incluirá un método para 
crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y 
un método para calcular el perímetro del rectángulo. Por último, tendremos 
un método que dibujará el rectángulo mediante asteriscos usando la base y 
la altura. Se deberán además definir los métodos getters, setters y 
constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
public class Rectangulo {
    private int base,altura;
    public Rectangulo()
    {
        base=0;
        altura=0;
    }
    public Rectangulo(int base, int altura){
        this.base= base;
        this.altura= altura;
    }
    public void dibujarRectangulo(){
        System.out.println("");
        for(int i=0;i<altura;i++){
            for(int z=0;z<base;z++){
                if(i>0&&i<altura-1&&z>0&&z<base-1) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println("");
        }
    }
    public int calcularSuperficie(){
        return base*altura;
    }
    public double calcularPerimetro(){
        return base*2+altura*2;
    }
    public void crearRectangulo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca una base y altura: ");
        base= sc.nextInt();
        altura= sc.nextInt();
    }
}
