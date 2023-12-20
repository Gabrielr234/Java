package exercicioifsc;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média
		 * dos números 4, 5 e 6. A soma das duas médias. A média das médias.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade");

		int quantidade = sc.nextInt();

		double soma = 0;

		for (int i = 1; i <= quantidade; i++) {
			System.out.println("digite um numero" + i + ":");

			double numero = sc.nextDouble();
			soma += numero;
		}

		double media = soma / quantidade;

		System.out.println("A media dos numeros é:" + media);

		sc.close();
	}
}
