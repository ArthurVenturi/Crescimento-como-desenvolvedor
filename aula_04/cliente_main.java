package aula_04;

import java.util.Scanner;

public class cliente_main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();
		System.out.println("Digite o nome do Cliente 1");
		cliente1.nome = ler.next();
		
		System.out.println(); //Limbar o buffer.
		
		System.out.println("Digite o CPF do Cliente 1");
		cliente1.cpf = ler.next();
		
		System.out.println(); //Limbar o buffer.
		
		System.out.println("Digite o Ano de Nascimento do Cliente 1" + "/n");
		cliente1.anoNascimento = ler.nextInt();
		
		System.out.println(); //Limbar o buffer.
		
		Conta conta1 = new Conta();
		System.out.println("Digite numero da conta do Cliente 1");
		conta1.numero = ler.nextInt();
		
		System.out.println("Digite o saldo da conta do Cliente 1" +"\n");
		conta1.saldo = ler.nextDouble();
		
		Cliente cliente2= new Cliente();
		System.out.println("Digite o nome do Cliente 2");
		cliente2.nome = ler.next();
		
		System.out.println(); //Limbar o buffer.
		
		System.out.println("Digite o CPF do Cliente 2");
		cliente2.cpf = ler.next();
		
		System.out.println(); //Limbar o buffer.
		
		System.out.println("Digite o Ano de Nascimento do Cliente 2");
		cliente2.anoNascimento = ler.nextInt();
		
		System.out.println(); //Limbar o buffer.
		
		System.out.println("Digite o Email do Cliente 2");
		cliente2.email = ler.next();
		
		Conta conta2 = new Conta();
		System.out.println("Digite numero da conta do Cliente 2");
		conta2.numero = ler.nextInt();
		
		System.out.println("Digite o saldo da conta do Cliente 2" +"\n");
		conta2.saldo = ler.nextDouble();
		
		System.out.println("Cliente 1 "+cliente1.toString() +"/n");
		System.out.println("Conta 1" +conta1.toString() +"/n");
		
		System.out.println(cliente2.toString() +"/n");
		System.out.println(conta2.toString() +"/n");
		
		System.out.println("insira o valor para debitar o Saldo da conta 1");
		 double credito = ler.nextDouble();
		 
		 conta1.debitarsaldo(credito);
		
		System.out.println("Conta 1" +conta1.toString() +"/n");
			
		System.out.println("insira o valor para creditar o Saldo da conta 2");
		 credito = ler.nextDouble();
		 
		 conta2.creditarSaldo(credito);
		 
		 System.out.println("Conta 2" +conta1.toString() +"/n");
		 
		 if (conta1.saldo > conta2.saldo) {
			 System.out.println("A conta 1 do Cliente 1 possui a conta com o maior saldo: "+conta1.saldo);
			 
		 }
		 else if (conta1.saldo == conta2.saldo) {
			 System.out.println("A conta 1 do Cliente 1 tem o mesmo saldo da conta 2 do Cliente 2: "+conta1.saldo + "Conta 2: "+conta2.saldo);
		 }
		 else {
			 System.out.println("A conta 2 do Cliente 2 possui a conta com o maior saldo: "+conta2.saldo);
		 }
		
		
		/*Cliente cliente_01 = new Cliente();
		
		cliente_01.cpf = "02850435902";
		cliente_01.anoNascimento = 1980;
		cliente_01.nome = "Marcos da Rocha Souza";
		cliente_01.email ="mr_spuza@gmail.com";
		
		Conta conta_01 = new Conta();
		
		conta_01.numero = 1521;
		conta_01.saldo = 750.63;
		
		Cliente cliente_02 = new Cliente();
		
		cliente_02.cpf = "04564238906";
		cliente_02.anoNascimento = 1985;
		cliente_02.nome = "Ana Maria Machado";
		cliente_02.email = "aninha@gmail.com";
		
		Cliente cliente_03 = new Cliente();
		
		cliente_03.cpf = "04564238906";
		cliente_03.anoNascimento = 1975;
		cliente_03.nome = "Pedro de Alcantara";
		cliente_03.email = "pedro_75@gmail.com";
		
		Cliente cliente_04 = new Cliente();
		
		cliente_04.cpf = "03289078908";
		cliente_04.anoNascimento = 1977;
		cliente_04.nome = "Pedro Andre Macondess";
		cliente_04.email = "pedro@gmail.com";
		
		cliente_01.mostrarCliente();
		cliente_02.mostrarCliente();
		cliente_03.mostrarCliente();
		cliente_04.mostrarCliente();
		*/
		ler.close();
	}

}
