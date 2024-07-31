package lista_exercicios_trello;
import java.util.Scanner;

public class exer_01 {

	public static void main(String[] args) {
		
		int intnumero = 0;
		float floatnumero =0, soma=0, subtracao =0, divisao =0, multiplicacao =0;
				
	
		Scanner numero = new Scanner(System.in);
		System.out.println("Insira um número");
		intnumero = numero.nextInt();
		
		System.out.println("Insira um número racional");
		floatnumero = numero.nextFloat();
		
		soma = intnumero + floatnumero;
		subtracao = intnumero - floatnumero;
		multiplicacao = intnumero * floatnumero;
		divisao = intnumero / floatnumero;
		
		System.out.println("A soma dos dois números sao " + soma);
		System.out.println("A subtração dos dois números sao " + subtracao);
		System.out.println("A multiplicação dos dois números sao " + multiplicacao);
		System.out.println("A divisão dos dois números sao " + divisao);
		
		numero.close();
	}

}
