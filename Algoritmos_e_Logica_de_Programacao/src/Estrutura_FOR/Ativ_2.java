package Estrutura_FOR;
import java.util.Scanner;
public class Ativ_2 {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		System.out.println("Digite um número");
		int n = x.nextInt();
		int multiplicacao = 1;
		
		for (int i=1; i <=n; i++) {
			
			System.out.println("insira o numero: ");
			int numero = x.nextInt();
			multiplicacao = multiplicacao * numero;
		}
		
		System.out.println(multiplicacao);
		x.close();
	}
}
