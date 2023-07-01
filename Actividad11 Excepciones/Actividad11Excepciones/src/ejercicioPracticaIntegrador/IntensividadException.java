/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPracticaIntegrador;

/**
 *
 * @author mi tamura
 */
public class IntensividadException extends Throwable{
    public String toString(){
        return "No se reconoce el tipo de intensividad";
    }
    public IntensividadException() {
    }

    public IntensividadException(String message) {
        super(message);
    }

    public IntensividadException(String message, Throwable cause) {
        super(message, cause);
    }

    public IntensividadException(Throwable cause) {
        super(cause);
    }

    public IntensividadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
