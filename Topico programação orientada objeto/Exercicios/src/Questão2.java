import java.util.Locale;
import java.util.Scanner;
import Entities.Funcionarios;

public class Questão2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Funcionarios fuc = new Funcionarios();

		System.out.println("Informe o nome do funcionario:");

		fuc.name = scanner.nextLine();

		System.out.println("Salario Liquido:");

		fuc.grosssalary = scanner.nextDouble();

		System.out.println("Informe as taxas:");

		fuc.tax = scanner.nextDouble();

		System.out.println();

		System.out.println("Funcionario " + fuc);

		System.out.println();

		System.out.println("Informe a porcentagem para aumentar no salario");

		double percentage = scanner.nextDouble();

		fuc.incleaseSalary(percentage);

		System.out.println();

		System.out.println("Atualização " + fuc);

		scanner.close();

	}

}
