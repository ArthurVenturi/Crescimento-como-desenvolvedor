package Estrutura_IF;
import java.util.Scanner;
public class dois_numeros_inteiros {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Progrma para indicar qual o número é maior entre dois números:");
		System.out.println("Insira o primeiro número:");
		float primeiro = x.nextFloat();
		
		Scanner y = new Scanner(System.in);
		System.out.println("Insira o segundo número:");
		float segundo = y.nextFloat();
		
		if (primeiro > segundo) {
			System.out.println("Primeiro é maior que o segundo");		
		}
		
		else {
			System.out.println("segundo é o maior valor que o primeiro");
		}
		x.close();
		y.close();
	}
		
}
