package Comparadores;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número:");

		int x = scanner.nextInt();

		if (x < 0) {

			System.out.println("Numero negativo");
		} else {

			System.out.println("não negativo");

			scanner.close();
		}

	}

}
