package aula_07;

public class Conta {

	protected int numero;
	protected double saldo;

	public Conta(int numero) {
		this.numero = numero;
	}

	public Conta() {

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

	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}

	public void creditaSaldo(double valorCreditado) {
		this.saldo = this.saldo + valorCreditado;
	}

	public void debitaSaldo(double valorDebitado) {
		this.saldo = this.saldo + valorDebitado;
	}

	public void mostra() {
		System.out.println("A conta " + this.numero + " tem saldo de " + this.saldo);
	}

}
