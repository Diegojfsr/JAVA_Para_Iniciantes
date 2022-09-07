package Exercicios;

public class Matriz {

	public static void main(String[] args) {
		//Forma1
		/*
		String[][] nomes = new String[3][4];
		nomes[0][0] = "Camille";
		System.out.println(nomes[0][0]);	
		*/
		//Forma2
		String[][] nomes = {{"Camille", "Marcelle", "Michelle"}, {"Camille2", "Marcelle2", "Michelle2"}};
		System.out.println(nomes[1][2]);
	}

}