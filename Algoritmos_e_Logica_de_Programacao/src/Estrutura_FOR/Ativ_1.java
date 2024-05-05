package Estrutura_FOR;

import java.util.Scanner;

public class Ativ_1 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Insira um número inteiro");

		int a = n.nextInt();
		int soma = 0;
		for (int i = 1; i <= a; i++) {

			System.out.println(i);
			soma = soma + i;
		}

		System.out.println(soma);
		n.close();
	}
}
