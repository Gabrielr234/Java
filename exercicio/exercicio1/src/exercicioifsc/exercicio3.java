package exercicioifsc;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		/*
		 * Informar um saldo e imprimir o saldo com reajuste de 1%
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o seu saldo:");

		int saldo = sc.nextInt();

		double ajuste = 1.01;

		double somatotal = ajuste * saldo;

		System.out.println("Saldo é igual ajustado é igual a: " + somatotal);

	}

}
