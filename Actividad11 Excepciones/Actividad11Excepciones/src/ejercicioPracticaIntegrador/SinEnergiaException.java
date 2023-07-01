/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPracticaIntegrador;

/**
 *
 * @author mi tamura
 */
public class SinEnergiaException extends Throwable{
    @Override
    
    public String toString(){
        return "Imposible de realizar la accion debido a no tener suficiente energia.";
    }

    public SinEnergiaException() {
    }

    public SinEnergiaException(String message) {
        super(message);
    }

    public SinEnergiaException(String message, Throwable cause) {
        super(message, cause);
    }

    public SinEnergiaException(Throwable cause) {
        super(cause);
    }

    public SinEnergiaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
