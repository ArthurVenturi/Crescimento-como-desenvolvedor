package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Ativ_3 {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Inisira a quantidade de linhas da matriz");
		int m1 = x.nextInt();
		System.out.println("Inisira a quantidade de colunas da matriz");
		int m2 = x.nextInt();
		
		int [] [] matriz = new int [m1] [m2];
	
		int x2 = 0;
		for (int i =0; i <matriz.length;i++) {
			
			for (int j =0; j <matriz[i].length;j++) {
			
				matriz[i][j] = new Random().nextInt(10);
				
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
			for (int i =0; i <matriz.length;i++) {
				
				
				for (int j =0; j <matriz[i].length;j++) {
					
					
					x2 = matriz[i][j];
					
					
			}
				
				System.out.println("Soma dos dois valores" + (x2 + x2));
				
		}	
	}

}
