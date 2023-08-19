package entities;

import entities.Conta_bancaria;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Conta_bancaria contaBancaria; // Renomeado para seguir convenção de nomenclatura

		System.out.println("Enter account number:");
		int numeroconta = scanner.nextInt();

		System.out.println("informe o responsável pela conta:");
		scanner.nextLine();
		String nometitular = scanner.nextLine();

		System.out.println("deseja iniciar com um deposito inicial? (S/N)");
		char response = scanner.next().charAt(0);

		if (response == 's') {
			System.out.println("Informe o valor inicial");
			double depositoinicial = scanner.nextDouble();
			contaBancaria = new Conta_bancaria(numeroconta, nometitular, depositoinicial);
		} else {
			contaBancaria = new Conta_bancaria(numeroconta, nometitular);
		}

		System.out.println();
		System.out.println("Conta data:");
		System.out.println(contaBancaria);

		System.out.println();

		System.out.print("informe o valor para deposito");
		double valordeposito = scanner.nextDouble();
		contaBancaria.depositar(valordeposito);

		System.out.println("Atualizações da conta:");
		System.out.println(contaBancaria);

		System.out.println();

		System.out.println("Informe o valor para saque");
		double valorsaque = scanner.nextDouble();
		contaBancaria.sacar(valorsaque);
		System.out.println("Atualizações da conta:");
		System.out.println(contaBancaria);

		scanner.close();
	}
}
