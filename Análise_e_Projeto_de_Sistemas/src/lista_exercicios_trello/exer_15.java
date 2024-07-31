package lista_exercicios_trello;
import java.util.Scanner;

public class exer_15 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		System.out.println("Insira um número");
		double dbnumero = dados.nextDouble();
		
		if (dbnumero == 5) {
			System.out.println("O número pertence ao escopo 5");
		}
		else if(dbnumero == 200 ) {
			System.out.println("O número pertence ao escopo 200");
		}
		else if (dbnumero == 400) {
			System.out.println("O número pertence ao escopo 400");
		}
		else if (dbnumero >=500 && dbnumero <=1000) {
			System.out.println("O número pertence no intervalo entre 500 e 1000: "+dbnumero);
		}
		else {
			System.out.println("O número digitado não pertence à nenhum escopo.");
		}
		
		dados.close();
	}

}
