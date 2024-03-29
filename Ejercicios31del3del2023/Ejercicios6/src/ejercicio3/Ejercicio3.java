/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author mi tamura
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar una clase llamada Persona en el paquete de entidades que tengan
        los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, 
        ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún 
        otro atributo, puede hacerlo. Agregar constructores, getters y setters.
        
        En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
        Método esMayorDeEdad(): indica si la persona es mayor de edad. 
        La función devuelve un booleano.
        Metodo crearPersona(): el método crear persona,
        le pide los valores de los atributos al usuario y después se le asignan 
        a sus respectivos atributos para llenar el objeto Persona. Además, 
        comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
        Si no es correcto se deberá mostrar un mensaje


        Método calcularIMC(): calculara si la persona está en su peso ideal 
        (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un 
        valor menor que 20, significa que la persona está por debajo de su 
        peso ideal y la función devuelve un -1. Si la fórmula da por resultado 
        un número entre 20 y 25 (incluidos), significa que la persona está en su
        peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
        fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso
        , y la función devuelve un 1.
        
        A continuación, en la clase main hacer lo siguiente:
        Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
        llamaremos todos los métodos para cada objeto, deberá comprobar si la 
        persona está en su peso ideal, tiene sobrepeso o está por debajo de su 
        peso ideal e indicar para cada objeto si la persona es mayor de edad.
        
        Por último, guardaremos los resultados de los métodos calcularIMC y 
        esMayorDeEdad en distintas variables(arrays), para después calcular 
        un porcentaje de esas 4 personas cuantas están por debajo de su peso, 
        cuantas en su peso ideal y cuantos, por encima, y también calcularemos 
        un porcentaje de cuantos son mayores de edad y cuantos menores. 
        Para esto, podemos crear unos métodos adicionales.
        */
        PersonaServicio servPers= new PersonaServicio();
        Persona p1= servPers.crearPersona();
        Persona p2= servPers.crearPersona();
        Persona p3= servPers.crearPersona();
        Persona p4= servPers.crearPersona();
        Persona[] listaPersonas={p1,p2,p3,p4};
        int[] listaPesos= new int[4];
        boolean[] listaEdades= new boolean[4];
        int contMenorEdad=0,contMayorEdad=0,contDebajoPeso=0,contPesoIdeal=0,contSobrePeso=0;
        for(int i=0;i<listaPersonas.length;i++){
            switch(servPers.calcularIMC(listaPersonas[i])){
                case -1: System.out.println("Esta persona esta debajo del peso ideal");
                         contDebajoPeso++;
                break;
                case 0: System.out.println("Esta persona tiene un peso ideal");
                         contPesoIdeal++;
                break;
                case 1: System.out.println("Esta persona tiene sobrepeso");
                         contSobrePeso++;
                break;
            };
            if(servPers.esMayorDeEdad(listaPersonas[i])) {
                System.out.println("Esta persona es mayor de edad");
                contMayorEdad++;
            }
            else {
                System.out.println("Esta persona es menro de edad");
                contMenorEdad++;
            }
            listaPesos[i]=servPers.calcularIMC(listaPersonas[i]);
            listaEdades[i]= servPers.esMayorDeEdad(listaPersonas[i]);
        }
        System.out.println("El porcentaje de mayores de edad es de: "+ obtenerPorcentaje(contMayorEdad)
        +"\nEl porcentaje de menores de edad es de: "+obtenerPorcentaje(contMenorEdad)
        +"\nEl porcentaje de gente que esta debajo del peso ideal es: "+obtenerPorcentaje(contDebajoPeso)
        +"\nEl porcentaje de gente que tiene el peso ideal es: "+obtenerPorcentaje(contPesoIdeal)
        +"\nEl porcentaje de gente que tiene sobrepeso es: "+obtenerPorcentaje(contSobrePeso)
        );
    }
    /*Calcula el porcentaje, depende del valor pasado por argumento*/
    public static int obtenerPorcentaje(int num){
        return (num*100)/4;
    }
}
