package lista_exercicios_trello;

import java.util.Scanner;

public class exer_06 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		System.out.println("Digite um número inteiro ");
		int intnumero1 = dados.nextInt();
		
		System.out.println("Digite outro número inteiro ");
		int intnumero2 = dados.nextInt();
		
		double doubledivsao = intnumero1 / intnumero2;
		double doubleresto = intnumero1 % intnumero2;

		System.out.println("O resultado da divisão : " +doubledivsao);
		System.out.println("O resto da divisão :" + doubleresto);
		
		dados.close();
	}

}
