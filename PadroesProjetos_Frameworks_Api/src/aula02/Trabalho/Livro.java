package aula02.Trabalho;

public class Livro extends Produto{

	private String autor;
	private String editora;
	private int paginas;
	
	
	public Livro(int codigo, double preco, String autor, String editora, int paginas) {
		super(codigo, preco);
		this.autor = autor;
		this.editora = editora;
		this.paginas = paginas;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public int getPaginas() {
		return paginas;
	}


	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", editora=" + editora + ", paginas=" + paginas + ", "
				+ "Codigo=" + getCodigo() + ", Preco=" + getPreco() + ", imposto=" + calcularImposto()
				+ ", Preco com Imposto=" + precoImposto() + ", calcularfrete=" + calcularfrete() + ", PrecoTotal=" + precoTotal() + "]";
	}


	public double calcularImposto() {
		return getPreco() * 0.01;
	}
	
	public double calcularfrete() {
		 return (0.03 * getPreco()) + 5;
	}
	
	public double precoImposto() {
		return getPreco() + calcularImposto();
	}
	
	public double precoTotal() {
		return precoImposto() + calcularfrete();
	}
	
}
