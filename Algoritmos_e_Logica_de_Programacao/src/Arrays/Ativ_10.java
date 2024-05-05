package Arrays;

import java.util.Scanner;

public class Ativ_10 {

	public static void main(String[] args) {

		System.out.println("Qual será a quantidade de números do arrey");
		Scanner x = new Scanner(System.in);
		int numero = x.nextInt();

		int[] v1 = new int[numero];

		for (int i = 0; i < v1.length; i++) {
			numero = x.nextInt();
			v1[i] = numero;
		}
		for (int i = 0; i < v1.length; i++) {

			System.out.println(v1[i]);

		}
		x.close();
	}
}
