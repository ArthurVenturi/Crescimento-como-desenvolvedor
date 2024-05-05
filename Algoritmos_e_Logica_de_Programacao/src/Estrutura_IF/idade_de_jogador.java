package Estrutura_IF;

import java.util.Scanner;

public class idade_de_jogador {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Insira a idade de um jogador:");
		int idade = x.nextInt();

		if (idade >= 5 && idade < 10) {
			System.out.println("infantil");
		} else if (idade >= 11 && idade < 15) {
			System.out.println("Juvenil");
		} else if (idade >= 16 && idade < 20) {
			System.out.println("Júnior");
		}

		else if (idade >= 21 && idade < 33) {
			System.out.println("Profissional");
		}

		else if (idade > 34) {
			System.out.println("Melhor procurar outra profisão!");
		}
		x.close();
	}
}
