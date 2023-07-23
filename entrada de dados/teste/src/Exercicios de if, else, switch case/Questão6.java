package Comparadores;

import java.util.Scanner;

import java.util.Locale;

public class Questão6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double valor;

		System.out.println("Informe um valor:");

		valor = scanner.nextDouble();

		if (valor < 0.0 || valor > 100.0) {
			System.out.println("Fora do intervalo)");
		}

		else if (valor <= 25.0) {
			System.out.println("O intervalo esta entre (0,25)");
		}

		else if (valor <= 50.0) {
			System.out.println("O intervalo esta entre (25,50)");
		}

		else if (valor <= 75.0) {
			System.out.println("O intervalo esta entre (50,75)");
		}

		else {
			System.out.println("intevalor (75,100)");
		}

		scanner.close();
	}

}
