package arraylist;

public class Cliente {

	private String cpf;
	private int anoNascimento;
	private String nome;
	private String email;

	/*
	 * public Cliente(String cpf, int anoNascimento, String nome, String email, int
	 * numero, double saldo) { super(); this.cpf = cpf; this.anoNascimento =
	 * anoNascimento; this.nome = nome; this.email = email;
	 * 
	 * this.conta = new Conta(numero, saldo); }
	 */

	public Cliente(String cpf, int anoNascimento, String nome, String email) {
		super();
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
		this.nome = nome;
		this.email = email;

	}

	public Cliente() {

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Cliente [cpf=" + cpf + ", anoNascimento=" + anoNascimento + ", nome=" + nome + ", email=" + email + "]"
				+ "\n";
	}

}
