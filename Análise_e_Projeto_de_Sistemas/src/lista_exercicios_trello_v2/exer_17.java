package lista_exercicios_trello_v2;

import javax.swing.JOptionPane;

public class exer_17 {

	public static void main(String[] args) {
		try {
			JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_17", JOptionPane.INFORMATION_MESSAGE);

			for (int i = 100; i >= 1; i--) {

				JOptionPane.showMessageDialog(null, "Números de 100 até 1 : " + i, "Exercício_17",
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
