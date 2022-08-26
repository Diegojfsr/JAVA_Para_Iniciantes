package Exercicios;

public class EstruturaCondicionalSwitchCase {

	public static void main(String[] args) {
		
		int diaSemana = 4;
		String nomeDia;
		
		switch(diaSemana) {
		case 1 : nomeDia = "Domingo";break;
		case 2 : nomeDia = "Segunda";break;
		case 3 : nomeDia = "Terça";break;
		case 4 : nomeDia = "Quarta";break;
		case 5 : nomeDia = "Quinta";break;
		case 6 : nomeDia = "Sexta";break;
		case 7 : nomeDia = "Sabado";break;
		default : nomeDia = "Dia Inválido";break;
		}
		System.out.println(nomeDia);
	}

}