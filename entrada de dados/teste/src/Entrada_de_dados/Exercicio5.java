
package Entrada_de_dados;

import java.util.Scanner;

import java.util.Locale;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		int cod1, np1, cod2, np2;

		double vu1, vu2, vt;

		System.out.println("Informe o codigo da peça1:");

		cod1 = scanner.nextInt();

		System.out.println("Informe a quantidade de peças::");

		np1 = scanner.nextInt();

		System.out.println("Informe o valor unitario:");

		vu1 = scanner.nextDouble();

		System.out.println("Proxima peça.");

		System.out.println("Informe o codigo da peça2:");

		cod2 = scanner.nextInt();

		System.out.println("Informe a quantidade de peças do item 2:");

		np2 = scanner.nextInt();

		System.out.println("Informe o valor unitario:");

		vu2 = scanner.nextDouble();

		vt = vu1 * np1 + vu2 * np2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", vt);

		scanner.close();
	}
}
