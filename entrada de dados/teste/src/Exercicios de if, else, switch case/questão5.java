package Comparadores;

import java.util.Locale;
import java.util.Scanner;

public class questão5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		double total;

		System.out.println("Informe o código do item:");

		int code = scanner.nextInt();

		System.out.println("Informe a quantidade do item:");

		int qtd = scanner.nextInt();

		if (code == 1) {
			total = qtd * 4.0;

		}

		else if (code == 2) {
			total = qtd * 4.50;
		}

		else if (code == 3) {
			total = qtd * 5.0;
		}

		else if (code == 4) {
			total = qtd * 2.0;

		}

		else {
			total = qtd * 1.50;
		}

		System.out.printf("Total: R$ %.2f%n", total);

		scanner.close();
	}

}
