package aula_04;

public class Conta {

	public int numero;
	public double saldo;
	
	public void creditarSaldo (double credito) {
		this.saldo = this.saldo + credito;
	}
	
	public void debitarsaldo (double credito) {
		this.saldo = this.saldo - credito;
	}
	
	public void mostrarconta() {
		System.out.println("-----Conta-----");
		System.out.println("Número da conta: "+ this.numero);
		System.out.println("Saldo da conta: "+ this.saldo);
	}
	
	public double LimitePreAprovado() {
		return this.saldo *0.1;
	}
}
