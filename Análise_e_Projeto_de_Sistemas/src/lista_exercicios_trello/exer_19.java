package lista_exercicios_trello;

import java.util.Scanner;

public class exer_19 {

	public static void main(String[] args) {

		int i = 0, j = 0, intquantidade = 0;
		double dbnumero = 0;

		Scanner numeros = new Scanner(System.in);
		System.out.println("Digite vários número");

		while (i == j) {
			dbnumero = numeros.nextDouble();

			if (dbnumero >= 100 && dbnumero <= 200) {
				intquantidade++;
			} 
			else if (dbnumero == 0) {
				break;
			}
			System.out.println("Para parar a execução digite o número 0");
			i++;
		}
		System.out.println("A quantidade de números que foram digitados entre 100 e 200 foram: " + intquantidade);

		numeros.close();
	}

}
