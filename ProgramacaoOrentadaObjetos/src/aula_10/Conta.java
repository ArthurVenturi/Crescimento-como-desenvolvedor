package aula_10;

public class Conta {

	public int numero;
	public double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void creditasaldo(double saldo_Creditado) {
		
		this.saldo += saldo_Creditado;
	}
	
	public boolean debitarSaldo(double saldo_debitado) {
		
		if (saldo_debitado > this.saldo) {
			return false;
		}
		else {
			this.saldo -= saldo_debitado;
			return true;
		}
	}

	
	
}
