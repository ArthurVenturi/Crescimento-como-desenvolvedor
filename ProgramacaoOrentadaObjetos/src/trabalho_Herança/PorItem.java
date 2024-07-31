package trabalho_Herança;

public class PorItem extends Empregado{
	
	private double valor_producao;
	private int quantidade;

	public PorItem(String nome, String email, int anoContratacao, double valor_producao, int quantidade) {
		super(nome, email, anoContratacao);
		this.valor_producao = valor_producao;
		this.quantidade = quantidade;
	}

	public double getValor_producao() {
		return valor_producao;
	}
	
	public void setValor_producao(double valor_producao) {
		this.valor_producao = valor_producao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "PorItem [valor_producao=" + valor_producao + ", quantidade=" + quantidade + ", getNome()=" + getNome()
				+ ", getEmail()=" + getEmail() + ", toString()=" + super.toString() + ", tempoCasa()=" + tempoCasa() + "]";
	}

	public double ganha() {
		
		double ganItem = this.valor_producao * this.quantidade;
		
		return ganItem;
		
	}

}
