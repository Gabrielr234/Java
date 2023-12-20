package Comparadores;

import java.util.Scanner;

public class Switch_case_teste {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String dia = "";

		System.out.println("Informe o dia da semana:");

		int x = scanner.nextInt();

		switch (x) {
		case 1:
			dia = "segunda";

			break;

		case 2:
			dia = "Terça";
			break;

		case 3:
			dia = "quarta";
			break;

		case 4:

			dia = "Quinta";
			break;

		case 5:

			dia = "Sexta";
			break;

		case 6:
			dia = "Sábado";
			break;

		case 7:

			dia = "domingo";
			break;

		default:
			dia = "dia não existe";
		}

		System.out.println("O dia da semana : " + dia);

		scanner.close();

	}
}
