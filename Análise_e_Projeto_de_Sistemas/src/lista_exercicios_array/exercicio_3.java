package lista_exercicios_array;

import javax.swing.JOptionPane;

public class exercicio_3 {

	public static void main(String[] args) {

		/*
		 * Desenvolva a classe Cachorro com os seguintes atributos: Nome, Idade, Raça,
		 * Peso e Dono. Crie a classe TestaCachorro e preencha um array de cachorro de
		 * 10 posições utilizando JOptionPane. Exiba apenas os objetos cachorro onde a
		 * raça é “Pitbull”. Lembre-se de utilizar tratamento de exceção.
		 */

		try {

			Cachorro array[] = new Cachorro[10];

			for (int i = 0; i < array.length; i++) {

				String nome = JOptionPane.showInputDialog(null, "Digita o nome do cachorro", "exercicio 03",
						JOptionPane.INFORMATION_MESSAGE);

				int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita o idade do cachorro",
						"exercicio 03", JOptionPane.INFORMATION_MESSAGE));

				String raca = JOptionPane.showInputDialog(null, "Digita o raça do cachorro", "exercicio 03",
						JOptionPane.INFORMATION_MESSAGE);

				double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digita a peso do cachorro",
						"exercicio 03", JOptionPane.INFORMATION_MESSAGE));

				String dono = JOptionPane.showInputDialog(null, "Digita o nome do dono do cachorro", "exercicio 03",
						JOptionPane.INFORMATION_MESSAGE);

				array[i] = new Cachorro(nome, idade, raca, peso, dono);
			}

			for (int i = 0; i < array.length; i++) {

				if (array[i].getRaca().equals("Pitbull")) {
					System.out.println(array[i].toString());
				}
			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Operador inválido", "exercicio 03", JOptionPane.ERROR_MESSAGE);
		}

		catch (IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Utrapassou a quantidade do vetor", "exercicio 03",
					JOptionPane.ERROR_MESSAGE);
		}

		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro no sistema contate o administrador do sistema", "exercicio 03",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
