package lista_exercicios_trello_v2;

import javax.swing.JOptionPane;

public class exer_15 {

	public static void main(String[] args) {

		try {
			JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_15", JOptionPane.INFORMATION_MESSAGE);

			double dbnumero = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Insira um número", "Exercício_15", JOptionPane.WARNING_MESSAGE));

			if (dbnumero == 5) {
				JOptionPane.showMessageDialog(null, "O número pertence ao escopo 5", "Exercicío_15",
						JOptionPane.INFORMATION_MESSAGE);

			} else if (dbnumero == 200) {
				JOptionPane.showMessageDialog(null, "O número pertence ao escopo 200", "Exercicío_15",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (dbnumero == 400) {
				JOptionPane.showMessageDialog(null, "O número pertence ao escopo 400", "Exercicío_15",
						JOptionPane.INFORMATION_MESSAGE);

			} else if (dbnumero >= 500 && dbnumero <= 1000) {
				JOptionPane.showMessageDialog(null, "O número pertence no intervalo entre 500 e 1000 : " + dbnumero,
						"Exercicío_15", JOptionPane.INFORMATION_MESSAGE);

			} else {
				JOptionPane.showMessageDialog(null, "O número não pertence à nenhum escopo.", "Exercicío_15",
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
