package lista_exercicios_trello_v2;

import javax.swing.JOptionPane;

public class exer_13 {

	public static void main(String[] args) {

		try {

			JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_13", JOptionPane.INFORMATION_MESSAGE);

			double doublenumero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número :",
					"Exercício_13", JOptionPane.INFORMATION_MESSAGE));

			if (doublenumero >= 0) {
				double dbraiz_quadrada = Math.sqrt(doublenumero);
				JOptionPane.showMessageDialog(null, "A raiz quadrada do número :" + dbraiz_quadrada, "Exercício_13",
						JOptionPane.INFORMATION_MESSAGE);

			} else {
				double dbquadrado = ((doublenumero - 1) * (doublenumero + 1)) + 1;
				JOptionPane.showMessageDialog(null, "A raiz quadrada do número :" + dbquadrado, "Exercício_13",
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
