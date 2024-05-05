package Estrutura_while;

import java.util.Scanner;

public class Ativ_5 {

	public static void main(String[] args) {

		System.out.println("1, 2 , 3 , 4 são os respectivos candidatos");
		System.out.println("5 = voto nulo");
		System.out.println("6 = voto em branco");

		Scanner x = new Scanner(System.in);
		System.out.println("Faça seu voto");

		int can1 = 0;
		int can2 = 0;
		int can3 = 0;
		int can4 = 0;
		int votonulo = 0;
		int totalcan = 0;
		int votobranco = 0;

		while (true) {

			int opcao = x.nextInt();

			if (opcao == 1) {
				can1++;
			} else if (opcao == 2) {
				can2++;
			} else if (opcao == 3) {
				can3++;
			} else if (opcao == 4) {
				can4++;
			} else if (opcao == 5) {
				votonulo++;
			} else if (opcao == 6) {
				votobranco++;
			}

			else {
				break;
			}

			totalcan = totalcan + can1 + can2 + can3 + can4;
		}
		System.out.println("Total de votos do candidato 1    " + can1);

		System.out.println("Total de votos doscandidato 2    " + can2);

		System.out.println("Total de votos do candidato 3    " + can3);

		System.out.println("Total de votos do candidato 4    " + can4);

		System.out.println("Total de votos dos candidatos    " + totalcan);

		System.out.println("Total de votos nulos     " + votonulo);

		System.out.println("Total de votos em branco    " + votobranco);
		x.close();
	}
}
