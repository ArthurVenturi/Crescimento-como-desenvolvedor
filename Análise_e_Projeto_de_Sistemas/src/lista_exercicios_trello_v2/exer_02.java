package lista_exercicios_trello_v2;
import javax.swing.JOptionPane;

public class exer_02 {

	public static void main(String[] args) {

		try {

			JOptionPane.showMessageDialog(null, "Bem-vindo!", 
					"Exercício_02", JOptionPane.INFORMATION_MESSAGE);

			int p_numero = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Informe o valor do primeiro número inteiro: ", 
					"Exercício_02", JOptionPane.QUESTION_MESSAGE));

			int s_numero = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Informe o valor do segundo número inteiro: ", 
					"Exercício_02", JOptionPane.QUESTION_MESSAGE));

			int t_numero = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Informe o valor do terceiro número inteiro: ", 
					"Exercício_02", JOptionPane.QUESTION_MESSAGE));

			int q_numero = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Informe o valor do quarto número inteiro: ", 
					"Exercício_02", JOptionPane.QUESTION_MESSAGE));

			int media_aritmedica = (p_numero + s_numero + t_numero + q_numero);
			int resultado = (media_aritmedica / 4);

			JOptionPane.showMessageDialog(null, "A média aritmética dos quatro números são: " + resultado,
					"Exercício_02", JOptionPane.INFORMATION_MESSAGE);

		} catch (NumberFormatException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Operador Inválido", "Examine o texto!", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Contate o Administrador do Sistema");
		}
	}
}
