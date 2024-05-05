package Estrutura_IF;

import java.util.Scanner;

public class programa_par_impar {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Insira um número");
		double numero = x.nextDouble();

		double resto = numero % 2;

		if (resto == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		}
		x.close();
	}

}
