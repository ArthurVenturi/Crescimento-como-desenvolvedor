package aula_09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Fila fila = new Fila();
		 * 
		 * Cliente cli;
		 * 
		 * JOptionPane.showMessageDialog(null, "",
		 * "Informe a opcao desejada : \\n\" + \"1 - Incluir na fila  \\n\"+ \r\n" +
		 * "	\"2 - Retira da fila \\n\" + \"3 - Mostrar a fila \\n\" + \"4 - Lipar a fila \\n\" + \"10 - SAIR"
		 * , JOptionPane.INFORMATION_MESSAGE);
		 * 
		 * int opcao = Integer .parseInt(JOptionPane.showInputDialog(null, "",
		 * "Informe sua opção", JOptionPane.INFORMATION_MESSAGE));
		 * 
		 * while (opcao != 10) {
		 * 
		 * switch (opcao) {
		 * 
		 * case 1:
		 * 
		 * int Codigo = Integer.parseInt( JOptionPane.showInputDialog(null, "",
		 * "Infome seu Código", JOptionPane.INFORMATION_MESSAGE));
		 * 
		 * String nome = JOptionPane.showInputDialog(null, "", "Informe seu Nome",
		 * JOptionPane.INFORMATION_MESSAGE);
		 * 
		 * cli = new Cliente(Codigo, nome);
		 * 
		 * fila.incluir(cli);
		 * 
		 * break;
		 * 
		 * case 2:
		 * 
		 * 
		 * fila.retirar(); JOptionPane.showMessageDialog(null, "", "Elemento retirado ",
		 * JOptionPane.INFORMATION_MESSAGE);
		 * 
		 * JOptionPane.showMessageDialog(null, "", fila.toString(),
		 * JOptionPane.INFORMATION_MESSAGE);
		 * 
		 * break;
		 * 
		 * case 3:
		 * 
		 * for (Cliente cliente : fila.mostrar()) {
		 * 
		 * JOptionPane.showMessageDialog(null, "", cliente,
		 * JOptionPane.INFORMATION_MESSAGE);
		 * 
		 * }
		 * 
		 * break;
		 * 
		 * case 4:
		 * 
		 * cli = fila.limpar(); JOptionPane.showInputDialog(null, "", "Fila limpa!",
		 * JOptionPane.INFORMATION_MESSAGE);
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * JOptionPane.showMessageDialog(null, "",
		 * "Informe a opcao desejada : \\n\" + \"1 - Incluir na fila  \\n\"+ \r\n" +
		 * "	\"2 - Retira da fila \\n\" + \"3 - Mostrar a fila \\n\" + \"4 - Lipar a fila \\n\" + \"10 - SAIR"
		 * , JOptionPane.INFORMATION_MESSAGE);
		 * 
		 * opcao = Integer.parseInt( JOptionPane.showInputDialog(null, "",
		 * "Informe sua opção", JOptionPane.INFORMATION_MESSAGE));
		 * 
		 * }
		 * 
		 * 
		 * JOptionPane.showInputDialog(null, "", "Fila encerrada !",
		 * JOptionPane.INFORMATION_MESSAGE);
		 * 
		 */

		Scanner entrada = new Scanner(System.in);
		int op;
		int codigoCliente;
		String nomeCliente;

		Cliente cliente;

		Fila fila = new Fila();

		System.out.println("Informe a opcao desejada: ");
		System.out.println(" 1 - Incluir na Fila");
		System.out.println(" 2 - Retirar da Fila");
		System.out.println(" 3 - Mostrar a Fila");
		System.out.println(" 4 - Limpar a Fila");
		System.out.println(" 10 - SAIR");
		op = entrada.nextInt();

		while (op != 10) {

			switch (op) {

			case 1:
				System.out.println("Informe o codigo do cliente: ");
				codigoCliente = entrada.nextInt();
				entrada.nextLine();
				System.out.println("Informe o nome do cliente: ");
				nomeCliente = entrada.nextLine();
				cliente = new Cliente(codigoCliente, nomeCliente);

				fila.incluir(cliente);
				break;

			case 2:
				cliente = fila.retirar();
				System.out.println("Elemento retirado da fila: ");
				System.out.println(cliente.toString());
				break;

			case 3:

				for (Cliente cli : fila.mostrar()) {
					System.out.println(cli);
				}
				break;

			case 4:
				System.out.println("Fila limpa");
				fila.limpar();

				break;

			case 5:

				int quant = fila.Quantidade();
				System.out.println("Tamanho da Fila : " + quant);

				break;

			case 6:

				System.out.println("Informe o codigo desejado: ");
				int codigo = entrada.nextInt();
				
				System.out.println(" O Cliente se localiza na posicao " + fila.pesquisa(codigo) + " da fila"); 

				break;

			}

			System.out.println("Informe a opcao desejada: ");
			System.out.println(" 1 - Incluir na Fila");
			System.out.println(" 2 - Retirar da Fila");
			System.out.println(" 3 - Mostrar a Fila");
			System.out.println(" 4 - Limpar a Fila");
			System.out.println(" 5 - Quantidade da Fila");
			System.out.println(" 6 - Pesquisa");
			System.out.println(" 10 - SAIR");
			op = entrada.nextInt();
		}

		System.out.println("Fila encerrada");
		entrada.close();

	}
}
