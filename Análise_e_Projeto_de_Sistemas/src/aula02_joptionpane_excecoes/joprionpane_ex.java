package aula02_joptionpane_excecoes;

import javax.swing.JOptionPane;

public class joprionpane_ex {

	public static void main(String[] args) {

		try {
			pessoa p1 = new pessoa();

			p1.nome = JOptionPane.showInputDialog(null, "Informe seu nome: ");
			JOptionPane.showMessageDialog(null, "Meu nome é " + p1.nome);

			int resultado = 0;

			JOptionPane.showMessageDialog(null, "Bem vindo ! ", "Exemples - JOptionPane",
					JOptionPane.INFORMATION_MESSAGE);

			int valorUm = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor: ",
					"Exemples - JOptionPane", JOptionPane.QUESTION_MESSAGE));

			String operador = JOptionPane.showInputDialog(null, "Informe o tipo da operação que deseja: ",
					"Exemples - JOptionPane", JOptionPane.QUESTION_MESSAGE);

			int valorDois = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: ",
					"Exemples - JOptionPane", JOptionPane.QUESTION_MESSAGE));

			if (operador.trim().equals("+")) { // Trim () tira o espaço da string.
				resultado = valorUm + valorDois;
				JOptionPane.showMessageDialog(null, "O resultado da soma é: " + resultado, "Exemples - JOptionPane",
						JOptionPane.WARNING_MESSAGE);
			} else if (operador.trim().equals("-")) { // equals refere o operador para string.
				resultado = valorUm - valorDois;
				JOptionPane.showMessageDialog(null, "O resultaod da subtração é: ", "Exemples - JOptionPane",
						JOptionPane.WARNING_MESSAGE);
			} else if (operador.trim().equals("*")) {
				resultado = valorUm * valorDois;
				JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + resultado,
						"Exemples - JOptionPane", JOptionPane.WARNING_MESSAGE);
			} else if (operador.trim().equals("/")) {
				resultado = valorUm / valorDois;
				JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultado, "Exemples - JOptionPane",
						JOptionPane.WARNING_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Operador Invalido!", "Exemples - JOptionPane",
						JOptionPane.ERROR_MESSAGE);
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Operador Inválido", "Examine o texto!", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Contate o Administrador do Sistema");
		}

	}
}
