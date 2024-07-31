package aula02.aulaPratica;

public class Midia extends Produto{

	protected String artista;

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
		return "Midia [artista=" + artista + ", getCodigo()=" + getCodigo() + ", getPreco()=" + getPreco() + "]";
	}
	
}
