package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Principal01 {

	public static void main(String[] args) {

		/*
		 * Crie um programa em Java que escreva a seguinte mensagem em um arquivo
		 * chamado "senac.txt": "Conteúdo a ser gravado no arquivo.". Depois leia essa
		 * mensagem e exiba no console e em um JOptionPane. Utilize as classes do pacote
		 * java.io. Lembre-se de usar o tratamento de Exception.
		 */

		try {

			File arquivin = new File("C:\\Users\\arthur.0950\\Documents\\senac.txt");
			FileReader leitorArquivo = new FileReader(arquivin);
			FileWriter escritaArquivo = new FileWriter(arquivin);
			BufferedReader bfLeitura = new BufferedReader(leitorArquivo);
			BufferedWriter bfEscrita = new BufferedWriter(escritaArquivo);

			// Lendo com o FILEREADER
			// int dados = leitorArquivo.read();
			// while (dados != -1) {
			// JOptionPane.showMessageDialog(null, (char) dados);
			// dados = leitorArquivo.read();
			// }

			// bfEscrita.write(JOptionPane.showInputDialog(null, "Insira seu nome: "));
			// bfEscrita.close();

			StringBuilder content = new StringBuilder();
			String line;
			while ((line = bfLeitura.readLine()) != null) {
				content.append(line);
				content.append(System.lineSeparator());
			}

			// Exibindo os dados do arquivo
			JOptionPane.showMessageDialog(null, content.toString());

		} catch (IOException e) {
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
