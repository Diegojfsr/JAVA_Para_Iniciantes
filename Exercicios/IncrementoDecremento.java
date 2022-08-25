package Exercicios;

public class IncrementoDecremento {

	public static void main(String[] args) {
		//Incremento
		int numero = 1;
		numero++; //soma numero + 1
		System.out.println(numero);
		//---------------------------
		
		//outra forma
		System.out.println(numero++);//acrecenta mais 1 a variavel numero e xibe na proxima linha.
		System.out.println(numero);
		//-------------------------------
		
		//outra forma (atribuicao)
		System.out.println(++numero);//acrescenta mais 1 a variavel e exibe na mesma linha.
		
		//*************************************************************
		//Decremento
		int numeroSub = 1;
		numeroSub--; //subtrai numero - 1
		System.out.println(numeroSub);
		//---------------------------
		
		//outra forma
		System.out.println(numeroSub--);//subtrai menos 1 da variavel numero e xibe na proxima linha.
		System.out.println(numeroSub);
		//-------------------------------
		
		//outra forma (atribuicao)
		System.out.println(--numeroSub);//subtrai menos 1 da variavel e exibe na mesma linha.
		
		
		
	}

}