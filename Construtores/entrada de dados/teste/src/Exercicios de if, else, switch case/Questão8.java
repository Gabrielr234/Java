package Comparadores;

import java.util.Scanner;

import java.util.Locale;

public class Questão8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double salario;

		double imposto;
		System.out.println("Informe o seu salario mensal:");
		salario = scanner.nextDouble();

		if (salario <= 2000.0) {
			imposto = 0.0;
		}

		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;

		}

		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}

		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento de imposto de renda");
		}

		else {
			System.out.printf("Valor total de imposto sobre o salário: R$ %.2f%n", imposto);
		}
		scanner.close();

	}

}
