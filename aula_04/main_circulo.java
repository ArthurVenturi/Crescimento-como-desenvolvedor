package aula_04;

import java.util.Scanner;

public class main_circulo {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Circulo circulo1 = new Circulo();
		System.out.println("Insira o valor do X");
		circulo1.x = ler.nextInt();

		System.out.println("Insira o valor do Y");
		circulo1.y = ler.nextInt();

		System.out.println("Insira o valor do raio");
		circulo1.raio = ler.nextDouble();

		System.out.println("Insira a cor do circulo 1");
		circulo1.cor = ler.next();

		Circulo circulo2 = new Circulo();
		System.out.println("Insira o valor do X");
		circulo2.x = ler.nextInt();

		System.out.println("Insira o valor do Y");
		circulo2.y = ler.nextInt();

		System.out.println("Insira o valor do raio");
		circulo2.raio = ler.nextDouble();

		System.out.println("Insira a cor do circulo 2");
		circulo2.cor = ler.next();

		System.out.println("Primeiro Circulo");
		System.out.println("X: " + circulo1.x);
		System.out.println("Y: " + circulo1.y);
		System.out.println("Raio: " + circulo1.raio);
		System.out.println("Cor: " + circulo1.cor + "\n");

		System.out.println("Segundo Circulo");
		System.out.println("X: " + circulo2.x);
		System.out.println("Y: " + circulo2.y);
		System.out.println("Raio: " + circulo2.raio);
		System.out.println("Cor: " + circulo2.cor);

		System.out.println("A área do circulo : " + circulo1.Cauculararea() + "\n" + "A área do circulo : "
				+ circulo1.Cauculararea());
		System.out.println();

		System.out.println("Insira a nova posição do x do circulo 1");
		int novo_x = ler.nextInt();

		System.out.println("Insira a nova posição do y circulo 1");
		int novo_y = ler.nextInt();

		circulo1.moveCirculo(novo_x, novo_y);

		System.out.println("Insira a nova posição do x do circulo 2");
		novo_x = ler.nextInt();

		System.out.println("Insira a nova posição do y circulo 2");
		novo_y = ler.nextInt();

		circulo2.moveCirculo(novo_x, novo_y);

		System.out.println("A nova posição do circulo x : " + circulo1.x + "\n" + " y : " + circulo1.y);
		System.out.println("A nova posição do circulo x : " + circulo1.x + "\n" + " y : " + circulo1.y);
		
		ler.close();
	}

}
