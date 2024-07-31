package aula02.Trabalho;

public class Midia extends Produto{

	private String artista;

	public Midia(int codigo, double preco, String artista) {
		super(codigo, preco);
		this.artista = artista;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	@Override
	public String toString() {
		return "Midia [artista=" + artista + ", Codigo=" + getCodigo() + ", "
				+ "Preco=" + getPreco() + " Imposto=" + calcularImposto() + ",  Preco com Imposto=" + precoImposto() + ", "
				+ "calcularfrete="+ calcularfrete() + ", PrecoTotal=" + precoTotal()
				+ "]";
	}

	public double calcularImposto() {
		return getPreco() * 0.05;
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
