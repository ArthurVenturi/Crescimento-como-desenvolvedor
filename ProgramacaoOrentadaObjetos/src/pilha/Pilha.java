package pilha;

import java.util.ArrayList;

public class Pilha {

	private ArrayList<Endereco> historico = new ArrayList<Endereco>();
	
	public void incluir(Endereco end) {
		
		historico.add(end);
	}
	
	public Endereco retirar() {
		
		return historico.remove(0);
	}
	
	public ArrayList<Endereco> mostrar(){
		
		return historico;
	}
	
	public void limpar() {
		
		historico.clear();
	}
}
