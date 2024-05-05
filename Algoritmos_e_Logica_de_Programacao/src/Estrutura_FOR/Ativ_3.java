package Estrutura_FOR;

import java.util.Scanner;

public class Ativ_3 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite um número de vezes");
		int n = x.nextInt();
		int maior = 0;
		int menor = 0;

		for (int i = 1; i <= n; i++) {

			System.out.println("Insira o número:");
			int numero = x.nextInt();

			if (numero > maior) {

				maior = numero;
			}

			else if (numero < menor) {

				menor = numero;
			}

			System.out.println(maior);
			System.out.println(menor);

		}
		x.close();
	}

}
