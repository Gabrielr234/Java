package Repeticao;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		int soma = 0; 
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um número:");
		int numero = scanner.nextInt();

		while (numero != 5) {
			System.out.println("Informe outro numero");
			soma = soma + numero; 
			numero = scanner.nextInt();
		}
		System.out.printf("A soma total dos numeros digitados foi: %d",soma);

		scanner.close();

	}

}
