package lista_exercicios_trello_v2;

import javax.swing.JOptionPane;

public class exer_01 {

	public static void main(String[] args) {

		try {

			JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_01", JOptionPane.INFORMATION_MESSAGE);

			int intnumero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número inteiro: ",
					"Exercício_01", JOptionPane.QUESTION_MESSAGE));

			float floatnumero = Float.parseFloat(JOptionPane.showInputDialog(null,
					"Informe o segundo número racional: ", "Exercício_01", JOptionPane.QUESTION_MESSAGE));

			float soma = intnumero + floatnumero;
			float subtracao = intnumero - floatnumero;
			float multiplicacao = intnumero * floatnumero;
			float divisao = intnumero / floatnumero;

			JOptionPane.showMessageDialog(null,
					"O resultado da soma é: " + soma + "\n" + "O resultado da subtração é: " + subtracao + "\n"
							+ "O resultado da multiplicação é: " + multiplicacao + "\n" + "O resultado da divisão é: "
							+ divisao,
					"Exercício_01", JOptionPane.INFORMATION_MESSAGE);

		} catch (NumberFormatException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Operador Inválido", "Examine o texto!", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Contate o Administrador do Sistema");
		}

	}

}
