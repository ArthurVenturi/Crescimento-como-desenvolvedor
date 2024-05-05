package Arrays;

import java.util.Scanner;

public class Ativ_13 {

	public static void main(String[] args) {

		System.out.println("INSIRA UM NÚMERO");
		Scanner x = new Scanner(System.in);

		int[] v1 = { 2, 2, 4, 5, 5, 6, 6, 6, 8, 9 };

		int numero = x.nextInt();

		for (int i = 0; i < v1.length; i++) {

			if (numero == (v1[i])) {
				System.out.println("Posição:" + i);

			}
		}
		x.close();
	}

}
