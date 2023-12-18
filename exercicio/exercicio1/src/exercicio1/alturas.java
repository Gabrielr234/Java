package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão armazenadas");
		int numerodepessoa = sc.nextInt();

		String[] nomes = new String[numerodepessoa];
		int[] idade = new int[numerodepessoa];
		double[] altura = new double[numerodepessoa];

		for (int i = 0; i < numerodepessoa; i++) {
			System.out.println("Digite o nome da pessoa" + (i + 1) + ":");
			nomes[i] = sc.next();

			System.out.println("digite a idade da pessoa" + (i + 1) + ":");
			idade[i] = sc.nextInt();
			sc.nextLine();

			System.out.println("Digite a altura da pessoa " + (i + 1) + "(em metros)");
			altura[i] = sc.nextDouble();
			sc.nextLine();
		}
		double soma = 0.0;
		for (int i = 0; i < numerodepessoa; i++) {
			soma = soma + altura[i];
		}
		double mediaalturas = soma / numerodepessoa;

		System.out.println();
		System.out.printf("Altura média:%.2fn", mediaalturas);
		int cont = 0;
		for (int i = 0; i < numerodepessoa; i++) {
			if (idade[i] < 16) {
				cont = cont + 1;
			}
		}

		double percent = cont * 100.0 / numerodepessoa;

		System.out.printf("Pessoa com menos de 16 anos:%.1f%%%n", percent);

		for (int i = 0; i < numerodepessoa; i++) {
			if (idade[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}

}
