/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import ejercicio2.Electrodomestico;
import ejercicio2.Lavadora;
import ejercicio2.LavadoraServicio;
import ejercicio2.Televisor;
import ejercicio2.TelevisorServicio;
import java.util.ArrayList;
/**
 *
 * @author mi tamura
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos 
        para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
        Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se 
        deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los 
        televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del 
        precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 
        2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para 
        electrodomésticos, 2000 para lavadora y 5000 para televisor.
        */
        double precioEntero=0;
        LavadoraServicio lvSv= new LavadoraServicio();
        TelevisorServicio tvSv= new TelevisorServicio();
        ArrayList<Electrodomestico> electrodomesticos= new ArrayList();
        electrodomesticos.add(new Lavadora(1000,"Negro",'A',30,40));
        electrodomesticos.add(new Lavadora(1000,"Azul",'F',20,30));
        electrodomesticos.add(new Televisor(20,false,1000,"Rojo",'A',20));
        electrodomesticos.add(new Televisor(30,true,1000,"Gris",'A',20));
        for(Electrodomestico elec: electrodomesticos){
            if(elec.getClass()==Lavadora.class){
                lvSv.precioFinal(elec);
            }
            else{
                tvSv.precioFinal(elec);
            }
            System.out.println("Precio de electrodomestico "+elec.getClass()+": "+ elec.getPrecio());
            precioEntero+= elec.getPrecio();
        }
        System.out.println("El precio total de todos los electrodomesticos es: "+precioEntero);
        
        
    }
    
}
