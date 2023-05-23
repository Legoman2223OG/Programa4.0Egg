/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3extra;

import java.util.ArrayList;

/**
 *
 * @author mi tamura
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    /*
    Una compañía de promociones turísticas desea mantener información sobre la infraestructura
    de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
    acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
    una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
    alojamientos: Hoteles y Alojamientos Extrahoteleros.
    Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
    Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
    características de las distintas categorías son las siguientes:
    • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
    Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
    • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
    Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
    Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
    Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
    acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
    cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
    será.
    El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
    agregado por gimnasio) + (valor agregado por limosinas).
    Donde:
    Valor agregado por el restaurante:
    • $10 si la capacidad del restaurante es de menos de 30 personas.
    • $30 si está entre 30 y 50 personas.
    • $50 si es mayor de 50.
    Valor agregado por el gimnasio:
    • $50 si el tipo del gimnasio es A.
    • $30 si el tipo del gimnasio es B.
    Valor agregado por las limosinas:
    • $15 por la cantidad de limosinas del hotel.

    17
    En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
    hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
    Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
    cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
    Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
    disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
    indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
    campo deportivo. Realizar un programa en el que se representen todas las relaciones
    descriptas.
    Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
    • todos los alojamientos.
    • todos los hoteles de más caro a más barato.
    • todos los campings con restaurante
    • todos las residencias que tienen descuento.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        AlojamientoServicio aSv= new AlojamientoServicio();
        ArrayList<Alojamiento> listaAlojamientos= new ArrayList();
        listaAlojamientos.add(new Camping(10,5,true,Privado.NO,30,"CarpinchoLandia","1290 e/30 y 10","CABA","Sonia Lomirez"));
        listaAlojamientos.add(new Camping(15,15,true,Privado.SI,40,"Megasia","Calle Gerundia 30","CABA","Lorenzo Subres"));
        listaAlojamientos.add(new Camping(10,5,false,Privado.NO,20,"Santos riales","Duranez 20","CABA","Silvan Silviano"));
        listaAlojamientos.add(new Residencia(20,true,false,Privado.NO,20,"Lindas Vistas","Porez y Sorez","CABA","Juansito Lobri"));
        listaAlojamientos.add(new Residencia(30,true,true,Privado.SI,40,"Super veraniego","Gral Nures","CABA","Sorrez Minisio"));
        listaAlojamientos.add(new Residencia(50,false,true,Privado.SI,50,"Locas Alturas","Duranez 20","CABA","Mauricio Lores"));
        listaAlojamientos.add(new Hotel4Estrellas("A","Mamamia!",60,30,4,3,"Hotel Puers","Gral Nures","CABA","Nickel"));
        //String gim, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int nroCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente
        listaAlojamientos.add(new Hotel4Estrellas("B","EgiptoTatum",40,20,3,2,"Hotel sisino","Porez y Sorez","CABA","Neigel"));
        listaAlojamientos.add(new Hotel4Estrellas("A","Loco Adams",31,40,4,4,"Piperland","Duranez 20","CABA","Lorez"));
        //int cantSalonesDeConferencia,int cantSuites, int cantLimosinas,String gim, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int nroCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente
        listaAlojamientos.add(new Hotel5Estrellas(5,4,20,"B","Mamamia!",60,50,5,5,"MegaRickness","Calle Gerundia 20","CABA","Dicio"));
        listaAlojamientos.add(new Hotel5Estrellas(4,3,40,"B","EgiptoTatum",50,60,6,6,"Milanga Extrema","Calle Gerundia 20","CABA","Porez"));
        listaAlojamientos.add(new Hotel5Estrellas(10,10,50,"A","Loco Adams",90,90,9,9,"Super Empresarial","Calle Gerundia 20","CABA","Rickny"));
        aSv.MostrarAlojamientos(listaAlojamientos);
        aSv.MostrarHotelesCarosABaratos(listaAlojamientos);
        aSv.MostrarCampingsConRestaurante(listaAlojamientos);
        aSv.MostrarResidenciasConDescuento(listaAlojamientos);
    }
    
}
