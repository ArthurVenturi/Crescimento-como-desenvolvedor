package Arrays;

import java.util.Scanner;

public class Ativ_12 {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);

		String[] a1 = { "Minas Gerais", "São Paulo", "Paraíba", "Paraná", "Piauí" };

		System.out.println("Digite um estado");

		String estado = x.nextLine();

		int i = 0;
		boolean achou = false;

		while (i < a1.length) {

			if (estado.equalsIgnoreCase(a1[i])) { // Se digitar (.equalsIgnoreCase(a1[i])independente do formato ele
													// acha
				achou = true;
			}
			i++;
		}

		if (achou) {
			System.out.println("Achou");
		}

		else {
			System.out.println("não Achou");
		}
		x.close();
	}
}
