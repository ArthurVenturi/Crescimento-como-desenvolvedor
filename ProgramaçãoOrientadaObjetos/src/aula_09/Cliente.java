package aula_09;

public class Cliente {

	private int Codigo;
	private String nome;

	public Cliente() {

	}
	

	public Cliente(int codigo, String nome) {
		super();
		Codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [Codigo=" + Codigo + ", nome=" + nome + "]";
	}

	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Cliente other = (Cliente) obj;
		return Codigo == other.Codigo;
	}
	
}	
