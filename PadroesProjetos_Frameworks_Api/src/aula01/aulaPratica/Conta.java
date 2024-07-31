package aula01.aulaPratica;

public class Conta extends Cliente{

    private int numero;
    private double saldo;

    public Conta(){

    }

    public Conta(int numero, double saldo) {
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

    public void debitaSaldo(double novo_saldo){
        this.saldo -= novo_saldo;
    }

    public void creditaSaldo(double novo_Saldo){
        this.saldo += novo_Saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
