import java.util.Locale;
import java.util.Scanner;
import Entities.Student;

public class questao3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Student al = new Student();

		System.out.println("Informe o nome do aluno:");
		al.nome = scanner.nextLine();

		System.out.println("Informe a nota 1");

		al.n1 = scanner.nextDouble();

		System.out.println("Informe a nota 2");

		al.n2 = scanner.nextDouble();

		System.out.println("Informe a nota 3");

		al.n3 = scanner.nextDouble();

		System.out.printf("Total de pontos: %.2f%n", al.finalclasse());

		System.out.println();

		if (al.finalclasse() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("faltando: %.2f pontos %n", al.totalpontos());

		} else {
			System.out.println("Aprovado");
		}

		scanner.close();
	}

}
