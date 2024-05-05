package Estrutura_while;

import java.util.Scanner;

public class Ativ_3 {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		System.out.println("Insira um número inteiro de quantidade de vezes");
		int quantidade = x.nextInt();
		int i = 1;
		int menor = 0;
		int maior = 0;
		int numero = 0;

		while (i <= quantidade) {
			System.out.println("Insira um número inteiro");
			numero = x.nextInt();

			if (maior > menor) {
				maior = numero;
			}

			else if (numero < menor) {
				menor = numero;
			}
			i++;
			System.out.println("O número maior é" + maior);
			System.out.println("O número menor é" + menor);

		}
		x.close();
	}

}
