package aula_10;

public class Poupanca extends Conta {

	public int aniversario;

	public Poupanca() {

	}

	public Poupanca(int numero, double saldo, int aniversario) {
		super(numero, saldo);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	public String toString() {
		return "Poupanca [aniversario=" + aniversario + ", numero=" + numero + ", saldo=" + saldo + "]";
	}

	
}
