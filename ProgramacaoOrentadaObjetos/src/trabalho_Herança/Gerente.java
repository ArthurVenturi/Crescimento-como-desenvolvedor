package trabalho_Herança;

public class Gerente  extends Empregado{

	private double salario;

	public Gerente(String nome, String email, int anoContratacao, double salario) {
		super(nome, email, anoContratacao);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double ganha() {
		
		return this.salario;
	}

	@Override
	public String toString() {
		return "Gerente [salario=" + salario + ", getNome()=" + getNome() + ", getEmail()=" + getEmail()
				+ ", toString()=" + super.toString() + ", tempoCasa()=" + tempoCasa() + "]";
	}
	
}
