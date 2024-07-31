package trabalho_Herança;

public class Principal {

	public static void main(String[] args) {
		
		/*Empregado antonio = new Empregado("Antonio Silva", "silva@gmail.com"); 
		 
		 não pode ser instanciado por conta de ser uma classe abstract, 
		 se não tivese poderia ser intanciado*/
		
		Gerente antonio = new Gerente("Antonio Silva", "silva@gmail.com",2023, 13450.0);
		
		System.out.println(antonio.toString());
		System.out.println(antonio.ganha());
		
		PorComissao jose = new PorComissao("Jose Macedo","macedo@gmail.com", 1999,  2500.00, 159.0, 20);
		
		System.out.println(jose.toString());
		System.out.println(jose.ganha());
		
		PorItem marcos = new PorItem("marcos prestes", "prestes@gmail.com", 1899, 2500.00, 300);
		
		System.out.println(marcos.toString());
		System.out.println(marcos.ganha());
		
		PorHora joel = new PorHora("joel guimaraes", "joel@gmail.com",2002, 120.00, 220);
		
		System.out.println(joel.toString());
		System.out.println(joel.ganha());
		
	}

}
