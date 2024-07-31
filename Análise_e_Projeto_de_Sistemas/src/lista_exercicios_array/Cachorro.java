package lista_exercicios_array;

public class Cachorro {

	private String nome;
	private int idade;
	private String raca;
	private double peso;
	private String dono;
	
	public Cachorro(String nome, int idade, String raca, double peso, String dono) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.peso = peso;
		this.dono = dono;
	}
	
	public Cachorro() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + ", idade=" + idade + ", raca=" + raca + ", peso=" + peso + ", dono=" + dono
				+ "]" +"\n";
	}
	
	
	
}
