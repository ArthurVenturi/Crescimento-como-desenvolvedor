package aula_10;

public class Principal {

	public static void main(String[] args) {
		
		Poupanca poup01 = new Poupanca(1789, 756.90, 15);
		
		System.out.println(poup01.toString());
		
		Poupanca poup02 = new Poupanca();
		poup02.setNumero(12174);
		poup02.setSaldo(241.95);
		poup02.setAniversario(02);
		
		System.out.println(poup02.toString());
		
		Especial espec01 = new Especial(3441, 10522.00, 50000.00);
		
		System.out.println(espec01.toString());
		
		Especial espec02 = new Especial();
		espec02.setNumero(2049); 
		espec02.setSaldo(5840.05); 
		espec02.setLimite(7000.00);
		
		System.out.println(espec02.toString());
		
		poup01.debitarSaldo(110.00);
		
		if(poup01.debitarSaldo(110.00)) {
			System.out.println("\n Valor debitado");
		}
		else {
			System.out.println("\n Valor não debitado devido a falta de saldo");
		}
		
		System.out.println(poup01.toString());
		
		if(espec01.debitarSaldo(50000.00)) {
			System.out.println("\n Valor debitado");
		}
		else {
			System.out.println("\n Valor não debitado devido a falta de saldo");
		}
		
		System.out.println(espec01.toString());
		
		System.out.println("-----------------------------------------------------------------------");
		
		/*não faz sentido instanciar o objeto prod. Mas é permitido. Após classificar a classe Produto 
		 não é permitido estanciar objetos do tipo Produto
		Produto prod = new Produto(1, 15.06);*/
		
		Livro liv = new Livro(2, 36.41, "Machado de Assis", "Editora Beta", 132);
	
		Midia mid = new Midia(3, 9.90, "Metalica");
		
		System.out.println(liv.toString());
		System.out.println(mid.toString());
		
		System.out.println(liv.calculaFrete());
		System.out.println(mid.calculaFrete());
		
		
		
		
	}

}
