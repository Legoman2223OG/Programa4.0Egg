/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extra;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author mi tamura
 */
public class Simulador {
    Alumno[] facilitadores= new Alumno[5];
    Alumno[] facilitadoresSup= new Alumno[5];
    ArrayList<Voto> votos= new ArrayList();
    ArrayList<String> nombres=new ArrayList();
    ArrayList<String> apellidos= new ArrayList();
    public Simulador(String[] nombres,String[] apellidos){
        for(String nombre: nombres){
            this.nombres.add(nombre);
        }
        for(String apellido: apellidos){
            this.apellidos.add(apellido);
        }
    }
    public ArrayList<Alumno> generarListaDeAlumnos(){
        //Genera una lista de alumnos aleatorios
        ArrayList<Alumno> listaAlumnosAleatoria= new ArrayList();
        for(int i=0;i<15;i++){
            String nombreCompleto= (nombres.get((int)(Math.random()*nombres.size())))+" "+(apellidos.get((int)(Math.random()*apellidos.size())));
            String dniAleatorio= generarDniAleatorio();
            if(!verificarSiYaExisteDni(listaAlumnosAleatoria,dniAleatorio)){
                listaAlumnosAleatoria.add(new Alumno(nombreCompleto,dniAleatorio,0));
            }
        }
        AsignarVotos(listaAlumnosAleatoria);
        return listaAlumnosAleatoria;
        
    }
    private String generarDniAleatorio(){
        String dniGenerado="";
        for(int i=0;i<8;i++){
            dniGenerado+= (int) (Math.random()*9);
        }
        return dniGenerado;
    }
    private boolean verificarSiYaExisteDni(ArrayList<Alumno> alumnos,String dni){
        boolean yaExisteDni=false;
        for(Alumno alumno: alumnos){
            if(alumno.getDni().equals(dni)) yaExisteDni=true;
        }
        return yaExisteDni;
    }
    public void ImprimirListaAlumnos(ArrayList<Alumno> alumnos){
        alumnos.forEach((Alumno alumno)-> System.out.println(alumno));
    }
    private void AsignarVotos(ArrayList<Alumno> alumnos){
        for(Alumno al: alumnos){
            votos.add(new Voto(al));
        }
    }
    public void GenerarVotosAleatorios(ArrayList<Alumno> alumnos){
    
        for(Voto vot: votos){
            HashSet<Alumno> nuevosVotos= new HashSet();
            nuevosVotos.add(alumnos.get((int)(Math.random()*alumnos.size())));
            nuevosVotos.add(alumnos.get((int)(Math.random()*alumnos.size())));
            nuevosVotos.add(alumnos.get((int)(Math.random()*alumnos.size())));
            vot.setVotadosPorAlumno(nuevosVotos);
        }
        for(Alumno alu:alumnos){
            for(Voto vot:votos){
                HashSet<Alumno> listaVotados= vot.getVotadosPorAlumno();
                for(Alumno al:listaVotados){
                    if(al.getDni().equals(alu.getDni())) alu.setCantVotos(alu.getCantVotos()+1);
                }
            }
        }
    }
    public void MostrarAlumnoConSusVotosYVotados(ArrayList<Alumno> alumnos){
        for(Alumno al: alumnos){
            System.out.println("Alumno: "+al.getNombreCompleto()+"\nVotos Recibidos: "+al.getCantVotos()+
                    "\nVotados por el alumno: ");
            Voto votoDelAlumno= conseguirVotoDeAlumno(al);
            for(Alumno alu: votoDelAlumno.getVotadosPorAlumno()){
                System.out.println(alu.getNombreCompleto());
            }
        }
    }
    private Voto conseguirVotoDeAlumno(Alumno alumno){
        for(Voto vot: votos){
            if(vot.getVotador().equals(alumno)) return vot;
        }
        return null;
    }
    public void RecuentoVotos(ArrayList<Alumno> alumnos){
        Alumno alumnoMasVotado= null;
        int votoMasAlto= 0;
        for(Alumno al: alumnos){
            if(al.getCantVotos()>votoMasAlto){
                votoMasAlto=al.getCantVotos();
                alumnoMasVotado= al;
            }
        }
        System.out.println("El alumno mas votado fue:\n "+alumnoMasVotado);
    }
    private int cantidadTotalVotos(ArrayList<Alumno> alumnos){
        int contador=0;
        for(Alumno alu: alumnos){
            contador+= alu.getCantVotos();
        }
        return contador;
    }
    private double promedioVotos(ArrayList<Alumno> alumnos){
        return cantidadTotalVotos(alumnos)/alumnos.size();
    }
    public void AsignarInstructores(ArrayList<Alumno> alumnos){
        int contInstSup=0;
        int contInst=0;
        HashSet<Alumno> instSup= new HashSet();
        HashSet<Alumno> inst= new HashSet();
        for(Alumno al:alumnos){
                if(al.getCantVotos()>=promedioVotos(alumnos)) instSup.add(al);
                else inst.add(al);
        }
        for(Alumno instrucSup: instSup){
            facilitadoresSup[contInstSup]= instrucSup;
            contInstSup++;
            if(contInstSup>=5)break;
        }
        for(Alumno instructor: inst){
            facilitadores[contInst]= instructor;
            contInst++;
            if(contInst>=5)break;
        }
    }
    public void MostrarInstructores(){
        System.out.println("Facilitadores: ");
        for(Alumno instructor: facilitadores){
            System.out.println(instructor);
        }
        System.out.println("Facilitadores Suplentes: ");
        for(Alumno instructorSup: facilitadoresSup){
            System.out.println(instructorSup);
        }
    }
}
