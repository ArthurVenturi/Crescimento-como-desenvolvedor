package trabalho_Interface;


public class Quadrado implements  Figura {

	 double  lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	    
	    public String getNomeFigura() {
	        return "Quadrado";
	    }

	    public double getArea() {
	    	
	        return lado * lado;
	    }

	    public double getPerimetro() {
	        return 4 * lado;
	    }
	}
	

