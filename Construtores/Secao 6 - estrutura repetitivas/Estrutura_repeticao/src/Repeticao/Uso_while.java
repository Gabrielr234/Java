package Repeticao;

import java.util.Scanner;

public class Uso_while {

	public static void main(String[] args) {

		/*
		 * Enquanto o usuário não digitar 0 somar os valores digitados. Ao final mostrar
		 * a soma dos valores.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um número:");

		int x = scanner.nextInt();

		int soma = 0;

		while (x != 0) {
			soma = soma + x;
			x = scanner.nextInt();
		}

		System.out.println("Os numeros somados foram: " + soma);

		scanner.close();
	}

}
