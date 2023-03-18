/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios4;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Ejercicio3VectorDeDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son 
        de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        Scanner sc= new Scanner(System.in);
        int contDig1,contDig2,contDig3,contDig4,contDig5,cont;
        cont=0;contDig1=0;contDig2=0;contDig3=0;contDig4=0;contDig5=0;
        System.out.println("Ingrese el espacio maximo del vector");
        int cantMax= sc.nextInt();
        int numeros[]= new int[cantMax];
        for(int i=0;i<numeros.length;i++){
            System.out.println("Ingrese un numero");
            numeros[i]+= sc.nextInt();
        }
        for(int i=0;i<numeros.length;i++){
            cont= ContarDigitosNumero(numeros[i]);
            if(cont==1) contDig1++;
            if(cont==2) contDig2++;
            if(cont==3) contDig3++;
            if(cont==4) contDig4++;
            if(cont==5) contDig5++;
            
        }
        System.out.println("La cantidad de digitos de 1 es: "+contDig1+"\n"
        +"La cantidad de digitos de 2 es: "+contDig2+"\n"
        +"La cantidad de digitos de 3 es: "+contDig3+"\n"
        +"La cantidad de digitos de 4 es: "+contDig4+"\n"
        +"La cantidad de digitos de 5 es: "+contDig5
        );
    }
    private static int ContarDigitosNumero(int num){
        int cont=0;
        if(num>0 && num<10) cont=1;
        else {
            while(num!=0){
                num=(int)Math.floor(num/10);
                cont++;
            }
        }
        return cont;
    }
}
