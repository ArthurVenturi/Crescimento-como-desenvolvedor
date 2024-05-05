package Estrutura_IF;
import java.util.Scanner;
public class prog_numero_real {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Insira um número:");
		double numero = x.nextDouble();
		
		double raiz = Math.sqrt(numero);
		double quadrado = numero * numero;
		if (numero > 0) {
			System.out.println("O número for positivo, sua raiz quadrada:" + raiz); 
		}
		else {
			System.out.println("O número for negativo, seu número ao quadra:" + quadrado);
		}
		x.close();
	}

}
