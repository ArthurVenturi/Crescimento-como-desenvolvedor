package lista_exercicios_trello;
import java.util.Scanner;

public class exer_11 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = dados.nextInt();

		if (idade >= 18) {
			System.out.println("Você está na maioridade");
		}
		else {
			System.out.println("Você está com idade inferior à da maioridade");
		}
		dados.close();
	}
}
