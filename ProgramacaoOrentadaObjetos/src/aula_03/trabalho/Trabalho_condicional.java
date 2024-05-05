package aula_03.trabalho;

import java.util.Scanner;
public class Trabalho_condicional {

	public static void main(String[] args) {
		
		Scanner aulas = new Scanner(System.in);
		System.out.println("Insira a quantidade de aulas ministradas");
		int inttotal_de_aulas = aulas.nextInt();
		
		Scanner faltas = new Scanner(System.in);
		System.out.println("Insira a quantidade de faltas feitas");
		int intquantidade_faltas = faltas.nextInt();
		
		int intlimite_faltas = ((inttotal_de_aulas * 75 )/100);
		int inttotal_aulas_feitas = (inttotal_de_aulas - intquantidade_faltas);
		
		if(intlimite_faltas <= inttotal_aulas_feitas) {
			System.out.println("Você está aprovado");
		}
		else {
			System.out.println("Você está reprovado");
		}
		System.out.println();//Espaço entre as linhas de texto
		
		Scanner resposta = new Scanner(System.in);
		System.out.println("Deseja realizar a matricula para o próximo semestre ?");
		System.out.println("Se sim degite S");
		System.out.println("Se não degite N");
		char resposta_usuario = resposta.next().charAt(0);
		
		if(resposta_usuario == 'S') {
			System.out.println("A matricula deverá ser realizada até o dia 10");
		}
		else if(resposta_usuario == 'N') {
			System.out.println("Sua matricula será trancada");
		}
		
		else {
			
		}
		resposta.close();
		aulas.close();
		faltas.close();
		
	}

}
