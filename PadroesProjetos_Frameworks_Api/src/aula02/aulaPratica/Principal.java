package aula02.aulaPratica;

public class Principal {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto(1010, 1000);
		
		Livro livro1 = new Livro(1015,  1000, "Carlos Almeida", "Leis", 128);
		
		Midia midia1 = new Midia(1054, 1000, "Roberto Carlos");
		
		System.out.println(produto1.toString());
		System.out.println(livro1.toString()); 
		System.out.println(midia1.toString()); 
		
		Livro livro2 = new Livro(1045, 350, "Vidas Secas", "Leitura", 238);
		
		Midia midia2 = new Midia(1824, 45, "Paula fernandes");
		
		livro1.darDesconto(10);
		livro2.reajustarPreco(20);
		midia1.darDesconto(15);
		midia2.reajustarPreco(30);
		
		System.out.println(livro1.getPreco());
		System.out.println(livro2.getPreco());
		System.out.println(midia1.getPreco());
		System.out.println(midia2.getPreco());
	}

}
