/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPracticaIntegrador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mi tamura
 */
public class JARVISServicio {
    public void caminar(Armadura armadura,int tiempo) throws SinEnergiaException, IntensividadException, Exception{
        float cantEnergiaConsumida= (armadura.getBota1().getConsumoDeEnergia()+
                                             armadura.getBota2().getConsumoDeEnergia());
        if(armadura.getEnergiaDisponible()> cantEnergiaConsumida*tiempo)
        {
            Usar(armadura,"Basico",tiempo,cantEnergiaConsumida);
            ChanceDeDañoDe30Porciento(armadura,"Botas");
        }
        else{
            throw new SinEnergiaException();
        }
    }
    public void correr(Armadura armadura,int tiempo) throws SinEnergiaException, IntensividadException, Exception{
        float cantEnergiaConsumida= (armadura.getBota1().getConsumoDeEnergia()+
                                             armadura.getBota2().getConsumoDeEnergia());
        if(armadura.getEnergiaDisponible()> cantEnergiaConsumida*tiempo)
        {
            Usar(armadura,"Normal",tiempo,cantEnergiaConsumida);
            ChanceDeDañoDe30Porciento(armadura,"Botas");
        }
        else{
            throw new SinEnergiaException();
        }
    }
    public void propulsar(Armadura armadura,int tiempo) throws SinEnergiaException, IntensividadException, Exception{
        boolean funcionanAmbasPartes= (armadura.getBota1().isFuncionaPropulsor() && armadura.getBota2().isFuncionaPropulsor());
        float cantEnergiaConsumida= (armadura.getBota1().getConsumoDeEnergia()+
                                             armadura.getBota2().getConsumoDeEnergia());
        if(armadura.getEnergiaDisponible()> cantEnergiaConsumida*tiempo && funcionanAmbasPartes)
        {
            Usar(armadura,"Intensivo",tiempo,cantEnergiaConsumida);
            ChanceDeDañoDe30Porciento(armadura,"Botas");
        }
        else if(!funcionanAmbasPartes){
            throw new Exception("No funcionan algunos de los propulsores");
        }
        else{
            throw new SinEnergiaException();
        }
    }
    public void volar(Armadura armadura,int tiempo) throws SinEnergiaException, IntensividadException, Exception{
        boolean funcionanLasPartes= (armadura.getBota1().isFuncionaPropulsor() && 
                                       armadura.getBota2().isFuncionaPropulsor() &&
                                       armadura.getGuante1().isFuncionaRepulsor() &&
                                       armadura.getGuante2().isFuncionaRepulsor());
        float cantEnergiaConsumidaGuantes= (armadura.getGuante1().getConsumoDeEnergia()+
                                             armadura.getGuante2().getConsumoDeEnergia());
        float cantEnergiaConsumidaBotas= (armadura.getBota1().getConsumoDeEnergia()+
                                        armadura.getBota2().getConsumoDeEnergia());
        if(armadura.getEnergiaDisponible()>= cantEnergiaConsumidaGuantes*tiempo
                &&
           armadura.getEnergiaDisponible()>= cantEnergiaConsumidaBotas*tiempo
                && funcionanLasPartes)
        {
            Usar(armadura,"Intensivo",tiempo,cantEnergiaConsumidaBotas);
            Usar(armadura,"Normal",tiempo,cantEnergiaConsumidaGuantes);
            ChanceDeDañoDe30Porciento(armadura,"Botas");
            ChanceDeDañoDe30Porciento(armadura,"Guantes");
        }
        else if(!funcionanLasPartes){
            throw new Exception("No funcionan todas las partes, algo esta fallando en alguna bota"
                    + "o guante.");
        }
        else{
            throw new SinEnergiaException();
        }
    }
    public void disparar(Armadura armadura,int tiempo) throws SinEnergiaException, IntensividadException, Exception{
        boolean funcionanLosGuantes= (armadura.getGuante1().isFuncionaRepulsor() &&
                                      armadura.getGuante2().isFuncionaRepulsor());
        float cantEnergiaConsumida= (armadura.getGuante1().getConsumoDeEnergia()+
                                             armadura.getGuante2().getConsumoDeEnergia());
        if(armadura.getEnergiaDisponible()> cantEnergiaConsumida*tiempo &&
                funcionanLosGuantes)
        {
            Usar(armadura,"Intensivo",tiempo,cantEnergiaConsumida);
            ChanceDeDañoDe30Porciento(armadura,"Guantes");
        }
        else if(funcionanLosGuantes){
            throw new Exception("No funcionan alguno de los repulsores de los guantes");
        }
        else{
            throw new SinEnergiaException();
        }
    }
    public void escribir(Armadura armadura, int tiempo) throws SinEnergiaException, IntensividadException, Exception{
        float cantEnergiaConsumida= armadura.getCasco().getConsumoDeEnergiaConsola();
        if(armadura.getEnergiaDisponible()>= cantEnergiaConsumida*tiempo && armadura.getCasco().isFuncionaConsola())
        {
            Usar(armadura,"Basico",tiempo,cantEnergiaConsumida);
            ChanceDeDañoDe30Porciento(armadura,"Casco");
        }
        else if(!armadura.getCasco().isFuncionaConsola()){
            throw new Exception("No funciona la consola");
        }
        else{
            throw new SinEnergiaException();
        }
    }
    public void hablar(Armadura armadura, int tiempo) throws SinEnergiaException, IntensividadException, Exception{
        float cantEnergiaConsumida= armadura.getCasco().getConsumoDeEnergiaSintetizador();
        if(armadura.getEnergiaDisponible()>= cantEnergiaConsumida*tiempo
                && armadura.getCasco().isFuncionaSintetizador())
        {
            Usar(armadura,"Basico",tiempo,cantEnergiaConsumida);
            ChanceDeDañoDe30Porciento(armadura,"Casco");
        }
        else if(!armadura.getCasco().isFuncionaSintetizador()){
            throw new Exception("No funciona el sintetizador");
        }
        else{
            throw new SinEnergiaException();
        }
    }
    public void Usar(Armadura armadura,String intensividad, int tiempo, float cantEnergiaConsumida) throws IntensividadException{
        switch(intensividad){
            case "Basico" -> {
                cantEnergiaConsumida= cantEnergiaConsumida*tiempo;
                armadura.setEnergiaDisponible(armadura.getEnergiaDisponible()-cantEnergiaConsumida);
                System.out.println("Energia consumida: "+cantEnergiaConsumida);
            }
            case "Normal" -> {
                cantEnergiaConsumida= cantEnergiaConsumida*tiempo;
                armadura.setEnergiaDisponible(armadura.getEnergiaDisponible()-cantEnergiaConsumida*2);
                System.out.println("Energia consumida: "+cantEnergiaConsumida*2);
            }
            case "Intensivo" -> {
                cantEnergiaConsumida= cantEnergiaConsumida*tiempo;
                armadura.setEnergiaDisponible(armadura.getEnergiaDisponible()-cantEnergiaConsumida*3);
                System.out.println("Energia consumida: "+cantEnergiaConsumida*3);
            }
            default -> throw new IntensividadException();
        }
    }
    public void ChanceDeDañoDe30Porciento(Armadura armadura,String parteOperada) throws Exception{
         double chanceDeRomperse= Math.random();
         double chanceDeRomperseParte= Math.random();
         if(chanceDeRomperse<=0.3){
             switch(parteOperada){
                 case "Botas" -> {
                     if(chanceDeRomperseParte > 0.5) armadura.getBota1().setFuncionaPropulsor(false);
                     else armadura.getBota2().setFuncionaPropulsor(false);
                 }
                 case "Guantes" -> {
                     if(chanceDeRomperseParte > 0.5) armadura.getGuante1().setFuncionaRepulsor(false);
                     else armadura.getGuante2().setFuncionaRepulsor(false);
                 }
                 case "Casco" -> {
                     if(chanceDeRomperseParte > 0.5) armadura.getCasco().setFuncionaSintetizador(false);
                     else armadura.getCasco().setFuncionaConsola(false);
                 }
                 default -> throw new Exception("No existe la parte indicada");
             }
         }
    }
    //ESTADO
    public void estadoDeLaBateria(Armadura armadura){
        float calculoPorcentaje= Float.MAX_VALUE * (armadura.getEnergiaDisponible()/100);
        System.out.println("Estado de la bateria: "+ calculoPorcentaje);
    }
    public void estadoDelReactor(Armadura armadura){
        System.out.println("Estado del reactor en volteos: "+armadura.getEnergiaDisponible());
        System.out.println("Estado del reactor en Watts: "+(armadura.getEnergiaDisponible()*0.6));
    }
    public void estadoDeDanios(Armadura armadura){
        System.out.println("Estado de la bota izquierda: "+
                (armadura.getBota1().isFuncionaPropulsor()?"FUNCIONAL":"ROTA")+
                "\nEstado de la bota derecha: "+
                (armadura.getBota2().isFuncionaPropulsor()?"FUNCIONAL":"ROTA")+
                "\nEstado de el guante izquierdo: "+
                (armadura.getGuante1().isFuncionaRepulsor()?"FUNCIONAL":"ROTA")+
                "\nEstado de el guante derecho: "+
                (armadura.getGuante2().isFuncionaRepulsor()?"FUNCIONAL":"ROTA")+
                "\nEstado de el sintetizador: "+
                (armadura.getCasco().isFuncionaSintetizador()?"FUNCIONAL":"ROTA")+
                "\nEstado de la consola: "+
                (armadura.getCasco().isFuncionaConsola()?"FUNCIONAL":"ROTA"));
    }
    public void repararDaniosCon40Porciento(Armadura armadura,String dispositivo) throws Exception{
        double probabilidad= Math.random();
        switch(dispositivo){
            case "Consola" -> {
                if(armadura.getCasco().isFuncionaConsola()){
                    System.out.println("Este dispositivo ya estaba en buenas condiciones");
                }
                else if(probabilidad<=0.4){
                    armadura.getCasco().setFuncionaConsola(true);
                    System.out.println("Se logro arreglar la consola!");
                }
                else{
                    System.out.println("No se ha podido lograr las reparaciones del casco...");
                }
            }
            case "Sintetizador" -> {
                if(armadura.getCasco().isFuncionaSintetizador()){
                    System.out.println("Este dispositivo ya estaba en buenas condiciones");
                }
                else if(probabilidad<=0.4){
                    armadura.getCasco().setFuncionaSintetizador(true);
                    System.out.println("Se logro arreglar el sintetizador!");
                }
                else{
                    System.out.println("No se ha podido lograr las reparaciones del sintetizador...");
                }
            }
            case "GuanteIzquierdo" -> {
                if(armadura.getGuante1().isFuncionaRepulsor()) System.out.println("Este dispositivo ya estaba en buenas condiciones");
                else if(probabilidad<=0.4){
                    armadura.getGuante1().setFuncionaRepulsor(true);
                }
                else{
                    System.out.println("No se ha podido lograr las reparaciones del guante izquierdo...");
                }
            }
            case "GuanteDerecho" -> {
                if(armadura.getGuante2().isFuncionaRepulsor()) System.out.println("Este dispositivo ya estaba en buenas condiciones");
                else if(probabilidad<=0.4){
                    armadura.getGuante2().setFuncionaRepulsor(true);
                }
                else{
                    System.out.println("No se ha podido lograr las reparaciones del guante derecho...");
                }
            }
            case "BotaIzquierda" -> {
                if(armadura.getBota1().isFuncionaPropulsor()) System.out.println("Este dispositivo ya estaba en buenas condiciones");
                else if(probabilidad<=0.4){
                    armadura.getBota1().setFuncionaPropulsor(true);
                }
                else{
                    System.out.println("No se ha podido lograr las reparaciones de la bota izquierda..");
                }
            }
            case "BotaDerecha" -> {
                if(armadura.getBota2().isFuncionaPropulsor()) System.out.println("Este dispositivo ya estaba en buenas condiciones");
                else if(probabilidad<=0.4){
                    armadura.getBota2().setFuncionaPropulsor(true);
                }
                else{
                    System.out.println("No se ha podido lograr las reparaciones de la bota derecha...");
                }
            }
            default -> throw new Exception("El dispositivo elegido no corresponde a ninguno que pertenezca a la armadura");
        }
    }
    //Revisando dispositivos
    public void revisarDispositivos(Armadura armadura) throws Exception{
       int contBotas=0,contGuantes=0;
       ArrayList<Object> listaDeComponentes= new ArrayList();
       listaDeComponentes.add(armadura.getBota1());
       listaDeComponentes.add(armadura.getBota2());
       listaDeComponentes.add(armadura.getGuante1());
       listaDeComponentes.add(armadura.getGuante2());
       listaDeComponentes.add(armadura.getCasco());
       Iterator it= listaDeComponentes.iterator();
       do{
          Object parte= it.next();
          if(parte.getClass()==Bota.class){
              String parteAOperar= contBotas==0? "BotaIzquierda":"BotaDerecha";
              Bota botaParte= (Bota) parte;
              if(botaParte!=null){
                  if(!botaParte.isFuncionaPropulsor()){
                    while(true){
                        botaParte= (Bota) RomperORepararCon30Porciento(armadura,parteAOperar);
                        if(botaParte.isFuncionaPropulsor()){
                            switch(parteAOperar){
                                case "BotaIzquierda" -> armadura.setBota1(botaParte);
                                case "BotaDerecha" -> armadura.setBota2(botaParte);
                            }
                            System.out.println("Se logro reparar la bota!");
                            break;
                        }
                        else if(botaParte==null){
                           switch(parteAOperar){
                                case "BotaIzquierda" -> armadura.setBota1(botaParte);
                                case "BotaDerecha" -> armadura.setBota2(botaParte);
                            }
                            System.out.println("La reparacion fue desastroza y se rompio la bota...");
                           break;
                        }
                    }
                  }
              }
              else{
                  System.out.println("La bota esta destruida");
              }
              contBotas++;
          }
          if(parte.getClass()==Guante.class){
              String parteAOperar= contGuantes==0? "GuanteIzquierdo":"GuanteDerecho";
              Guante guanteParte= (Guante) parte;
              if(guanteParte!=null){
                  if(!guanteParte.isFuncionaRepulsor()){
                    while(true){
                        guanteParte= (Guante) RomperORepararCon30Porciento(armadura,parteAOperar);
                        if(guanteParte.isFuncionaRepulsor()){
                            switch(parteAOperar){
                                case "GuanteIzquierdo" -> armadura.setGuante1(guanteParte);
                                case "GuanteDerecho" -> armadura.setGuante2(guanteParte);
                            }
                            System.out.println("Se logro reparar la bota!");
                            break;
                        }
                        else if(guanteParte==null){
                           switch(parteAOperar){
                                case "GuanteIzquierdo" -> armadura.setGuante1(guanteParte);
                                case "GuanteDerecho" -> armadura.setGuante2(guanteParte);
                            }
                            System.out.println("La reparacion fue desastroza y se rompio la bota...");
                           break;
                        }
                    }
                  }
              }
              else{
                  System.out.println("El guante esta destruido");
              }
              contGuantes++;
          }
          if(parte.getClass()==Casco.class){
              Casco cascoParte= (Casco) parte;
              if(cascoParte!=null){
                if(!cascoParte.isFuncionaConsola()){
                    while(true){
                        cascoParte= (Casco) RomperORepararCon30Porciento(armadura,"Consola");
                        if(armadura.getCasco()==null){
                            armadura.setCasco(cascoParte);
                            System.out.println("La reparacion fue desastroza y se rompio el casco...");
                            break;
                        }
                        else if(armadura.getCasco().isFuncionaConsola()){
                            armadura.setCasco(cascoParte);
                            System.out.println("Se logro reparar la consola!");
                            break;
                        }
                    }
                }
                if(!cascoParte.isFuncionaSintetizador()){
                    while(true){
                        cascoParte=(Casco) RomperORepararCon30Porciento(armadura,"Sintetizador");
                        if(armadura.getCasco()==null){
                            armadura.setCasco(cascoParte);
                            System.out.println("La reparacion fue desastroza y se rompio el casco...");
                            break;
                        }
                        else if(armadura.getCasco().isFuncionaConsola()){
                            armadura.setCasco(cascoParte);
                            System.out.println("Se logro reparar el sintetizador!");
                            break;
                        }
                    }
                }
              }
              else{
                  System.out.println("El casco esta destruido");
              }
              
          }
       }while(it.hasNext());
    }
    public Object RomperORepararCon30Porciento(Armadura armadura,String dispositivo) throws Exception{
        double chance= Math.random();
        if(chance >0.3 && chance <= 6.0){
            switch(dispositivo){
                case "Sintetizador" -> {
                    armadura.getCasco().setFuncionaSintetizador(true);
                    return armadura.getCasco();
                }
                case "Consola" -> {
                    armadura.getCasco().setFuncionaConsola(true);
                    return armadura.getCasco();
                }
                case "BotaIzquierda" -> {
                    armadura.getBota1().setFuncionaPropulsor(true);
                    return armadura.getBota1();
                }
                case "BotaDerecha" -> {
                    armadura.getBota2().setFuncionaPropulsor(true);
                    return armadura.getBota2();
                }
                case "GuanteDerecho" -> {
                    armadura.getGuante2().setFuncionaRepulsor(true);
                    return armadura.getGuante2();
                }
                case "GuanteIzquierdo" -> {
                    armadura.getGuante1().setFuncionaRepulsor(true);
                    return armadura.getGuante1();
                }
                default -> throw new Exception("No se encontro el dispositivo indicado");
            }
        }
        else if(chance <=3.0){
            return null;
        }
        switch(dispositivo){
                case "Sintetizador" -> {
                    return armadura.getCasco();
            }
                case "Consola" -> {
                    return armadura.getCasco();
            }
                case "BotaIzquierda" -> {
                    return armadura.getBota1();
            }
                case "BotaDerecha" -> {
                    return armadura.getBota2();
            }
                case "GuanteDerecho" -> {
                    return armadura.getGuante2();
            }
                case "GuanteIzquierdo" -> {
                    return armadura.getGuante1();
            }
                default -> throw new Exception("No se encontro el dispositivo indicado");
            }
    }
    //RADAR 1.0
    public void marcarObjetoHostil(ObjetoInmovil[] objetos) throws Exception{
        if(objetos.length>10) throw new Exception("No se puede marcar a mas de 10 enemigos, podria sobrecargar el sistema");
        for(int i=0;i<10;i++){
            objetos[i].setEsHostil(true);
        }
        System.out.println("Objetivos marcados");
    }
    public void resistenciaDelObjeto(ObjetoInmovil objeto){
        System.out.println("La resistencia del objeto es de: "+objeto.getResistencia());
    }
    public void distanciaDeLosObjetos(ObjetoInmovil objeto[],Armadura armadura) throws Exception{
        if(objeto.length>10) throw new Exception("No se puede analizar mas de 10 objetos, puede sobrecargar el sistema");
        for(int i=0;i<objeto.length;i++){
            int xArm=armadura.getDistancia().getX(),
            yArm=armadura.getDistancia().getY(),
            zArm=armadura.getDistancia().getZ(),
            xObj=objeto[i].getDistancia().getX(),
            yObj=objeto[i].getDistancia().getY(),
            zObj=objeto[i].getDistancia().getZ();
            double distancia= Math.sqrt(Math.pow((xArm-xObj),2)+Math.pow((yArm-yObj),2)+Math.pow((zArm-zObj),2));
            System.out.println("La distancia entre la armadura y el objeto nro "+i+" es de: "+distancia);
        }
    }
    public double distanciaDelObjeto(ObjetoInmovil objeto,Armadura armadura){
        int xArm=armadura.getDistancia().getX(),
            yArm=armadura.getDistancia().getY(),
            zArm=armadura.getDistancia().getZ(),
            xObj=objeto.getDistancia().getX(),
            yObj=objeto.getDistancia().getY(),
            zObj=objeto.getDistancia().getZ();
            double distancia= Math.sqrt(Math.pow((xArm-xObj),2)+Math.pow((yArm-yObj),2)+Math.pow((zArm-zObj),2));
            return(distancia);
    }
    //Destruyendo enemigos.
    public void DispararObjetivos(ObjetoInmovil objetos[],Armadura armadura) throws Exception{
        if(objetos.length>10) throw new Exception("No se puede analizar y disparar a mas de 10 posibles objetos, podria sobrecargar el sistema");
        for(ObjetoInmovil objeto: objetos){
            if(objeto.esHostil){
                if(distanciaDelObjeto(objeto,armadura)>5000) System.out.println("El enemigo esta lejos no se pudo disparar");
                else{
                    try {
                        if(armadura.getGuante1()!=null && armadura.getGuante2()!= null){
                            disparar(armadura,20);
                            disparar(armadura,20);
                        }
                        else disparar(armadura,10);
                        objeto.setResistencia(objeto.getResistencia()-20);
                        if(objeto.getResistencia()<=0) {
                            objeto=null;
                            System.out.println("Se destruyo al objetivo");
                        }
                        else System.out.println("Se daño al objetivo");
                        
                    } catch (SinEnergiaException ex) {
                        System.out.println("No se pudo disparar...");
                    } catch (IntensividadException ex) {
                          System.out.println(ex);
                    }
                    catch(Exception e){
                        System.out.println("Alguna de las partes de la armadura no funcionan o estan destruidas");
                    }
                }
            }
        }
    }
    //ACCIONES EVASIVAS.
    public void AccionesEvasivas(ObjetoInmovil[] objetos,Armadura armadura) throws SinEnergiaException, IntensividadException, Exception{
        float energiaActual= (armadura.getEnergiaDisponible()*100)/Float.MAX_VALUE;
        if(energiaActual <=10){
            System.out.println("No hay suficiente energia, retirandose");
            volar(armadura,300);
        }
        else{
            System.out.println("Procediendo a disparar a objetivos");
            DispararObjetivos(objetos,armadura);
        }
    }
}
