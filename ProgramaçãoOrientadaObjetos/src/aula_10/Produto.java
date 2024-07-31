package aula_10;

public abstract class Produto {

	public int codigo;
	public double preco;
	
	public Produto(int codigo, double preco) {
		
		this.codigo = codigo;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", preco=" + preco + "]";
	}
	
	abstract double calculaFrete();
		
}
