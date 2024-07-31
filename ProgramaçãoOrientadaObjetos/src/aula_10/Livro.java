package aula_10;

public class Livro extends Produto{

	public String autor;
	public String editora;
	public int paginas;
	
	public Livro(int codigo, double preco, String autor, String editora, int paginas) {
		super(codigo, preco);
		this.autor = autor;
		this.editora = editora;
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", editora=" + editora + ", paginas=" + paginas + ", codigo=" + codigo
				+ ", preco=" + preco + "]";
	}
	
	public double calculaFrete() {
		double freteLiv = this.preco + (this.preco * (7 / 100));
		
		return freteLiv;
	}
	
}
