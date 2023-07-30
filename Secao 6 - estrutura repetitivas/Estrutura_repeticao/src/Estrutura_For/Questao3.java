package Estrutura_For;

import java.util.Locale;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número de casos de teste N:");
		int N = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Digite o primeiro valor:");
			double valor1 = scanner.nextDouble();
			System.out.println("Digite o segundo valor:");
			double valor2 = scanner.nextDouble();
			System.out.println("Digite o terceiro valor:");
			double valor3 = scanner.nextDouble();

			double mediaPonderada = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10.0;
			System.out.printf("Media podenderada: %.1f%n ", mediaPonderada);
		}
		scanner.close();
	}

}
