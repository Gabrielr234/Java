package Comparadores;

import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor de A:");

		int a = scanner.nextInt();

		System.out.println("Digite o valor de B:");

		int b = scanner.nextInt();

		if (a % b == 0 || b % a == 0) {

			System.out.println("Numero são multiplos");

		} else {

			System.out.println("número não multiplos");
			
			scanner.close();
		}

	}

}