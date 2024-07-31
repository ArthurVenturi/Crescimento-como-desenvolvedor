package trabalho_Interface;

public class Principal {
	public static void main(String[] args) {

		Figura triang = new Triangulo(4);
		Figura quadr = new Quadrado(5);
		Figura hexa = new Hexagono(2);
		Figura retan = new Retangulo(2, 4);

		System.out.println("Nome" + triang.getNomeFigura());
		System.out.println("Area " + triang.getArea());
		System.out.println("Perimetro " + triang.getPerimetro());
		
		System.out.println("\n");

		System.out.println("Nome " + quadr.getNomeFigura());
		System.out.println("Area " + quadr.getArea());
		System.out.println("Nome " + quadr.getPerimetro());
		
		System.out.println("\n");

		System.out.println("Nome " + hexa.getNomeFigura());
		System.out.println("Area " + hexa.getArea());
		System.out.println("Perimetro " + hexa.getPerimetro());
		
		System.out.println("\n");

		System.out.println("Nome " + retan.getNomeFigura());
		System.out.println("Area " + retan.getArea());
		System.out.println("Perimetro " + retan.getPerimetro());

	}
}
