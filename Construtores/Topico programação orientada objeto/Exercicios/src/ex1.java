import java.util.Locale;
import java.util.Scanner;
import Entities.retangulo;

public class ex1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		retangulo rec = new retangulo();

		System.out.println("Enter retangulo Width e height");
		rec.height = scanner.nextDouble();
		rec.width = scanner.nextDouble();

		System.out.printf("Area : %.2f%n", rec.calculoarea());
		System.out.printf("Perimetro: %.2f%n", rec.perimetral());
		System.out.printf("Area diagonal: %.2f%n", rec.diagonal());

		scanner.close();

	}

}
