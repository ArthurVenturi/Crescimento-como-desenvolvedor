package Matriz;
import java.util.Random;
import java.util.Scanner;

public class Ativ_10 {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Inisira a quantidade de linhas da matriz");
		int m1 = x.nextInt();
		System.out.println("Inisira a quantidade de colunas da matriz");
		int m2 = x.nextInt();
		
		
		int [] [] matriz = new int [m1] [m2]; 
		
		int quantidade =0;
		for (int i =0; i < matriz.length;i++) {
			
			for (int j=0;j <matriz[i].length;j++) {
			 matriz [i][j]  = new Random().nextInt(10);
			 
			 System.out.print(matriz[i][j] + " ");
				
			}
			 System.out.println();
		}

		for (int i=0; i<matriz.length;i++) {
			for(int j=0; j < matriz[i].length;j++) {
				
				if (matriz [i][j] > 5) {
					quantidade ++;
				 }
			}
		}
		System.out.println("A quantidade de números maior que 5 são:  "+ quantidade);
	}

}
