package Comparadores;

import java.util.Locale;
import java.util.Scanner;

public class Atribuiçao_cumulativa {

	public static void main(String[] args) {

		/*
		 * Question:
		 * 
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico. que dá direito
		 * a 100 minutos de telefone, cada minutoss que execede a franquia de 100
		 * minutos custa R$ 2.00. fazer um programa para ler a quantidade de minutos que
		 * uma pessoa consumiu, no final mostrar o valor a ser pago.
		 * 
		 */

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a quantidade de minutos:");

		int minutos = scanner.nextInt();

		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}

		System.out.printf("Valor total a pagar: %.2f%n", conta);
		scanner.close();
	}

}
