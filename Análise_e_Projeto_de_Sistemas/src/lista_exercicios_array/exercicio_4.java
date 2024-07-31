package lista_exercicios_array;

import javax.swing.JOptionPane;

public class exercicio_4 {

	public static void main(String[] args) {

		/*
		 * Em uma competição de salto em distância cada atleta tem direito a cinco
		 * saltos. O resultado do atleta será determinado pela média dos cinco valores
		 * restantes. Você deve fazer a classe Atleta que receba o nome e um array com
		 * as cinco distâncias alcançadas em seus saltos e depois informe o nome, os
		 * saltos e a média dos saltos. Lembre-se de utilizar tratamento de exceção e
		 * toda entrada e saída de dados deve ser realizada com JOptionPane.
		 */

		try {

			String nome = JOptionPane.showInputDialog(null, "Digita o nome do atleta", "exercicio 04",
					JOptionPane.INFORMATION_MESSAGE);

			double[] saltos = new double[5];

			for (int i = 0; i < saltos.length; i++) {

				saltos[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digita o valor dos cinco saltos : ",
						"exercicio 04", JOptionPane.INFORMATION_MESSAGE));

			}

			Atleta atl = new Atleta(nome, saltos);

			JOptionPane.showMessageDialog(null, "O valor dos cinco saltos são : " + atl.toString()
					+ "A média dos cinco saltos é : " + atl.CalcularMedia(), "exercicio 04",
					JOptionPane.INFORMATION_MESSAGE);
		} 
		
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Operador inválido", "exercicio 04", JOptionPane.ERROR_MESSAGE);
		}

		catch (IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Utrapassou a quantidade do vetor", "exercicio 04",
					JOptionPane.ERROR_MESSAGE);
		}

		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro no sistema contate o administrador do sistema", "exercicio 04",
					JOptionPane.ERROR_MESSAGE);
		}
	}

}
