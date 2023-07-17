package Entrada_de_dados;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a, b, c, d, dif;

		System.out.println("Informe o valor de a:");

		a = scanner.nextInt();

		System.out.println("Informe o valor de b:");

		b = scanner.nextInt();

		System.out.println("Informe o valor de c:");

		c = scanner.nextInt();

		System.out.println("Informe o valor de d:");

		d = scanner.nextInt();

		dif = a * b - c * d;

		System.out.printf("A diferença pelo pelo produto a e b pelo produto c e d é: " + dif);

		scanner.close();

	}

}
