package Estrutura_For;

import java.util.Scanner;

public class Questão7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número:");

		int x = scanner.nextInt();

		for (int i = 1; i <= x; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		scanner.close();
	}

}
