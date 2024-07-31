package trabalho_08;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		try {

			/*
			 * int [] pins = { 9, 3, 7, 2};
			 * 
			 * Scanner sc = new Scanner(System.in);
			 * 
			 * System.out.println("Digite o número que deseja buscar : "); int procurar =
			 * sc.nextInt(); boolean achou = false;
			 * 
			 * for (int i = 0; i < pins.length;i++) {
			 * 
			 * if (pins[i] == procurar) {
			 * 
			 * achou = true; break; }
			 * 
			 * }
			 * 
			 * if(achou) {
			 * 
			 * System.out.println("O número que você procura está no array!"); }
			 * 
			 * else { System.out.println("O número que você procura não está no array!"); }
			 * 
			 * sc.close();
			 */

			/*--------------------------------------------------------------------------------------------------------------*/

			boolean achou = false;
			String AlunoAchado = null;

			Aluno listaAluno[] = new Aluno[2];

			for (int i = 0; i < listaAluno.length; i++) {

				String nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno", "Trabalho_08",
						JOptionPane.INFORMATION_MESSAGE);

				double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira nota do aluno",
						"Trabalho_08", JOptionPane.INFORMATION_MESSAGE));

				double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota do aluno",
						"Trabalho_08", JOptionPane.INFORMATION_MESSAGE));

				int matricula = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Informe o número da matricula do aluno", "Trabalho_08", JOptionPane.INFORMATION_MESSAGE));

				listaAluno[i] = new Aluno(nome, nota1, nota2, matricula);

			}

			for (int i = 0; i < listaAluno.length; i++) {

				JOptionPane.showMessageDialog(null, "Nome do Aluno : " + listaAluno[i].getNome() + "\n" + "Média : "
						+ listaAluno[i].calcularMedia(), "Trabalho_08", JOptionPane.INFORMATION_MESSAGE);

			}

			int opcao = JOptionPane.showConfirmDialog(null, "Deseja fazer a pesquisa da matricula do aluno ?",
					"Trabalho_08", JOptionPane.YES_NO_OPTION);

			if (opcao == 0) {

				int procurar = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Digite o número da matricula do aluno que deseja procurar",
								"Trabalho_08", JOptionPane.INFORMATION_MESSAGE));

				for (int i = 0; i < listaAluno.length; i++) {

					if (listaAluno[i].getMatricula() == procurar) {

						AlunoAchado = listaAluno[i].toString();
						achou = true;
						break;
					}

				}

				if (achou) {

					JOptionPane.showMessageDialog(null, "O aluno com a matricula  " + procurar + " é do " + AlunoAchado,
							"Trabalho_08", JOptionPane.INFORMATION_MESSAGE);
				}

				else {
					JOptionPane.showMessageDialog(null, "O aluno com a matricula " + procurar + " não está no sistema",
							"Trabalho_08", JOptionPane.INFORMATION_MESSAGE);
				}

			}

		}

		catch (
		NumberFormatException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Operador Inválido", "Examine o texto!", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Contate o Administrador do Sistema", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}
}