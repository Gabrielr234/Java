package Repeticao;

import java.util.Scanner;

public class Questao2 {

	/*
	 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
	 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
	 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
	 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
	 * alguma).
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Digite uma coordenada x (ou nula para sair)");
			int x = scanner.nextInt();

			if (x == 0) {
				break;
			}

			System.out.println("Digite uma coordenada y (ou nula para sair)");

			int y = scanner.nextInt();

			if (x == 0) {
				break;
			}

			if (x > 0 && y > 0) {
				System.out.println("O ponto (" + x + "," + y + ") pertence ao primeiro quadrante.");
			} else if (x < 0 && y > 0) {
				System.out.println("O ponto (" + x + "," + y + ") pertence ao segundo quadrante.");
			} else if (x < 0 && y < 0) {
				System.out.println("O ponto (" + x + "," + y + ") pertence ao terceiro quadrante.");
			} else if (x > 0 && y < 0) {
				System.out.println("O ponto (" + x + "," + y + ") pertence ao quarto quadrante.");
			} else {
				System.out.println("O ponto (" + x + "," + y + ") está no eixo X ou Y.");
			}

		}
		scanner.close();
	}
}
