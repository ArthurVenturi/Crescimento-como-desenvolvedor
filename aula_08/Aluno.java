package aula_08;

public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, double nota1, double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
	}
	
	public double calcularMedia() {
		
		 double media = (this.nota1 + this.nota2) / 2;
		
		return media;
	}
	
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Aluno other = (Aluno) obj;
		return nome == other.nome;
	}

}
