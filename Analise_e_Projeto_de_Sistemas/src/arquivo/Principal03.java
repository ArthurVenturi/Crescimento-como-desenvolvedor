package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Principal03 {

	public static void main(String[] args) {

		/*O Senac possui 5 cursos de Análise e Desenvolvimento de Sistemas
		(ADS) no Paraná, cada uma com um código de 1 a 5, sendo Curitiba,
		São Jose dos Pinhais, Ponta Grossa, Maringá e Londrina. Um arquivo
		contendo todas as matrículas feitas durante o dia nas cinco unidades
		é gerada a partir de uma planilha, sendo que cada linha do arquivo
		contém o número da unidade e a quantidade de uma matrícula
		efetuada em ADS, separados por vírgula. Ex.:
		1, 23
		2, 12
		3, 44
		4, 2
		5, 0
		Faça um programa que leia esses valores das 5 unidades em um
		arquivo e informe, ao final, o total de matrículas das unidades
		realizadas por dia. Utilize JOptionPane para entrada e saída de dados,
		além de realizar o tratamento de exceção.*/


		try {

			File arquivo = new File("C:\\Users\\arthur.0950\\Documents\\matricula.txt");
			FileWriter fileEscrita = new FileWriter(arquivo);
			BufferedWriter escritura = new BufferedWriter(fileEscrita); 
			FileReader fileLeitura = new FileReader(arquivo);
			BufferedReader leitura = new BufferedReader(fileLeitura);

			int matriTotal = 0;
			
			int array[] = new int [6];
			
			for (int i = 1; i < array.length;i++) {
				
				array[i] = Integer.parseInt(JOptionPane.showInputDialog(null, i + ", Insira a quantidade de matrículas das cinco unidades do Senac",
						"Exercicio03", JOptionPane.INFORMATION_MESSAGE));
				
				matriTotal += array[i];
				
				escritura.append( i + ", " + array[i] + " ");
				escritura.newLine();
				
			}
			
			escritura.close();
			
			StringBuilder conteudo = new StringBuilder();
			String linha;

			while ((linha = leitura.readLine()) != null) {
				conteudo.append(linha);
				conteudo.append(System.lineSeparator());
		
			}
			
			JOptionPane.showMessageDialog(null, conteudo.toString(), "Exercicio03", JOptionPane.INFORMATION_MESSAGE);
			
			leitura.close();
			
			JOptionPane.showMessageDialog(null, " O total de matriculas feitas por dia foram " + matriTotal,
					"Exercicio03", JOptionPane.INFORMATION_MESSAGE);

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
