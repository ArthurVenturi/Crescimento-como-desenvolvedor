package aula_04;

public class Circulo {
	
	public Double raio;
	public int x;
	public int y;
	public String cor;
	
	/*
	public double Cauculararea() {
		return 3.1415 * (this.raio * this.raio);
	}
	*/
	
	public double Cauculararea() {
		return 3.1415 * Math.pow(raio, 2);
	}
	
	public void moveCirculo(int novo_x, int novo_y) {
		this.x = novo_x;
		this.y = novo_y;
	}
}