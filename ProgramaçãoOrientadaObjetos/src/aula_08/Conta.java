package aula_08;

//8)
public class Conta {

	private int numero;
	private double saldo;

	public Conta() {

	}

	public Conta(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}

	//8.4)
	//public boolean equals(Object obj) 
	
	//8.5)
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Conta other = (Conta) obj;
		return numero == other.numero;
	}

	/*8.5) diferente jeito para a execução do mesmo código para o método equals.
	public boolean equals(Object obj) {
		boolean iguais;

		Conta recebida = (Conta) obj;
		
		if (this.numero == recebida.numero) {
			return true;
		}
		else {
			return false;
		}
	}*/

}
