package lista_exercicios_trello;
import java.util.Scanner;
public class exer_12 {

	public static void main(String[] args) {

		Scanner notas = new Scanner(System.in);
		System.out.println("Insira a primeira nota:");
		double nota1 = notas.nextFloat();
		
		System.out.println("Insira a segunda nota:");
		double nota2 = notas.nextFloat();
		
		System.out.println("Insira a terceira nota:");
		double nota3 = notas.nextFloat();

		double media_aritmedica = ((nota1 + nota2 + nota3)/ 3);

		if (media_aritmedica >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Sua média foi de " + media_aritmedica);
		}
		else {
			System.out.println("Reprovado");
			System.out.println("Sua média foi de " + media_aritmedica);
		}
		
		notas.close();
	}
}
