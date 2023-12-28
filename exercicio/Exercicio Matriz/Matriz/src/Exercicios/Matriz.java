package Exercicios;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		/*
		 * Gere e imprima uma matriz M 4x 4 com valores aleatorios entre 0 -9. Após isso
		 * determine o maior numero da matriz e a sua posição (linha, coluna)
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[4][4];

		preencherMatriz(matriz);

		imprimirmatriz(matriz);
		definirMaiorNumero(matriz);
	}

	private static void preencherMatriz(int[][] matriz) {

		Random random = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = random.nextInt();
			}
		}
	}

	private static void imprimirmatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j] + "");
			}
			System.out.println();
		}
	}

	private static void definirMaiorNumero(int[][] matriz) {
		int maiorNumero = matriz[0][0];
		int posicaoLinha = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maiorNumero) {
					maiorNumero = matriz[i][j];
					posicaoLinha = i;
				}
			}
		}
		System.out.println("O maior numero é: " + maiorNumero);
		System.out.println("Posicao na linha é: " + posicaoLinha);
	}

}