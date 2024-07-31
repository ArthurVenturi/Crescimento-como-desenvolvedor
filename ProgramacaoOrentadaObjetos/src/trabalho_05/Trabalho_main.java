package trabalho_05;

public class Trabalho_main {

	public static void main(String[] args) {

		Cliente cliente01 = new Cliente("03510400902", 1985, "Ana maria Marques", "aninha@gmail.com",new Conta(1845, 4000));

		Endereco end01 = new Endereco();
		end01.setRua("Rua Professor José de Oliveira");
		end01.setNumero(425);
		end01.setBairro("Vila Nova Conceição");
		end01.setCep("04215-001");
		end01.setCidade("São Paulo");
		end01.setEstado("São Paulo");
		cliente01.setEnd(end01);

		System.out.println(cliente01.toString());
		
		Cliente cliente02 = new Cliente("03598268790", 1990, "João Cunha", "cunha@gmail.com", new Conta(3325,1200.00));

		Endereco end02 = new Endereco();
		end02.setRua("Rua Joaquim Távora");
		end02.setNumero(486);
		end02.setBairro("Centro");
		end02.setCep("60010-120");
		end02.setCidade("Fortaleza");
		end02.setEstado("Ceará");
		cliente02.setEnd(end02);
		
		System.out.println(cliente02.toString());
	}

}
