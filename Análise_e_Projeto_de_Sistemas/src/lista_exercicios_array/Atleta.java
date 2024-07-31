package lista_exercicios_array;

import java.util.Arrays;

public class Atleta {

	private String nome;
	private double []saltos = new double [5];
	
	public Atleta(String nome, double[] saltos) {
		super();
		this.nome = nome;
		this.saltos = saltos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double[] getSaltos() {
		return saltos;
	}
	
	public void setSaltos(double[] saltos) {
		this.saltos = saltos;
	}
	
	public String toString() {
		return "Atleta [nome=" + nome + ", saltos=" + Arrays.toString(saltos) + "]" + "\n";
	}
	
	public double CalcularMedia() {
		double soma = 0;
		
		for(int i = 0; i < saltos.length; i++) {
			
			soma = soma + saltos[i];
		}
		return soma / saltos.length;
		
	}
	
}
