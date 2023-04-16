/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author mi tamura
 */
public class CadenaServicio {
    public void mostrarVocales(Cadena cadena){
        int contVocales=0;
        for(int i=0;i<cadena.getLongitud();i++){
            if(cadena.getFrase().substring(i,i+1).equalsIgnoreCase("A")||
               cadena.getFrase().substring(i,i+1).equalsIgnoreCase("E")||
               cadena.getFrase().substring(i,i+1).equalsIgnoreCase("I")||
               cadena.getFrase().substring(i,i+1).equalsIgnoreCase("O")||
               cadena.getFrase().substring(i,i+1).equalsIgnoreCase("U"))
                contVocales++;
        }
        System.out.println("La frase contiene "+contVocales+" vocales");
    }
    public void invertirFrase(Cadena cadena){
        String fraseInvertida="";
        for(int i=cadena.getLongitud()-1;i>=0;i--){
            fraseInvertida+= cadena.getFrase().charAt(i);
        }
        System.out.println(fraseInvertida);
    }
    public void vecesRepetido(Cadena cadena,String letra){
        int contRepetidos=0;
        for(int i=0;i<cadena.getLongitud();i++){
            if(cadena.getFrase().substring(i,i+1).equals(letra))
                contRepetidos++;
        }
        System.out.println("El caracter '"+letra+"' se repite "+contRepetidos);
    }
    public void compararLongitud(Cadena cadena,String frase){
        System.out.println(cadena.getLongitud()==frase.length() ? "Tienen la misma longitud":
                "No tienen la misma longitud");
    }
    public void unirFrases(Cadena cadena,String frase){
        System.out.println((cadena.getFrase()+frase));
    }
    /*Reemplazar remplaza todas las "a" de la frase por otra letra*/
    public void reemplazar(Cadena cadena,String letra){
        System.out.println(cadena.getFrase().replaceAll("a", letra));
    }
    public boolean contiene(Cadena cadena,String letra){
        for(int i=0;i<cadena.getLongitud();i++){
            if(cadena.getFrase().substring(i, i+1).equals(letra))
                return true;
        }
        return false;
    }
}
