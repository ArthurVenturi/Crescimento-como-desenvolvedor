package aula_04;

public class conta_main {

	public static void main(String[] args) {
		
		Conta conta_01 = new Conta();
		
		conta_01.numero = 1500;
		conta_01.saldo = 2100;
		
		conta_01.debitarsaldo(542);
		conta_01.creditarSaldo(100);
		conta_01.mostrarconta();
		
		double limite = conta_01.LimitePreAprovado();
		System.out.println("O limite pré Aprovado: "+limite);
		
	}

}
