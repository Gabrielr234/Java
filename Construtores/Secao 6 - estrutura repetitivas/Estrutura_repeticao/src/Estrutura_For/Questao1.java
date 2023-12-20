package Estrutura_For;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");

		int x = scanner.nextInt();

		System.out.println("Números impares de 1 até" + x + ":");

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		scanner.close();
	}

}
