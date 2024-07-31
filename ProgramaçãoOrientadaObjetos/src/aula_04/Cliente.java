package aula_04;

public class Cliente {

	String cpf;
	int anoNascimento;
	String nome;
	String email;
	
	public void mostrarCliente() {
		
		System.out.println("Tabela de clientes");
		System.out.println("----------------------");
		System.out.println("CPF: " +cpf);
		System.out.println("Nome: " +nome);
		System.out.println("Ano de Nascimento: "+anoNascimento);
		System.out.println("Email: " +email);
	}

	public String toString() {
		return "Cliente cpf =" + cpf + ", anoNascimento =" + anoNascimento + ", nome =" + nome + ", email =" + email;
	}
	
	
}

