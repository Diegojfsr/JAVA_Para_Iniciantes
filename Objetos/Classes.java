package Objetos;

public class Classes {

	public static void main(String[] args) {
		
		//Criar objeto do tipo Pessoa
		//Variavel do tipo: Pessoa
		//Nome da variavel:eu
		Pessoa eu = new Pessoa();
		System.out.println(eu.nome);
		
		//Adicionar novo conteudo ao objeto
		eu.nome = "Marcelle";
		System.out.println(eu.nome);
	}

}
