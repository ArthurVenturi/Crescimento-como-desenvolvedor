package aula_07;

public class Principal {

	public static void main(String[] args) {
		
		Conta cont1 = new Conta(1719);
		System.out.println(cont1.getNumero());
		
		cont1.creditaSaldo(150.63);
		System.out.println(cont1.getSaldo());
		
		Conta cont2  = new Conta(7575);
		cont2.setSaldo(500);
		cont2.creditaSaldo(173.50);
		cont2.debitaSaldo(84);
		cont2.mostra();
		System.out.println(cont2.getSaldo());
		
		
	}

}
