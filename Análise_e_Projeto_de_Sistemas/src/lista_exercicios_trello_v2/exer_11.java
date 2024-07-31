package lista_exercicios_trello_v2;

import javax.swing.JOptionPane;

public class exer_11 {

	public static void main(String[] args) {

		try {
			JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_11", JOptionPane.INFORMATION_MESSAGE);

			int intidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade :", "Exercício_11",
					JOptionPane.INFORMATION_MESSAGE));

			if (intidade >= 18) {
				JOptionPane.showInputDialog(null, "Você está na maioridade :", "Exercício_11",
						JOptionPane.INFORMATION_MESSAGE);

			} else {
				JOptionPane.showInputDialog(null, "Você está com idade inferior à de maioridade :", "Exercício_10",
						JOptionPane.INFORMATION_MESSAGE);

			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Operador Inválido", "Examine o texto!", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Contate o Administrador do Sistema", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}
}
