package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Praticanotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("informe o aluno");
		String aluno = sc.nextLine();

		System.out.println("informe a nota1:");
		int n1 = sc.nextInt();

		System.out.println("informe a nota2:");
		int n2 = sc.nextInt();
		System.out.println("informe a nota3:");
		int n3 = sc.nextInt();

		int soma = (n1 + n2 + n3) / 3;

		if (soma <= 7) {
			System.out.printf(aluno + " reprovado");
		} else
			System.out.printf("%s aprovado com média %.2f\n ", aluno, soma);

		sc.close();
	}
}
