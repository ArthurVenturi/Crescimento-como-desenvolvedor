package Estrutura_IF;
import java.util.Scanner;
public class calculo_nota {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Insira a primeira nota entre 1 a 10:");
		int nota1 = x.nextInt();
		
		Scanner y = new Scanner(System.in);
		System.out.println("Insira a primeira nota entre 1 a 10:");
		int nota2 = y.nextInt();
		
		float m_ari = ((nota1 + nota2) / 2);
		
		if (m_ari >= 7.0) {
			System.out.println("APROVADO");
		}
		else {
			System.out.println("REPROVADO");
		}
		x.close();
		y.close();
	}

}
