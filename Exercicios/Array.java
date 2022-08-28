package Exercicios;

public class Array {

	public static void main(String[] args) {
		//iniciando um array 1
		//String[]nomes = new String[3];
		//nomes[0] = "Camille";
		//nomes[1] = "Marcelle";
		//nomes[2] = "Michelle";
		
		//System.out.println(nomes[5]);
		
		//iniciando um array 2
		
		String[] nomes = {"Camille", "Marcelle", "Michelle"};
		System.out.println(nomes[1]);
		
		//Sobrepor posição anterior
		
		nomes[2] = "Alessandra";
		System.out.println(nomes[2]);
	}

}