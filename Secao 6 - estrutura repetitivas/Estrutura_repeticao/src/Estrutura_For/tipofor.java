package Estrutura_For;

import java.util.Scanner;

public class tipofor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int soma = 0;

		System.out.println("Teste");

		int valor = scanner.nextInt();

		while (valor != 55) {
			soma = valor + valor;
			System.out.println("Digite outro valor");
			 valor = scanner.nextInt();
		}

		System.out.printf("Digite o valor " + soma);

		scanner.close();

	}
}
