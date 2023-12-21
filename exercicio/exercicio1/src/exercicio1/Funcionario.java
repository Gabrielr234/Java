package exercicio1;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.funcionarios;

public class Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		/*
		 * Fazer um programa para ler um número inteiro N e depois os dados (id,nome e
		 * salario) de n funcionarios.não deve haver repetição de id
		 * 
		 * em seguida efetuar o aumento de x por cento no sálario de um determinado
		 * funcionario
		 * 
		 * para isso o programa deve ler um id e o valor x. se o id iformado não
		 * existir. mostrar uma mensagem e abortar a operação. ao final, mostrar a
		 * listagem atualizada dos funcionarios
		 * 
		 * conforme exemplos
		 * 
		 * 
		 * encapsulamento para que o salario possa ser mudado livremente. um salario só
		 * pode ser aumentado com base em uma operação de aumento por porcentagem dada
		 * 
		 * 
		 * funcionario = id nome e salario
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		List<funcionarios> List = new arrayList<>();

		System.out.println("Quantos funcionarios serão registrados");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.println("id:");
			Integer id = sc.nextInt();
			System.out.println("name:");
			sc.nextLine();
			System.out.println("salario:");
			double salario = sc.nextDouble();
		}

	}

}
