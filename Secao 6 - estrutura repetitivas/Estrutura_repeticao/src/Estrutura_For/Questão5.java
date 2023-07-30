package Estrutura_For;

import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor de N:");

		int N = scanner.nextInt();
		int fatorial = 1;

		for (int i = 1; i <= N; i++) {
			fatorial = fatorial * i;
		}

		System.out.println(fatorial);

		scanner.close();
	}

}
