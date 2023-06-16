/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPracticaIntegrador;

/**
 *
 * @author mi tamura
 */
/*
En este trabajo se deberá crear en el proyecto una clase llamada Armadura que modele toda la
información y las acciones que pueden efectuarse con la Armadura de Iron Man. La armadura de
Iron Man es un exoesqueleto mecánico ficticio usado por Tony Stark cuando asume la identidad
de Iron Man. La primera armadura fue creada por Stark y Ho Yinsen, mientras estuvieron
prisioneros.
Las armaduras de Stark se encuentran definidas por un color primario y un color secundario. Se
encuentran compuestas de dos propulsored, uno en cada bota; y dos repulsores, uno en cada
guante (los repulsores se utilizan también como armas). Tony los utiliza en su conjunto para volar.

La armadura tiene un nivel de resistencia, que depende del material con el que está fabricada, y
se mide con un número entero cuya unidad de medida de dureza es Rockwell
(https://es.wikipedia.org/wiki/Dureza_Rockwell). Todas las armaduras poseen un nivel de salud el
cual se mide de 0 a 100. Además, Tony tiene un generador, el cual le sirve para salvarle la vida en
cada instante de tiempo alejando las metrallas de metal de su corazón y también para alimentar
de energía a la armadura. La batería a pesar de estar en el pecho de Tony, es considerada como
parte de la armadura.
*/
public class Armadura {
    String colorPrimario,colorSecundario;
    int resistencia; //Medida en rockwell
    int salud; // limite: 0-100
    String material; //Lo haria un enum pero no tengo
    boolean estaFuncionandoElGenerador;
    float energiaDisponible; //MAXIMO: Float max, y todo calculado en volteos.
    Bota bota1;
    Bota bota2;
    Guante guante1;
    Guante guante2;
    Casco casco;
    Distancia distancia = new Distancia(0,0,0);

    public Distancia getDistancia() {
        return distancia;
    }

    public void setDistancia(Distancia distancia) {
        this.distancia = distancia;
    }
    public Armadura(String colorPrimario, String colorSecundario, int resistencia, int salud, String material, boolean estaFuncionandoElGenerador, float energiaDisponible, Bota bota1, Bota bota2, Guante guante1, Guante guante2, Casco casco) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.resistencia = resistencia;
        this.salud = salud;
        this.material = material;
        this.estaFuncionandoElGenerador = estaFuncionandoElGenerador;
        this.energiaDisponible = energiaDisponible;
        this.bota1 = bota1;
        this.bota2 = bota2;
        this.guante1 = guante1;
        this.guante2 = guante2;
        this.casco = casco;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isEstaFuncionandoElGenerador() {
        return estaFuncionandoElGenerador;
    }

    public void setEstaFuncionandoElGenerador(boolean estaFuncionandoElGenerador) {
        this.estaFuncionandoElGenerador = estaFuncionandoElGenerador;
    }

    public float getEnergiaDisponible() {
        return energiaDisponible;
    }

    public void setEnergiaDisponible(float energiaDisponible) {
        this.energiaDisponible = energiaDisponible;
    }

    public Bota getBota1() {
        return bota1;
    }

    public void setBota1(Bota bota1) {
        this.bota1 = bota1;
    }

    public Bota getBota2() {
        return bota2;
    }

    public void setBota2(Bota bota2) {
        this.bota2 = bota2;
    }

    public Guante getGuante1() {
        return guante1;
    }

    public void setGuante1(Guante guante1) {
        this.guante1 = guante1;
    }

    public Guante getGuante2() {
        return guante2;
    }

    public void setGuante2(Guante guante2) {
        this.guante2 = guante2;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }
    
}
