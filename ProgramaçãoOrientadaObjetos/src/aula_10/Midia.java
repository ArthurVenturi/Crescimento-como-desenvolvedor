package aula_10;

public class Midia extends Produto{

	public String artista;

	public Midia(int codigo, double preco, String artista) {
		super(codigo, preco);
		this.artista = artista;
	}

	@Override
	public String toString() {
		return "Midia [artista=" + artista + ", codigo=" + codigo + ", preco=" + preco + "]";
	}
	
	public double calculaFrete() {
		double freteMid = this.preco + (this.preco * (5 / 100));
		
		return freteMid;
	}
	
	
}
