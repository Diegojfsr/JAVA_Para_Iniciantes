package MetodoRetorno;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa eu = new Pessoa();
		//acessar o metodo
		// Pegar o retorno
		//Forma1-Imprimir direto
		//System.out.println(eu.apresentar());
		
		//Modificando o nome
		eu.nome = "Michelle";
		
		//Forma2 Jogar o retorno dentro de uma variavel do mesmo tipo
		String apresentacao = eu.apresentar();
		System.out.println(apresentacao);
	

	}

}
