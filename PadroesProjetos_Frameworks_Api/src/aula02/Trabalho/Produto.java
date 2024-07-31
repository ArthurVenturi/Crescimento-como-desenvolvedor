package aula02.Trabalho;

public abstract class Produto {

	private int codigo;
	private double preco;
	
	public Produto(int codigo, double preco) {
		super();
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
	
	public double darDesconto(double porcentagem) {
		return this.preco -= (this.preco * (porcentagem/100));
	}
	
	public double reajustarPreco(double porcentagem) {
		
		return this.preco += this.preco * (porcentagem/100);
	}
	
	public abstract double calcularImposto();
	
	public abstract double precoImposto();
	
	public abstract double calcularfrete();
	
	public abstract double precoTotal();
}
