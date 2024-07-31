package lista_exercicios_trello;
import java.util.Scanner;

public class exer_04 {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		System.out.println("Insira  quantos graus Celsius está hoje :");
		float celsius = x.nextFloat();
		
		float fahrenheit = ((celsius * 1.8f) + 32);
		System.out.println("A conversão de celsius para Fahrenheit é :" + fahrenheit);
		
		x.close();
	}

}
