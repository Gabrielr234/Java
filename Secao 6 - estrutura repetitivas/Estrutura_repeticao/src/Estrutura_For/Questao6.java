package Estrutura_For;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um valor:");

		int numero = scanner.nextInt();

		System.out.println("Dividores de" + numero + ":");

		for (int i =1; i <=numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}

		scanner.close();
	}

}
