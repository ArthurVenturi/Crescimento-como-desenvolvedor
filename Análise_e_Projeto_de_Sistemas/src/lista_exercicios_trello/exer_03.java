package lista_exercicios_trello;

import java.util.Scanner;

public class exer_03 {

	public static void main(String[] args) {
		
		int numero = 0, sucessor = 0, antecessor = 0;
		
		Scanner impremir = new Scanner(System.in);
		System.out.println("Digite um número inteiro :");
		numero = impremir.nextInt();

		sucessor = numero + 1;
		antecessor = numero - 1;
		
		System.out.println("O número sucessor :" + sucessor);
		System.out.println("O número antecessor :" + antecessor);
		
		impremir.close();
	}

}
