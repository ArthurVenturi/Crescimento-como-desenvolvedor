package pilha;

public class Endereco {
	
	private String endereco;

	public Endereco(String endereco) {
		super();
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String toString() {
		return "Endereco [endereco=" + endereco + "]";
	}
	
}
