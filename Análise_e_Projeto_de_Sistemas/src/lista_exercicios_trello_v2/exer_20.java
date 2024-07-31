package lista_exercicios_trello_v2;

import javax.swing.JOptionPane;

public class exer_20 {

	public static void main(String[] args) {

		double dbnumeros = 0, soma = 0, total = 0;

		try {
			JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_20", JOptionPane.INFORMATION_MESSAGE);

			for (int i = 0; i <= 5; i++) {
				dbnumeros = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um número inteiro",
						"Exercício_20", JOptionPane.INFORMATION_MESSAGE));

				if (dbnumeros >= 0) {
					soma += dbnumeros;
				} else {
					total += dbnumeros;
				}
			}
			JOptionPane.showMessageDialog(null,
					"A soma dos números positivos : " + soma + "\n" + "O totoal dos números negativos : " + total,
					"Exercício_20", JOptionPane.INFORMATION_MESSAGE);
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
