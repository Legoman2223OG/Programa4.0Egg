/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
MANOS A LA OBRA – DETECCIÓN DE ERRORES
Corrige el siguiente código:
Array<int> listado = new ArrayList; | Correcto: ArrayList<Integer> listado= new ArrayList();
TreeSet<String> = TreeSet(); | Correcto: TreeSet<String> conjunto= new TreeSet();
HashMap<Integer> personas = new HashMap<>; | HashMap<Integer> personas= new HashMap();
*/
/*
MANOS A LA OBRA – DETECCIÓN DE ERRORES
HashMap<Integer> personas = new HashMap<>;
String n1 = “Albus”;
String n2 = “Severus”;
personas.add(n1);
personas.add(n2);

Esto esta mal ya que el tipo que acepta el mapa es de tipo Integer, por lo cual
es imposible de agregarlo + new HashMap tiene un <> y no un ()
*/

/*
MANOS A LA OBRA - DETECCIÓN DE ERRORES
ArrayList<String> = new ArrayList() //LE falta un ; y nombre de variable
bebidas.put(“café);  //Le falta un  "" Ademas el "" no parece ser de mismo tipo que el ""
                     //Put no se usa en esta ocasion ya que eso solo funciona en mapas. y necesitaria una llave
bebidas.add(“té”);   // Mismo caso que arriba pero solo con los "", excepto que poner add esta bien
Iterator<String> it =bebidas.iterator(); //Esta bien escrito pero... bebidas?? no esta definido
whale (it.next()){  //Confundio la palabra while (mientras) con whale (ballena)
                    //Ademas deberia ser it.hasNext() no un next()
if (it.next().equals(“café”)){ //Cada vez que se verifique esto next se ejecuta y salta al siguiente elemento
                                // aun si la condicion no se cumple.
                                //funciona pero... si cafe hubiera sido agregado con un add.
it.remove();
}
*/
/**
 *
 * @author mi tamura
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        EJERCICIO COLECCIONES
        Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
        */
        //LISTAS
        ArrayList<Integer> numerosA= new ArrayList();
        int x=20;
        numerosA.add(x); //Agregamos 20 en la posicion 0
        numerosA.add(30); //Agregamos 30 en la posicion 1
        numerosA.add(40); //Agregamos 40 en la posicion 2
        numerosA.add(50); //Agregamos 50 en la posicion 3
        numerosA.add(60); //Agregamos 60 en la posicion 4
        //REMOVER (Se puede por primera aparicion de objeto, o posicion)
        numerosA.remove(0);
        numerosA.remove(1);
        numerosA.remove(2);
        numerosA.remove(3);
        numerosA.remove(60);
        //CONJUNTOS
        HashSet<Integer> numerosB= new HashSet();
        Integer y=20;
        numerosB.add(y); //20 en Pos 0
        numerosB.add(30); //30 en pos 1
        numerosB.add(40); //40 en pos 2
        numerosB.add(50); //50 en pos 3
        numerosB.add(60); //60 en pos 4
        //REMOVER (Solo se puede por elemento, no por posicion y tambien por primera aparicion del dato)
        numerosB.remove(y);
        numerosB.remove(30);
        numerosB.remove(40);
        numerosB.remove(50);
        numerosB.remove(60);
        //MAPAS
        HashMap<Integer,String> alumnos= new HashMap();
        int dni=34576189;
        String nombreAlumno="Pepe";
        alumnos.put(dni, nombreAlumno); //Agregamos llave y valor
        alumnos.put(59493020,"Juarez");
        alumnos.put(30495839,"Silvia");
        alumnos.put(20394859,"Jorge");
        alumnos.put(20347717,"Boris");
        //REMOVER (Se identifica con su llave respectiva lo que se quiere borrar)
        alumnos.remove(34576189);
        alumnos.remove(59493020);
        alumnos.remove(30495839);
        alumnos.remove(20394859);
        alumnos.remove(20347717);
        
    }
    
}
