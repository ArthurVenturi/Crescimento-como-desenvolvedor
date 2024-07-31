package lista_exercicios_trello_v2;

import javax.swing.JOptionPane;

public class exer_10 {

	public static void main(String[] args) {

		try {
			JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_10", JOptionPane.INFORMATION_MESSAGE);

			double doublenumero = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Insira um número :","Exercício_10", JOptionPane.INFORMATION_MESSAGE));

			if (doublenumero >= 20 && doublenumero <= 90) {
				JOptionPane.showMessageDialog(null, "O número está no intervalo de 20 a 90");
			} else {
				JOptionPane.showMessageDialog(null, "O número não está no intervalo de 20 a 90");
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