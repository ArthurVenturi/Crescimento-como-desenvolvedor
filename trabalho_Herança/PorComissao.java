package trabalho_Herança;

public class PorComissao extends Empregado {
	
	private double salario;
	private double comissao;
	private double vendas;

	public PorComissao(String nome, String email, int anoContratacao, double salario, double comissao, double vendas) {
		super(nome, email, anoContratacao);
		this.salario = salario;
		this.comissao = comissao;
		this.vendas = vendas;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	
	@Override
	public String toString() {
		return "PorComissao [salario=" + salario + ", comissao=" + comissao + ", vendas=" + vendas + ", getNome()="
				+ getNome() + ", getEmail()=" + getEmail() + ", toString()=" + super.toString() + ", tempoCasa()="
				+ tempoCasa() + "]";
	}

	public double ganha() {
		
		double ganhaComissao = this.salario + (comissao * vendas);
		
		return ganhaComissao;
	}

}
