package Ejerciciopracticaresumenlista;

import javax.swing.JOptionPane;

public class ResumirLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] listaLetras= new String[10];
		for(int i=0;i<listaLetras.length;i++) {
			listaLetras[i]= JOptionPane.showInputDialog("Ingrese una letra");
		}
		ResumirUnaLista(listaLetras);
		
	}
	//Recibe una lista y resume la lista imprimiendola en consola, evitando elementos repetidos.
	public static void ResumirUnaLista(String[] lista) {
		String[] letrasRepetidas= lista;
		int cont=0;
		System.out.println("");
		System.out.print("[");
		for(int i=0;i<lista.length;i++) {
			cont=0;
			for(int z=0;z<letrasRepetidas.length;z++) {
				if(lista[i].equals(letrasRepetidas[z])) cont++;
				
			}
			System.out.print((cont<2? lista[i] : ""));
			System.out.print(cont<2 && i!=lista.length-1? "," : "");
		}
		System.out.println("]");
	}
}
