package lista_exercicios_trello;
import java.util.Scanner;

public class exer_18 {

	public static void main(String[] args) {
		
		Scanner tabuada = new Scanner(System.in);
		System.out.println("Digite um número entre 1 a 10 para determinar a tabuada");
		int intnumero = tabuada.nextInt();
		System.out.println("Tabuada do "+intnumero);
		
		for (int i= intnumero; i <= intnumero;i++) {
			for (int j = 1; j <= 10;j++) {
				int inttabuada = i * j;
				System.out.println(i+" * "+j+" = "+inttabuada);
			}
		}
		tabuada.close();
	}

}
