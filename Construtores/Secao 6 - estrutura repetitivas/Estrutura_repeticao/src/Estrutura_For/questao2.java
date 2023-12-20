package Estrutura_For;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a quantidade de valores inteiros:");

		int N = scanner.nextInt();

		int dentroIntervalo = 0;
		int foraIntervalo = 0;

		for (int i = 0; i < N; i++) {
			System.out.println("Digite o valor inteiro de x:");
			int x = scanner.nextInt();

			if (x >= 10 && x <= 20) {
				dentroIntervalo++;
			} else {
				foraIntervalo++;
			}
		}
		System.out.println("Quantidade de valores dentro do intervalor [10,20]:" + dentroIntervalo);
		System.out.println("Valores fora do intervalor" + foraIntervalo);

		scanner.close();
	}

}
