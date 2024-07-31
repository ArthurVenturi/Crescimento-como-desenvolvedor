package aula02.Trabalho;

public class Principal {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro(1, 1000, "Machado de Assis", "Editora Beta", 132);
		
		Midia midia1 = new Midia(2, 500, "Metalica");
		
		livro1.darDesconto(10);
		midia1.reajustarPreco(20);
		
		System.out.println(livro1.toString() + "\n");
		System.out.println(midia1.toString());
		
		//2.3) Deverá utilizar a classe abstract para melhor prática de Orientação a Objetos
		
		/*2.4) Aparecerá erros nas classes que herdam a classe produto. Onde exige que os métodos criados 
		com abstract deve ser criando em todas as classes derivadas pela classe pai.*/

	}

}
