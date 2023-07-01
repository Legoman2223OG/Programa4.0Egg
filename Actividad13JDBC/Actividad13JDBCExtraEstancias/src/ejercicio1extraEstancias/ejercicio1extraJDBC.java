/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1extraEstancias;

import estancias.servicios.CasasServicio;
import estancias.servicios.EstanciasServicio;
import estancias.servicios.FamiliasServicio;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class ejercicio1extraJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstanciasServicio eSv= new EstanciasServicio();
        FamiliasServicio fSv= new FamiliasServicio();
        CasasServicio cSv= new CasasServicio();
        Scanner sc= new Scanner(System.in);
        String eleccion,tipomail,pais;
        int anio=0,mes=0,dias=0,canthijos=0,edadmax=0,diasmax=0,idcliente=0,idestancia=0,idcasa=0;
        double porcentaje=0;
        Date fechaHasta,fechaDesde,fecha;
        while(true){
            System.out.println("MENU DEL SISTEMA DE ESTANCIAS");
            System.out.println("------------------------------"
                              +"\n1-Listar familias por cantidad de hijos y una edad maxima"
                              +"\n2-Listar casas entre una fecha desde y hasta y que pertenezca a un pais indicado"
                              +"\n3-Listar familias con un tipo de mail"
                              +"\n4-Listar casas disponibles entre una fecha y un numero de dias especificos"
                              +"\n5-Listar clientes que alguna vez realizaron una estancia y su descripcion de la casa donde la realizaron"
                              +"\n6-Listar nombre, pais, ciudad de los clientes que hayan reservado una estancia y mostrar informacion de la casa"
                              +"\n7-Aumentar el precio de las casas por un porcentaje de casas que pertenezcan a un pais indicado"
                              +"\n8-Obtener el numero de casas por pais"
                              +"\n9-Listar casas que son descritas como limpias por comentario y que pertenezcan a un pais indicado"
                              +"\n10-Insertar una nueva estancia"
                              +"\n11-Salir"
                              +"\n-----------------------------"
                              +"Ingrese una opcion");
            eleccion = sc.next();
            switch(eleccion){
                case "1"->{
                    System.out.println("Ingrese una cantidad de hijos: ");
                    canthijos= sc.nextInt();
                    System.out.println("Ingrese una edad maxima: ");
                    edadmax= sc.nextInt();
                    fSv.FamiliasConAlMenosCiertosHijosYEdadMaxima(3, 10);
                }
                case "2"->{
                    System.out.println("Ingrese un año (YYYY) para la fecha desde: ");
                    anio= sc.nextInt();
                    System.out.println("Ingrese un mes (MM) para la fecha desde: ");
                    mes= sc.nextInt();
                    System.out.println("Ingrese un dia (DD) para la fecha desde: ");
                    dias= sc.nextInt();
                    fechaDesde = new Date((anio-1900),mes,dias);
                    System.out.println("Ingrese un año (YYYY) para la fecha hasta: ");
                    anio= sc.nextInt();
                    System.out.println("Ingrese un mes (MM) para la fecha hasta: ");
                    mes= sc.nextInt();
                    System.out.println("Ingrese un dia (DD) para la fecha hasta: ");
                    dias= sc.nextInt();
                    fechaHasta = new Date((anio-1900),mes,dias);
                    sc.nextLine();
                    System.out.println("Ingrese un pais: ");
                    pais= sc.nextLine();
                    cSv.CasasConEntreFechaDesdeyFechaHasta(fechaDesde,fechaHasta,pais);
                }
                case "3"->{
                    System.out.println("Ingrese un tipo de mail: ");
                    tipomail= sc.next();
                    fSv.FamiliasConEmailDeTipo("hotmail");
                }
                case "4"->{
                    System.out.println("Ingrese el año de la fecha (YYYY): ");
                    anio= sc.nextInt();
                    System.out.println("Ingrese el mes de la fecha (MM): ");
                    mes= sc.nextInt();
                    System.out.println("Ingrese el dia de la fecha (DD): ");
                    dias= sc.nextInt();
                    fecha= new Date((anio-1900),mes,dias);
                    System.out.println("Ingrese la cantidad de dias maximos: ");
                    diasmax= sc.nextInt();
                    cSv.CasasDisponiblesAPartirDeLaFechaYDiasMaximos(fecha, diasmax);
                }
                case "5"->{eSv.ClientesQueRealizaronUnaEstanciaYSusCasas();}
                case "6"->{eSv.NombrePaisCiudadDeClienteQueRealizoUnaEstanciaYInfoDeLaCasa();}
                case "7"->{
                    System.out.println("Ingrese un porcentaje: ");
                    porcentaje= sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingrese un pais: ");
                    pais= sc.nextLine();
                    cSv.AumentoDePrecioPorPorcentajeACasasDePais(porcentaje, pais);
                }
                case "8"->{cSv.MostrarCantidadDeCasasPorPais();}
                case "9"->{
                    sc.nextLine();
                    System.out.println("Ingrese un pais: ");
                    pais= sc.nextLine();
                    cSv.MostrarCasasDeUnPaisQueEstenLimpias(pais);
                }
                case "10"->{
                    try{
                        System.out.println("Ingrese el id de la estancia: ");
                        idestancia = sc.nextInt();
                        System.out.println("Ingrese el id del cliente: ");
                        idcliente = sc.nextInt();
                        System.out.println("Ingrese el id de la casa: ");
                        idcasa= sc.nextInt();
                        System.out.println("Ingrese un año (YYYY) para la fecha desde: ");
                        anio= sc.nextInt();
                        System.out.println("Ingrese un mes (MM) para la fecha desde: ");
                        mes= sc.nextInt();
                        System.out.println("Ingrese un dia (DD) para la fecha desde: ");
                        dias= sc.nextInt();
                        fechaDesde = new Date((anio-1900),mes,dias);
                        System.out.println("Ingrese un año (YYYY) para la fecha hasta: ");
                        anio= sc.nextInt();
                        System.out.println("Ingrese un mes (MM) para la fecha hasta: ");
                        mes= sc.nextInt();
                        System.out.println("Ingrese un dia (DD) para la fecha hasta: ");
                        dias= sc.nextInt();
                        fechaHasta = new Date((anio-1900),mes,dias);
                        eSv.crearEstancia(idestancia, idcliente, idcasa, fechaDesde, fechaHasta);
                    }
                    catch(Exception e){
                        System.out.println("No se pudo crear la estancia.\nRazon: "+e.getMessage());
                    }
                }
                case "11"->{
                    System.out.println("Saliendo del sistema.");
                }
                default -> {
                    System.out.println("La opcion ingresada no existe, intente de nuevo.");
                }
            }
            if(eleccion.equals("11"))
                break;
        }
    }
    
}
