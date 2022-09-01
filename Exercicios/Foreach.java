package Exercicios;

public class Foreach {

	public static void main(String[] args) {
		//Array de strings
		/*String[] nomes = {"Camille", "Marcelle", "Michelle"};
		for (String nome : nomes) {
			System.out.println(nome);
		}*/
		
		//Array de inteiros
		int[] numero = {1,5,20};
		int soma=0;
		for(int n:numero) {
			soma +=n; //soma cada posição de n.
		}
		System.out.println(soma);
	}

}