/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosejemplo;

/**
 *
 * @author mi tamura
 */

/*
1) Ejercicio persona
Es tu turno, crea tu propio proyecto con la clase Persona.

2) Ejercicio persona – atributos
Seguiremos trabajando sobre la clase Persona que creamos y ahora deberás sumarle 
3 atributos que creas pertinentes.
3) Ejercicio persona – constructores
Volveremos a usar la clase Persona y vamos a crear objetos en tu Main utilizando
los constructores.
4) Ejercicio persona – Get y set
Continuaremos con nuestra clase Persona y vamos a primero crear los getter y 
setter y después invocarlos desde el Main con alguno de los objetos que 
instanciaste.

*/
/*1)*/
public class Persona {
    /*
    2) Creamos el constructor para pasarle parametros a las variables
    que definen las propiedades de la persona (Usaremos metodos (getters)
    para obtener los valores de estos atributos)
    */
    public Persona(String nombre,String apellido,int edad){
        /*
        Usaremos this. para hacer referencias a las variables de la clase y
        no a los parametros del constructor. 
        */
        /*Esta parte hara referencia a las variables de clase*/
        /* I          Esta parte hara referencia a el parametro*/
        /* V            V    */
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad= edad;
    }
    /*En los objetos podemos crear metodos llamados getters para llamar a los
    datos que queramos saber de la clase para evitar tener que definirlos como 
    publicos*/
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setApellido(String apellido){
        this.apellido= apellido;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    /*
    2)
    */
    private String nombre;
    private String apellido;
    private int edad;
}
