package aula_05;

public class main_cliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(); // instanciar um novo

		/*
		 * cliente1.cpf = "02850435902"; cliente1.anoNascimento = 1980; cliente1.nome =
		 * "Marcos da Rocha Souza"; cliente1.email = "mr_spuza@gmail.com";
		 */

		cliente1.setCpf("02850435902");
		cliente1.setAnoNascimento(1980);
		cliente1.setNome("Marcos da Rocha Souza");
		cliente1.setEmail("mr_souza@gmail.com");

		Cliente cliente4 = new Cliente("04265879069", 1988, "Maria Silva", "silva@gmail.com");

		/*Cliente cliente2 = new Cliente("03510400902", 1985, "Ana Clara Marques", "aninha@gmail.com");

		Cliente cliente3 = new Cliente("04564238906", 1975, "Pedro de Alcantara");*/

		if (cliente1.getAnoNascimento() > cliente4.getAnoNascimento()) {
			System.out.println("Cliente 1 entre o cliente 4 é o mais novo: " + cliente1.toString() + "\n");

		} else {
			System.out.println("Cliente 4 entre o cliente 1 é o mais novo: " + cliente4.toString() + "\n");
		}
		System.out.println("Cliente 4 e seu respectivo nome e seu ano de Nascimento : " + cliente4.getNome() + " " + cliente4.getAnoNascimento());

		/*
		 * System.out.println("Cliente 1: "+cliente1.toString() + "\n");
		 * System.out.println("Cliente 2: "+cliente2.toString() + "\n");
		 * System.out.println("Cliente 3: "+cliente3.toString() + "\n");
		 * System.out.println("Cliente 4: "+cliente4.toString() + "\n");
		 */
	}

}
