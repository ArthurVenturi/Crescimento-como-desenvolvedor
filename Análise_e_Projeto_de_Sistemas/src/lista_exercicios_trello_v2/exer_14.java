package lista_exercicios_trello_v2;

import javax.swing.JOptionPane;

public class exer_14 {

	public static void main(String[] args) {

		try {
			double dbnumero = 0, dbmaior = Integer.MIN_VALUE, dbmenor = Integer.MAX_VALUE;

			JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_14", JOptionPane.INFORMATION_MESSAGE);

			for (int i = 1; i <= 5; i++) {

				dbnumero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + i +"º número :",
				"Exercício_06", JOptionPane.INFORMATION_MESSAGE));

				if (dbnumero > dbmaior) {
					dbmaior = dbnumero;
				} 
				else if (dbnumero < dbmenor) {
					dbmenor = dbnumero;
				}
			}
			JOptionPane.showMessageDialog(null,
					"O maior número entre os 5 número : " + dbmaior + "\n" + "O menor número entre os 5 números: " + dbmenor,
					"Exercício_14", JOptionPane.INFORMATION_MESSAGE);
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
