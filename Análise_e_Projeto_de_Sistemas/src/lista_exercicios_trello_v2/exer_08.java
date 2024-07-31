package lista_exercicios_trello_v2;

import javax.swing.JOptionPane;

public class exer_08 {

	public static void main(String[] args) {

		try {
			JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_08", JOptionPane.INFORMATION_MESSAGE);

			double doublebase = Double.parseDouble(JOptionPane.showInputDialog(null,
					"Digite o valor da base do retângulo :", "Exercício_08", JOptionPane.INFORMATION_MESSAGE));

			double doublealtura = Double.parseDouble(JOptionPane.showInputDialog(null,
					"Digite o valor da altura do retângulo :", "Exercício_08", JOptionPane.INFORMATION_MESSAGE));

			double area = (doublebase * doublealtura) / 2;

			JOptionPane.showMessageDialog(null, "A área do triângulo : " + area, "Exercício_08",
					JOptionPane.INFORMATION_MESSAGE);
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
