package aula_10;

public class Especial extends Conta{

	public double limite;
	
	public Especial() {
		
	}

	public Especial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String toString() {
		return "Especial [limite=" + limite + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
	public boolean debitarSaldo(double saldo_debitado) {
		
		if (saldo_debitado < (this.saldo + this.limite)) {
			
			this.saldo += saldo_debitado;
			return true;
		}
		else {
			return false;
		}
	}

}
