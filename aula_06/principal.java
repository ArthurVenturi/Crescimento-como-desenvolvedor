package aula_06;

public class principal {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		cliente1.setCpf("0510400902");
		cliente1.setAnoNascimento(1985);
		cliente1.setNome("Ana Maria Marques");
		cliente1.setEmail("aninha@gmail.com");
				
		Conta conta1 = new Conta();
		conta1.setNumero(1519);
		conta1.setSaldo(759.20);
		cliente1.setConta(conta1);
		
		System.out.println(cliente1.toString());
		
		conta1.creditarSaldo(100.00);
		System.out.println(cliente1.toString());
		
		conta1.debitarSaldo(2750.00);
		System.out.println(cliente1.toString());
		
		Cliente cliente2 = new Cliente("02950338954", 1978, "Marcos Paulo Nunes", "marquito@gmail.com", new Conta(2374, 1500.00));
		System.out.println(cliente2.toString());
		
		cliente2.getConta().creditarSaldo(75.00);
		System.out.println(cliente2.toString());
		
		
		cliente2.getConta().debitarSaldo(150.00);
		System.out.println(cliente2.toString());
		
		Cliente cliente3 = new Cliente("03598268790", 1990, "João Cunha", "cunha@gmail.com", new Conta(3322,1200.00));
		System.out.println(cliente3.toString());
		
	}

}
