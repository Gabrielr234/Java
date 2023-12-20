package exercicioifsc;

import java.util.Locale;
import java.util.Scanner;

import entities.idadeemdia;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
		 * dias
		 * 
		 * mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês
		 * com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
		 */

		System.out.println("Informe o ano:");

		int ano = sc.nextInt();

		System.out.println("informe o mes:");

		int mes = sc.nextInt();

		System.out.println("informe o dia:");

		int dia = sc.nextInt();

		int calculo = idadeemdia.calculaidadeemdia(mes, ano, dia);

		System.out.println("Idade em dias: " + calculo + " dias");

	}
}
