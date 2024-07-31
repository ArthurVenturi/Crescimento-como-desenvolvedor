package trabalho_08;

public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;
	private int matricula;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, double nota1, double nota2, int matricula) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.matricula = matricula;
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

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ", matricula=" + matricula + "]";
	}

	public double calcularMedia() {
		
		 double media = (this.nota1 + this.nota2) / 2;
		
		return media;
	}

}
