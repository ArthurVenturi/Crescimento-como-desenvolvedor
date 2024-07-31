package pilha;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int op;
		String enderecoWeb;

		Endereco endereco;

		Pilha pilha = new Pilha();

		System.out.println("Informe a opção desejada: ");
		System.out.println(" 1 - Incluir na Pilha");
		System.out.println(" 2 - Retirar da Pilha");
		System.out.println(" 3 - Mostrar a Pilha");
		System.out.println(" 4 - Limpar a Pilha");
		System.out.println(" 10 - SAIR");
		op = entrada.nextInt();
		entrada.nextLine();

		while (op != 10) {

			switch (op) {

			case 1:
				System.out.println("Informe o endereco web: ");
				enderecoWeb = entrada.nextLine();
				endereco = new Endereco(enderecoWeb);

				pilha.incluir(endereco);
				break;

			case 2:
				endereco = pilha.retirar();
				System.out.println("Elemento retirado da Pilha: ");
				System.out.println(endereco.toString());

				break;
			case 3:

				for (Endereco end : pilha.mostrar()) {
					System.out.println(end);
				}

				break;
			case 4:
				System.out.println("Pilha limpa");
				pilha.limpar();

				break;

			}

			System.out.println("Informe a opção desejada: ");
			System.out.println(" 1 - Incluir na Pilha");
			System.out.println(" 2 - Retirar da Pilha");
			System.out.println(" 3 - Mostrar a Pilha");
			System.out.println(" 4 - Limpar a Pilha");
			System.out.println(" 10 - SAIR");
			op = entrada.nextInt();
			entrada.nextLine();
		}

		System.out.println("Fila encerrada");

		entrada.close();
	}

}
