package trabalho_Interface;

public class Hexagono implements Figura {
	
     double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    public String getNomeFigura() {
        return "Hexagono";
    }

    public double getArea() {
        return (3 * Math.sqrt(3) * (lado * lado)) / 2;
    }

    public double getPerimetro() {
        return 6 * lado;
    }
}