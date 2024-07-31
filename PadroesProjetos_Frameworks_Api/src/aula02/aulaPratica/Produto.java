package aula02.aulaPratica;

public  class Produto {

	protected int codigo;
	protected double preco;
	
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
		return "Produto [codigo=" + codigo + ", preco=" + preco + ", calcularfrete()=" + calcularfrete() + "]";
	}

	public double darDesconto(double porcentagem) {
		return this.preco -= (this.preco * (porcentagem / 100));
	}
	
	public double reajustarPreco(double porcentagem) {
		
		return this.preco += this.preco * (porcentagem/100);
	}
	
	public double calcularfrete() {
		 return (0.03 * this.preco) + 5;
	}
}
