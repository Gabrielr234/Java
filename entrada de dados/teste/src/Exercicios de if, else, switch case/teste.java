package Comparadores;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um valor");

		int x = scanner.nextInt();

		if (x % 2 == 0) {
			System.out.println("Numero par");

		} else {
			System.out.println("Numero impar");
		}
	}

}
