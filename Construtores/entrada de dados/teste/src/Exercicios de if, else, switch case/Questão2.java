package Comparadores;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número:");

		int x = scanner.nextInt();

		if (x % 2 == 0) {

			System.out.println("O numero é par");

		} else {
			System.out.println("O número é impar");
			
			scanner.close();
		}
	}

}
