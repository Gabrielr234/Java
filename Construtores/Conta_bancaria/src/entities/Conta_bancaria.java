package entities;

public class Conta_bancaria {

	private int numeroconta;
	private String nometitular;
	private double saldo;

	public Conta_bancaria(int numeroconta, String nometitular) {
		this.numeroconta = numeroconta;
		this.nometitular = nometitular;
	}

	public Conta_bancaria(int numeroconta, String nometitular, double depositoinicial) {
		this.numeroconta = numeroconta;
		this.nometitular = nometitular;
		depositar(depositoinicial);
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public String getNometitular() {
		return nometitular;
	}

	public void setNometitular(String nometitular) {
		this.nometitular = nometitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor + 5.0;
	}

	public String toString() {
		return "Número da conta: " + numeroconta + "\n" + "Nome do titular: " + nometitular + "\n" + "Saldo atual: "
				+ saldo;
	}
}
