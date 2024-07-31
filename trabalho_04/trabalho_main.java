package trabalho_04;

public class trabalho_main {

	public static void main(String[] args) {
		
		Conta conta_01 = new Conta(23196, 50.00, 1);
		System.out.println(conta_01.toString());
		
		Conta conta_02 = new Conta(23085, 2);
		System.out.println(conta_02.toString());
		
		Conta conta_03 = new Conta(22145, 100.00, 3);
		System.out.println(conta_03.toString());
		System.out.println("--------------------------------------------");
		
		if (conta_01.setSaldo(-30.00)) {
			System.out.println("Saldo alterado");
		}
		else {
			System.out.println("Saldo não alterado");
		}
		System.out.println(conta_01.toString());
		
		
		if (conta_01.setSaldo(90.00)) {
			System.out.println("Saldo alterado");
		}
		else {
			System.out.println("Saldo não alterado");
		}
		System.out.println(conta_01.toString());
		
		
		if (conta_02.setSaldo(-10.00)) {
			System.out.println("Saldo alterado");
		}
		else {
			System.out.println("Saldo não alterado");
		}
		System.out.println(conta_02.toString());
		

		if (conta_02.setSaldo(400.00)) {
			System.out.println("Saldo alterado");
		}
		else {
			System.out.println("Saldo não alterado");
		}
		System.out.println(conta_02.toString());
		
	
		if (conta_03.setSaldo(-150.00)) {
			System.out.println("Saldo alterado");
		}
		else {
			System.out.println("Saldo não alterado");
		}
		System.out.println(conta_03.toString());
		
		
		if (conta_03.setSaldo(350.00)) {
			System.out.println("Saldo alterado");
		}
		else {
			System.out.println("Saldo não alterado");
		}
		System.out.println(conta_03.toString());

	}

}
