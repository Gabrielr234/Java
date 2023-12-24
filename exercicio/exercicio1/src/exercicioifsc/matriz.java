package exercicioifsc;

import java.util.Locale;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fazer um programa para ler um número interiro N e uma matriz de ordem N
		 * contendo numeros inteiros Em seguida, mostrar a diagonal principal e a
		 * qualidade de valores nagativos da matriz
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal :");

		for (int i = 0; i < n; i++) {
			System.out.println(mat[i][i] + "");
		}

		System.out.println();

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println("negative numbers: = " + count);
		sc.close();

	}
}