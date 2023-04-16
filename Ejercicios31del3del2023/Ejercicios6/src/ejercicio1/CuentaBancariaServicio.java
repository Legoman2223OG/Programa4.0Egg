/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class CuentaBancariaServicio {
    public CuentaBancaria crearCuentaBancaria(){
        CuentaBancaria nuevaCuentaBanc= new CuentaBancaria();
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el numero de cuenta: ");
        nuevaCuentaBanc.setNumeroCuenta(sc.nextInt());
        System.out.println("Introduce el dni");
        nuevaCuentaBanc.setDniCliente(sc.nextLong());
        System.out.println("Introduce el sueldo actual de la cuenta");
        nuevaCuentaBanc.setSaldoActual(sc.nextDouble());
        return nuevaCuentaBanc;
    }
    public void ingresar(CuentaBancaria cuentaBanc,double ingreso){
        cuentaBanc.setSaldoActual(cuentaBanc.getSaldoActual()+ingreso);
        System.out.println("Se agrego "+ingreso+"$ a la cuenta "+cuentaBanc.getNumeroCuenta());
    }
    public void retirar(CuentaBancaria cuentaBanc, double retirar){
        if((cuentaBanc.getSaldoActual()-retirar)<0)
            System.out.println("No es posible retirar el sueldo de la cuenta "+cuentaBanc.getNumeroCuenta());
        else {
            cuentaBanc.setSaldoActual(cuentaBanc.getSaldoActual()-retirar);
            System.out.println("Se retiro "+retirar+"$ de la cuenta "+cuentaBanc.getNumeroCuenta());
        }
    }
    public void extraccionRapida(CuentaBancaria cuentaBanc){
        if((cuentaBanc.getSaldoActual()-cuentaBanc.getSaldoActual()*0.2)<0)
            System.out.println("No es posible retirar rapidamente el sueldo de la cuenta "+cuentaBanc.getNumeroCuenta());
        else {
            System.out.println("Se extrajo "+cuentaBanc.getSaldoActual()*0.2+"$ de la cuenta "+cuentaBanc.getNumeroCuenta());
            cuentaBanc.setSaldoActual(cuentaBanc.getSaldoActual()-cuentaBanc.getSaldoActual()*0.2);     
        }
    }
    public void consultarSaldo(CuentaBancaria cuentaBanc){
        System.out.println("El saldo de la cuenta "+cuentaBanc.getNumeroCuenta()+" es de: "+cuentaBanc.getSaldoActual());
    }
    public void consultarDatos(CuentaBancaria cuentaBanc){
        System.out.println("Numero Cuenta: "+cuentaBanc.getNumeroCuenta()+
                "\nDNI: "+cuentaBanc.getDniCliente()+
                "\nSaldo Actual: "+cuentaBanc.getSaldoActual());
    }
}
