package aula_06;

public class Conta {

	private int numero;
	private double saldo;

	public Conta(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
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
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]"+ "\n";
	}
	
	public void creditarSaldo(double novosaldo) {
		this.saldo = this.saldo + novosaldo;
	}
	
	public void debitarSaldo(double novosaldo) {
		this.saldo = this.saldo - novosaldo;
	}

}
