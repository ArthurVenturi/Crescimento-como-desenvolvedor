package Estrutura_IF;
import java.util.Scanner;
public class empresa {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Programa de aumento de funcionários:");
		System.out.println("Insira o salário do funcionário:");
		
		double valor = x.nextDouble();
		double aumento = ((valor * 30) / 100);
		double salario =  valor + aumento;
		
		if (valor < 500.00) {
			System.out.println("O salário com base ao aumento de 30%:" + aumento);
			System.out.println("Salario com o aumento" + salario);
			
		}
		else {
			System.out.println("O funcionário não tem o direito de aumento");
		}
		x.close();
	}

}
