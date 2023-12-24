package exercicio1;

import java.util.ArrayList;
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

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<funcionarios> list = new ArrayList<>();

		System.out.println("Quantos funcionarios serão registrados");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionarios #" + (i + 1) + ":");
			System.out.println("id:");
			Integer id = sc.nextInt();
			System.out.println("nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("salario:");
			double salario = sc.nextDouble();
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}

			funcionarios func = new funcionarios(id, nome, salario);
			list.add(func);
		}

		System.out.println("Informe o usuário que tera aumento no salario: ");

		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);

		if (pos == null) {
			System.out.println("Funcionario não existe");
		} else {
			System.out.println("entre com a porcentagem");

			double percent = sc.nextDouble();

			list.get(pos).aumentarsalario(percent);

		}

		System.out.println();
		System.out.println("LISTA DE FUNCIONARIOS");
		for (funcionarios func : list) {
			System.out.println(func);
		}

		sc.close();

	}

	public static Integer position(List<funcionarios> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}

		}
		return null;

	}

	public static boolean hasId(List<funcionarios> list, int id) {
		funcionarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
