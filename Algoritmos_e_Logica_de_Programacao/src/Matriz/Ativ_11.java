package Matriz;

import java.util.Random;
import java.util.Scanner;
public class Ativ_11 {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de linhas da matriz");
		int m1 = x.nextInt();
		System.out.println("Insira a quantidade de colunas da matriz");
		int m2 = x.nextInt();
		
		int [] [] matriz =  new int [m1] [m2];
		int soma =0;
		
		for (int i=0; i <matriz.length;i++) {
			for (int j=0; j <matriz[i].length;j++) {
				matriz [i] [j] = new Random().nextInt(10);
				
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i=0; i <matriz.length;i++) {
			for (int j=0; j <matriz[i].length;j++) {
				
				if(matriz[i][j] %2==0 ) { // verifica se o número é par
					soma = soma + matriz[i][j];
				}
			}
		}
		System.out.println("Soma dos elementos da linhas pares = " +soma);
	}

}
