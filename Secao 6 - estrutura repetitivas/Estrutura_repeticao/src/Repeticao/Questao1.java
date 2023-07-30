package Repeticao;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite uma senha");

		int senha = scanner.nextInt();

		while (senha != 2022) {
			System.out.println("Acesso negado .-.");

			System.out.println("Tente uma senha novamente");

			senha = scanner.nextInt();
		}

		System.out.println("Acesso liberado");

		scanner.close();

	}

}
