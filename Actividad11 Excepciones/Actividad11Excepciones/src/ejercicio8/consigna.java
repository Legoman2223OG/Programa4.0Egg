/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author mi tamura
 */
public class consigna {
    /*Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
      Uno:  Valor final del try:44
            Valor final del finally: 45
            Valor antes del return: 46
46          //No ejecutara el valor del catch debido a que el parsing de el numero
            //es correcto.
      Dos:  Valor final del catch: 43
            Valor final del finally: 44
            Valor antes del return: 45
            45
            //En este caso si debido a que el numero que queremos parsear es una letra
            //y tira un NumberFormatException.
      Tres: 
        Valor final del finally:2
        Excepcion en metodo ( ) 
        java.lang.NumberFormatException: For input string: "W"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:665)
	at java.base/java.lang.Integer.parseInt(Integer.java:781)
	at ejercicio8.Tres.metodo(Tres.java:20)
	at ejercicio8.Tres.main(Tres.java:32)
        //Que paso aca?, otra vez intentamos parsear una palabra a string pero
        //No solo en el try, sino en el catch tambien, y faltaria un try catch
        //Anidado en ese mismo catch para evitarlo, pero al no tenerlo devuelve
        //una excepcion nueva.
        //Devuelve 2 ya que el try pudo ejecutar la primera linea que le suma 1
        //Al valor hasta que llego a el parseo de la letra, el finally se ejecuta
        //de todas formas pero no llega a el return del programa.
    */
}
