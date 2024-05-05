package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Aula_matriz {

	public static void main(String[] args) {

		int[][] m1 = new int[3][5]; // [3] linha [5] coluna

		System.out.println(m1.length); // printa as linhas
		
		System.out.println("-----------------");

		/* System.out.println(m1[i].length); Printas as colunas */

		for (int i = 0; i < m1.length; i++) { // percorre linhas

			for (int j = 0; j < m1[i].length; j++) { // percorre colunas

				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("-----------------------------");

		for (int i = 0; i < m1.length; i++) { // percorre linhas

			for (int j = 0; j < m1[i].length; j++) { // percorre colunas

				m1[i][j] = new Random().nextInt(10);
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("-----------------------------");// matriz feito pelo usúario

		for (int i = 0; i < m1.length; i++) { // percorre linhas

			for (int j = 0; j < m1[i].length; j++) { // percorre colunas

				System.out.println("Insira os números na matriz");
				Scanner x = new Scanner(System.in);

				int ler = x.nextInt();
				int n = ler;
				m1[i][j] = n;

			}

			System.out.println();
		}
		
		for (int i = 0; i < m1.length; i++) { // percorre linhas

			for (int j = 0; j < m1[i].length; j++) { // percorre colunas

				System.out.print(m1[i][j] +" ");
			}
			System.out.println();
		}


	}

}
