package Estrutura_while;

import java.util.Scanner;

public class Ativ_4 {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		System.out.println("Insira um número inteiro de vezes");
		int quantidade = x.nextInt();
		int i = 1;
		int numero = 0;
		while (i <= quantidade) {

			numero = x.nextInt();
			System.out.println("Insira o número inteiro");

			if (numero > 0) {
				System.out.println("Os números primos são");
			} else {
				System.out.println("Os números não primos são");
			}

			i++;

		}
		x.close();
	}
}
