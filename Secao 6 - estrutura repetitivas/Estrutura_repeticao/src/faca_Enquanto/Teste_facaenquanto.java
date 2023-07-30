package faca_Enquanto;

import java.util.Scanner;

import java.util.Locale;

public class Teste_facaenquanto {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler uma temperatura em celsius e mostrar o equivalente
		 * em fahrenheit.perguntar se o usuário deseja repetir (s/n).caso o usuário
		 * digite "S", repetir o programa.
		 */

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		char resposta;
		do {

			System.out.print("Digite a temperatura em graus Celsius: ");
			double celsius = scanner.nextDouble();

			double fahrenheit = (celsius * 9 / 5) + 32;

			System.out.println("A temperatura em Fahrenheit é:" + fahrenheit);

			System.out.print("deseja repetir (S/N):");
			resposta = scanner.next().charAt(0);
		} while (resposta == 'S' || resposta == 's');

		scanner.close();
	}

}
