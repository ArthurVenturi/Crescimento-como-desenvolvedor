package trabalho_Herança;

public class PorHora extends Empregado{
	
	private double valor_hora;
	private double quant_horas;

	public PorHora(String nome, String email, int anoContratacao, double valor_hora, double quant_horas) {
		super(nome, email, anoContratacao);
		this.valor_hora = valor_hora;
		this.quant_horas = quant_horas;
	}

	public double getValor_hora() {
		return valor_hora;
	}
	
	public void setValor_hora(double valor_hora) {
		this.valor_hora = valor_hora;
	}
	
	public double getQuant_horas() {
		return quant_horas;
	}
	
	public void setQuant_horas(double quant_horas) {
		this.quant_horas = quant_horas;
	}
	
	@Override
	public String toString() {
		return "PorHora [valor_hora=" + valor_hora + ", quant_horas=" + quant_horas + ", getNome()=" + getNome()
				+ ", getEmail()=" + getEmail() + ", toString()=" + super.toString() + "]";
	}

	public double ganha() {
		
		double ganHora = this.valor_hora * quant_horas;
		
		return ganHora;
	}

}
