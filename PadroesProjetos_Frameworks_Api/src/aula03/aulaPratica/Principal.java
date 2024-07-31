package aula03.aulaPratica;

public class Principal {

	public static void main(String[] args) {
	
		Display.valor = 10;
		Display.mostra();
		
		Display disp = new Display();
		disp.incrementarValor();
		disp.incrementarValor();
		disp.incrementarValor();
		Display.mostra();
		
		Display disp2 = new Display();
		disp2.incrementarValor();
		disp2.incrementarValor();
		disp2.incrementarValor();
		Display.mostra();
		
		/*importante para entender o Singleton – construtor private
		Não é possível instanciar um objeto se o construtor for private
		07) Crie a classe Controlador, com um atributo velocidade. Inclua também o método construtor definido como private*/
	
		//Controlador contr = new Controlador();
		
	}

}
