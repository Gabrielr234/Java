
import java.util.Locale;
import java.util.Scanner;

/*
 numeros negativos em vetores
 */

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar?:");

		int n = scanner.nextInt();

		if (n > 10) {
			System.out.println("O número máximo é 10");
			return;
		}

		int[] numeros = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o número" + (i + 1) + ":");
			numeros[i] = scanner.nextInt();
		}

		System.out.println("Numeros negativos lidos");
		for (int i = 0; i < n; i++) {
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
		scanner.close();
	}
}