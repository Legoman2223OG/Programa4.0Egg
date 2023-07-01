/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author mi tamura
 */
/*
    Dado el método metodoC de la clase C, indique:
    a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
    a) Se ejecutaria c1, c2 (posiblemente la ultima sentencia (c3) es la que genere el error o esta, talvez ni se ejecute la primera sentencia del try)
                     c4 y c6
    b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
    b) Se ejecutaria c1,c2,c3 y c6
    c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
    c) Se ejecutaria c1,c2 (Mismo caso que en el a, posiblemente este se ejecute y no el ultimo o directamente ni lo ejecuta porque c2 da la excepcion)
                     c5 y c6.
*/
public class C {
    /*
    void metodoC() throws TuException{
            sentencia_c1
        try {
            sentencia_c2
            sentencia_c3
        } catch (MioException e){
            13
            sentencia_c4
        } catch (TuException e){
            sentencia_c5
        throw (e)
        }
        finally
            sentencia_c6
    }
    */
}
