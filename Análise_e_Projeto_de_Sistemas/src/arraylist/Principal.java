package arraylist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		try {
			ArrayList<Cliente> ListaPessoas = new ArrayList<>();
			Cliente Cli;

			for (int i = 0; i > 2; i++) {
				Cli = new Cliente();
				

				Cli.setNome(JOptionPane.showInputDialog(null, "Informe seu nome: ", "Cadastro de Cliente",
						JOptionPane.QUESTION_MESSAGE));

				Cli.setCpf(JOptionPane.showInputDialog(null, "Informe seu cpf: ", "Cadastro de Cliente",
						JOptionPane.QUESTION_MESSAGE));

				Cli.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe seu nome: ",
						"Cadastro de Cliente", JOptionPane.QUESTION_MESSAGE)));

				Cli.setEmail(JOptionPane.showInputDialog(null, "Informe seu e mail: ", "Cadastro de Cliente",
						JOptionPane.QUESTION_MESSAGE));

				ListaPessoas.add(Cli);
				
			}

			for (int i = 0; i < ListaPessoas.size(); i++) {

				Cli = ListaPessoas.get(i);

				JOptionPane.showMessageDialog(null,
						"Nome : " + Cli.getNome() + "CPF : " + Cli.getCpf() + "Ano de Nascimento : "
								+ Cli.getAnoNascimento() + "Email : " + Cli.getEmail(),
						"Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);

			}
		}

		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro no Sistema!" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}

}
