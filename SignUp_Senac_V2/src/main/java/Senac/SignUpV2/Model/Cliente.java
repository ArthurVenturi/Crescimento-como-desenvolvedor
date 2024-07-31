package Senac.SignUpV2.Model;

public class Cliente {

	private int Codigo_Cliente;
	private String Nome_Cliente;
	private String Email_Cliente;
	private String Curso;
	private Boolean PCD;
	private int idade;
	private String DataNascimento_Cliente;
	private String Renda_Clente;

	public int getCodigo_Cliente() {
		return Codigo_Cliente;
	}

	public void setCodigo_Cliente(int codigo_Cliente) {
		Codigo_Cliente = codigo_Cliente;
	}

	public String getNome_Cliente() {
		return Nome_Cliente;
	}

	public void setNome_Cliente(String nome_Cliente) {
		Nome_Cliente = nome_Cliente;
	}

	public String getEmail_Cliente() {
		return Email_Cliente;
	}

	public void setEmail_Cliente(String email_Cliente) {
		Email_Cliente = email_Cliente;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}

	public Boolean getPCD() {
		return PCD;
	}

	public void setPCD(Boolean pCD) {
		PCD = pCD;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento_Cliente() {
		return DataNascimento_Cliente;
	}

	public void setDataNascimento_Cliente(String dataNascimento_Cliente) {
		DataNascimento_Cliente = dataNascimento_Cliente;
	}

	public String getRenda_Clente() {
		return Renda_Clente;
	}

	public void setRenda_Clente(String renda_Clente) {
		Renda_Clente = renda_Clente;
	}

	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Cliente other = (Cliente) obj;
		return Codigo_Cliente == other.Codigo_Cliente;
	}

}
