package Arrays;

import java.util.Scanner;

public class Ativ_11 {

	public static void main(String[] args) {
		
		System.out.println("Qual será a quantidade de números do arrey");
		Scanner x = new Scanner (System.in);
		int numero = x.nextInt();
		
		int[] v1 = new int [numero];
		int soma = 0;
		int vezes = 0;
		
		for(int i=0; i <v1.length; i++) {
			vezes = x.nextInt();
			v1[i] = vezes;
		}
		 for (int i = 0; i < v1.length; i++) { 
        
			 soma = soma + vezes;
		 }
		 System.out.println("Soma dos produtos" + soma);
		 x.close();
	}

}
