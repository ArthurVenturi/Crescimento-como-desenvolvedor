package lista_exercicios_trello;
import java.util.Scanner;

public class exer_10 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		System.out.println("Insira um número");
		float numero = dados.nextFloat();
		
		if (numero >= 20 && numero <= 90) {
			System.out.println("O número está no intervalo de 20 a 90");
		}
		else {
			System.out.println("O número não está no intervalo de 20 a 90");
		}
		dados.close();
	}

}