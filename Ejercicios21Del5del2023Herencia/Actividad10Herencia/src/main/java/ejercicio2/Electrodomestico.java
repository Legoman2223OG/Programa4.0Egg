/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author mi tamura
 */
public class Electrodomestico {
    double precio;
    String color; //blanco, negro, rojo, azul y gris. No importa el case.

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    char consumoElectrico; //LETRAS ENTRE A Y F.
    double peso; //Kg???

    public Electrodomestico(double precio, String color, char consumoElectrico, double peso) {
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoElectrico);
        this.peso = peso;
    }

    public Electrodomestico() {
    }
    private void comprobarConsumoEnergetico(char letra){
        if(letra!='A'^letra!='B'^letra!='C'^letra!='D'^letra!='E') consumoElectrico= 'F';
        else consumoElectrico= letra;
    }
    private void comprobarColor(String color){
        
        if(!color.equalsIgnoreCase("Blanco")^!color.equalsIgnoreCase("Negro")^
           !color.equalsIgnoreCase("Rojo")^!color.equalsIgnoreCase("Azul")^
           !color.equalsIgnoreCase("Gris")) this.color="Blanco";
        else this.color=color;
    }
    
}
