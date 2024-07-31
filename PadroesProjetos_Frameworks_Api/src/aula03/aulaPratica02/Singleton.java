package aula03.aulaPratica02;

public class Singleton {
	
	private static Singleton instancia;
	
	private Singleton() {
		
	}

	public static Singleton getInstancia() {
		
		if(instancia == null) {
			instancia = new Singleton();
		}
		
		return instancia;
	}

	public static void setInstancia(Singleton instancia) {
		Singleton.instancia = instancia;
	}
	
	

}
