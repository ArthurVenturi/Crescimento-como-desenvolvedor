package fila;

import java.util.ArrayList;

public class Fila {

	private ArrayList<Cliente> fila = new ArrayList<Cliente>();
	
	public void incluir(Cliente cli) {
		fila.add(cli);
	}

	public Cliente retirar() {
		
		Cliente cli = fila.remove(0);
		
		return cli;
	}

	public void limpar() {
		fila.clear();
	}
	
	public ArrayList<Cliente> mostrar() {
		
		return fila;
	}
	
	public int Quantidade() {
		
		return fila.size();
	}
	
	public int pesquisa(int op) {
		
		int posicao = 0;
		
		for(Cliente cli : fila) {
			
			if(cli.getCodigo() == op) {
				
				posicao = fila.indexOf(cli) + 1;
				break;
			}
		}
		
		return posicao;
		
	}

}
