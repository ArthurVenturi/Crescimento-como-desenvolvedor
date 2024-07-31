package lista_exercicios_trello;

import java.util.Scanner;

public class exer_09 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		System.out.println("Digite o valor do raio do cilindro");
		double raio = dados.nextDouble();
		System.out.println("Digite o valor da altura do cilindro");
		double altura = dados.nextDouble();
		
		double volume = (3.14159 * (raio * raio)) * altura;
		System.out.println("O volume do cilindro :"+volume);
		
		dados.close();
	}

}
