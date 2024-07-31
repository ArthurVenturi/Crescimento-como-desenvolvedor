package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal02 {

	public static void main(String[] args) {

		/*
		 * Defina uma classe chamada Filme com os atributos: nome, duração, gênero e
		 * classificação. Em seguida, crie um programa que instancia um objeto Filme,
		 * faça uma classe Principal que capture esses dados, grave cada objeto em um
		 * arquivo “filmes.txt” e depois exiba todos os dados que estão dentro de
		 * “filmes.txt”. Antes de inserir um novo filme, sempre perguntar para o usuário
		 * se deseja continuar utilizando JOptionPane. Lembre-se de usar o tratamento de
		 * Exception.
		 */

		try {

			File arquivo = new File("C:\\Users\\arthur.0950\\Documents\\senac.txt");
			FileWriter fileEscrita = new FileWriter(arquivo);
			BufferedWriter escritura = new BufferedWriter(fileEscrita);
			FileReader fileLeitura = new FileReader(arquivo);
			BufferedReader leitura = new BufferedReader(fileLeitura);

			ArrayList<Filme> lista = new ArrayList<>();
			
			int opcao = 99;
			
			while (opcao != 1){
				
				
				Filme Filme = new Filme();

				Filme.setNome(JOptionPane.showInputDialog(null, "Digite o nome do filme ", "Exercicio02",
						JOptionPane.INFORMATION_MESSAGE));

				Filme.setDuracao(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a duração do filme ",
						"Exercicio02", JOptionPane.INFORMATION_MESSAGE)));

				Filme.setGenero(JOptionPane.showInputDialog(null, "Digite o gênero do filme ", "Exercicio02",
						JOptionPane.INFORMATION_MESSAGE));

				Filme.setClassificacao(JOptionPane.showInputDialog(null, "Digite a classificação do filme ",
						"Exercicio02", JOptionPane.INFORMATION_MESSAGE));

				lista.add(Filme);

				escritura.append(Filme.toString());

				opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo filme ? ", "Exercicio02",
						JOptionPane.YES_NO_OPTION);

			}
			
			escritura.close();

			StringBuilder conteudo = new StringBuilder();
			String linha;

			while ((linha = leitura.readLine()) != null) {
				conteudo.append(linha);
				conteudo.append(System.lineSeparator());
				
			}
			
			leitura.close();

			JOptionPane.showMessageDialog(null, conteudo.toString(), "Exercicio02", JOptionPane.INFORMATION_MESSAGE);
			
		}

		catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Contate o Administrador do Sistema", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

		catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Contate o Administrador do Sistema", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}
}
