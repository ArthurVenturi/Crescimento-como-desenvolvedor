package lista_exercicios_trello;
import java.util.Scanner;

public class exer_02 {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		System.out.println("Digite um numero:");
		float p_numero = x.nextFloat();
		Scanner y = new Scanner(System.in);
		System.out.println("Digite o segundo numero:");
		float s_numero = y.nextFloat();
		Scanner z = new Scanner(System.in);
		System.out.println("Digite o terceito numero:");
		float t_numero = z.nextFloat();
		System.out.println("Digite o quarto numero:");
		float q_numero = z.nextFloat();
		
			float media_aritmedica = (p_numero + s_numero + t_numero + q_numero);
			float resultado = (media_aritmedica / 4 );
			
			System.out.println("A média aritmédica é:" + resultado);
			
		x.close();
		y.close();
		z.close();
	}
}
