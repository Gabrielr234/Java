package Comparadores;

import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a hora inicial:");

		int horainicio = scanner.nextInt();

		System.out.println("Informe a hora Final:");

		int horafinal = scanner.nextInt();

		int duracao;

		if (horainicio < horafinal) {
			duracao = horafinal - horainicio;
		} else {
			duracao = 24 - horainicio + horafinal;
		}

		System.out.println("O jogo durou :" + duracao + "Horas");

		scanner.close();

	}

}
