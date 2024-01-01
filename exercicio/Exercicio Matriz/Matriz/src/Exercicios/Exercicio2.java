package Exercicios;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * gere e imprima uma matriz M 10 x 10 com valores aleatorios entre 0-9 após
		 * isso indique qual o maior eo menor valor da linha 5 e qual o maior e o menor
		 * valor da coluna 7
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	

		
		public void gerarMatriz(int[][] matriz) {
		    Random random = new Random();
		    for (int i = 0; i < matriz.length; i++) {
		        for (int j = 0; j < matriz[i].length; j++) {
		            matriz[i][j] = random.nextInt();
		        }
		    }

		    int linha5 = 4;

		    int maiorValorLinha5 = matriz[linha5][0];
		    int menorValorLinha5 = matriz[linha5][0];

		    for (int i = 1; i < matriz[linha5].length; i++) {
		        if (matriz[linha5][i] > maiorValorLinha5) {
		            maiorValorLinha5 = matriz[linha5][i];
		        }
		        if (matriz[linha5][i] < menorValorLinha5) {
		            menorValorLinha5 = matriz[linha5][i];
		        }
		    }

		    System.out.println("Maior valor na linha 5: " + maiorValorLinha5);
		    System.out.println("Menor valor na linha 5: " + menorValorLinha5);

		    int linha7 = 6;

		    int maiorValorLinha7 = matriz[linha7][0];
		    int menorValorLinha7 = matriz[linha7][0];
		    for (int i = 1; i < matriz[linha7].length; i++) {
		        if (matriz[linha7][i] > maiorValorLinha7) {
		            maiorValorLinha7 = matriz[linha7][i];
		        }
		        if (matriz[linha7][i] < menorValorLinha7) {
		            menorValorLinha7 = matriz[linha7][i];
		        }
		    }

		    System.out.println("Maior valor na linha 7: " + maiorValorLinha7);
		    System.out.println("Menor valor na linha 7: " + menorValorLinha7);
		}
}