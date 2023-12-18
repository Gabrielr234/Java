import java.util.Locale;
import java.util.Scanner;


public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Quantas pessoas serão informadas");
		
		int n = scanner.nextInt();
		
		if (n >10) {
			System.out.println("O número permitido é 10 pessoas");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
	}

}
