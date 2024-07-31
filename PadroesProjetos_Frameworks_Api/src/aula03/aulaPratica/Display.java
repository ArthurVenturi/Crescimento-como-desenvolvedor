package aula03.aulaPratica;

public class Display {
	
	public static int valor;
	
	public static int getValor() {
		return valor;
	}

	public static void setValor(int valor) {
		Display.valor = valor;
	}

	public static void mostra() {
		System.out.println(valor);
	}

	public void incrementarValor() {
		valor = valor + 1;
	}
	
	public void descrementarvalor() {
		valor = valor - 1;
	}
}
