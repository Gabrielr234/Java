import java.util.Locale;
import java.util.Scanner;
import entities.products;

public class testes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o número de produtos:");

		int n = scanner.nextInt();

		products[] vect = new products[n];
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			String name = scanner.nextLine();
			double price = scanner.nextDouble();
			vect[i] = new products(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / n;

		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		scanner.close();
	}

}
