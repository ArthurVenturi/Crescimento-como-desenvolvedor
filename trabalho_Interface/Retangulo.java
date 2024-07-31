package trabalho_Interface;

public class Retangulo implements Figura {
	
     double base;
     double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public String getNomeFigura() {
        return "Retangulo";
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return 2 * (base + altura);
    }
}
