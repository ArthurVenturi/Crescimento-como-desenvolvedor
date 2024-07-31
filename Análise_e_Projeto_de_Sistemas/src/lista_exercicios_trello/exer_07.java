package lista_exercicios_trello;

import java.util.Scanner;

public class exer_07 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);
		System.out.println("Digite o valor da base do retângulo");
		double base = dados.nextDouble();
		System.out.println("Digite o valor da altura do retângulo");
		double altura = dados.nextDouble();

		double resultado = ((base + altura) * 2);
		double area = base * altura;
		double diagonal = (base * base) + (altura * altura);

		System.out.println("Perimetro do retâgulo :" + resultado);
		System.out.println("A área do retâgulo :" + area);
		System.out.println("A diagonal do retâgulo :" + diagonal);

		dados.close();
	}

}
