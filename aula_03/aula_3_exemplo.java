package aula_03;
import java.util.Scanner;
public class aula_3_exemplo {

	public static void main(String[] args) {
		
		double dbtotalsalario = 0, dbmedia, dbsalario;
		int intempregados;
		
		Scanner salario = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de empregados");
		intempregados = salario.nextInt();
		
		for (int i =1; i <= 3; i++) {
			System.out.println("insira o salário do empregado " +i);
			dbsalario = salario.nextDouble();
			
			dbtotalsalario += dbsalario;
		}
		
		dbmedia = dbtotalsalario /intempregados;
		
		System.out.println("O total dos salarios de todos os empregados " +dbtotalsalario);
		System.out.println("");
		
		salario.close();
	}

}
