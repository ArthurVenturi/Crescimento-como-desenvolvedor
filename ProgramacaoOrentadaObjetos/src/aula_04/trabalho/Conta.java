package aula_04.trabalho;

public class Conta {

	private int numero;
	private double saldo;
	private int tipo; // 1- conta corrente, 2 - conta poupança, 3 - conta especial.

	public Conta(int numero, double saldo, int tipo) {

		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
	}

	public Conta(int numero, int tipo) {

		this.numero = numero;
		this.tipo = tipo;
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

	public boolean setSaldo(double saldo) {

		if (tipo == 1 || tipo == 2) {
			if (saldo >= 0) {
				this.saldo = this.saldo + saldo;
				
				return true;
			}

			else {
				return false;
			}
		}

		else if (tipo == 3) {
			this.saldo = this.saldo + saldo;

			return true;
		}

		else {
			return false;
		}
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		return "Conta [numero =" + numero + ", saldo =" + saldo + ", tipo =" + tipo + "]" + "\n";
	}

}
