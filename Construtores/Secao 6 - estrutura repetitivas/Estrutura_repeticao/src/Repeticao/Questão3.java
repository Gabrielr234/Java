package Repeticao;

import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int alcool = 0;
		int diesel = 0;
		int gasolina = 0;

		System.out.println("Informe um produto:");

		int produto = scanner.nextInt();

		while (produto != 4) {

			if (produto == 1) {
				alcool = alcool + 1;
			}

			else if (produto == 2) {
				gasolina = gasolina + 1;
			}

			else if (produto == 3) {
				diesel = diesel + 1;
			}

			System.out.println("Informe outro produto:");

			produto = scanner.nextInt();

		}

		System.out.println ("Muito obrigado!");
		System.out.println("Alcool :" + alcool);
		System.out.println("Gasolina :" + gasolina);
		System.out.println("Diesel " + diesel);

		scanner.close();
	}

}
