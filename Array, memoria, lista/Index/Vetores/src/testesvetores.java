import java.util.Locale;
import java.util.Scanner;

public class testesvetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o valor de N:");

		int n = scanner.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {

			vect[i] = scanner.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		double avg = sum / n;

		System.out.printf("Averege height: %.2f%n", avg);

		scanner.close();
	}

}
