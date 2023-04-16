/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author mi tamura
 */
public class Curso {
    String nombreCurso;
    int cantidadHorasPorDia;
    int cantidadDiasPorSemana;
    String turno;
    int precioPorHora;
    String alumnos[]= new String[5];
    public Curso(){
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos= alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    public void cargarAlumnos(){
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Ingrese el nombre del alumno "+(i+1)+": ");
            alumnos[i]= sc.nextLine();
        }
    }
    public void crearCurso(){
        Scanner sc= new Scanner(System.in);
        String turnocrear="";
        System.out.println("Ingrese el nombre del curso: ");
        nombreCurso= sc.nextLine();
        System.out.println("Ingrese la cantidad de horas por dia del curso: ");
        cantidadHorasPorDia= sc.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana del curso: ");
        cantidadDiasPorSemana= sc.nextInt();
        System.out.println("Ingrese el turno de la clase (mañana/tarde): ");
        turnocrear= sc.next();
        while(!turnocrear.equals("mañana")^!turnocrear.equals("tarde")){
            System.out.println("Ingrese mañana o tarde: ");
            turnocrear= sc.next();
        }
        turno=turnocrear;
        System.out.println("Ingrese el precio por hora del curso: ");
        precioPorHora= sc.nextInt();
        System.out.println("Ingrese los 5 alumnos del curso: ");
        cargarAlumnos();
    }
    public void calcularGananciaSemanal(){
        System.out.println("La ganancia semanal es de: "
        +(((precioPorHora*cantidadHorasPorDia)*cantidadDiasPorSemana)*5));
    }
}
