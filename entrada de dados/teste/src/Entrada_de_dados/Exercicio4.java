package Entrada_de_dados;

import java.util.Scanner;

import java.util.Locale;

public class Exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int id, ht;

		double vr, s;

		System.out.println("Informe o número do funcionario:");

		id = scanner.nextInt();

		System.out.println("Informe as horas trabalhadas");

		ht = scanner.nextInt();

		Locale.setDefault(Locale.US);

		System.out.println("Informe o valor recebido");

		vr = scanner.nextDouble();

		s = ht * vr;

		System.out.println("Numero do funcionario " + id);

		System.out.printf("O funcionario numero:%d,tem o salario de %.2f%n", id, s);

		scanner.close();
	}

}
