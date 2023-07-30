package Estrutura_For;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o total de números N pares a serem lidos");

		int N = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Digite o primeiro número:");
			double num1 = scanner.nextDouble();

			System.out.println("Digite o segundo número:");

			double num2 = scanner.nextDouble();

			if (num2 != 0) {
				double resultado = num1 / num2;

				System.out.println("Resultado da divisão " + resultado);
			} else {
				System.out.println("Divisão impossivel");
			}
		}
		scanner.close();
	}

}
