package trabalho_Interface;

public class Triangulo implements Figura {

	
	 double  lado;
		
	public Triangulo(double lado) {
		this.lado = lado;
	}
	
	    
	    public String getNomeFigura() {
	        return "Triangulo ";
	    }

	    public double getArea() {
	    	return (Math.sqrt (3) / 4) * (lado * lado);          

	    }

	    public double getPerimetro() {
	        return 3 * lado;
	        		
	    }
	}
	



