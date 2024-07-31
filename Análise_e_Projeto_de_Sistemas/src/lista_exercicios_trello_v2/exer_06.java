package lista_exercicios_trello_v2;
import javax.swing.JOptionPane;

public class exer_06 {

	public static void main(String[] args) {

		try {
			JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_06", JOptionPane.INFORMATION_MESSAGE);

			int intnumero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro :",
					"Exercício_06", JOptionPane.INFORMATION_MESSAGE));

			int intnumero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número inteiro : ",
					"Exercício_06", JOptionPane.INFORMATION_MESSAGE));

			double doubledivisao = (double) intnumero1 / intnumero2;
			double doubleresto = (double) intnumero1 % intnumero2;

			JOptionPane.showMessageDialog(null,
					"O resultado da divisão : " + doubledivisao + "\n" + "O resto da divisão : " + doubleresto);

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
