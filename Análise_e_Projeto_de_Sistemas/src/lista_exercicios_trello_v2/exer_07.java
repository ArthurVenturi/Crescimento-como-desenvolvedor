package lista_exercicios_trello_v2;
import javax.swing.JOptionPane;

public class exer_07 {

	public static void main(String[] args) {

		try {
			JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_07", JOptionPane.INFORMATION_MESSAGE);

			double doublebase = Double.parseDouble(JOptionPane.showInputDialog(null,
					"Digite o valor da base do retângulo :", "Exercício_07", JOptionPane.INFORMATION_MESSAGE));

			double doublealtura = Double.parseDouble(JOptionPane.showInputDialog(null,
					"Digite o valor da altura do retângulo :", "Exercício_07", JOptionPane.INFORMATION_MESSAGE));

			double resultado = ((doublebase + doublealtura) * 2);
			double area = doublebase * doublealtura;
			double diagonal = (doublebase * doublebase) + (doublealtura * doublealtura);

			JOptionPane.showMessageDialog(null, "Perimetro do retângulo :" + resultado + "\n"
					+ "A área do retaângulo : " + area + "\n" + "Adiagonal do retangulo : " + diagonal);
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
