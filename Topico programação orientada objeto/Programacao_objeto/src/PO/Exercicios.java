package PO;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Exercicios {

	public static void main(String[] args) {

		/*
		 * Problema Exemplo:
		 * 
		 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
		 * (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois
		 * triângulos e dizer qual dos dois triângulos possui a maior área.
		 * 
		 * A formula para calcular a área de um triangulo a partir das medidas de seus
		 * lados a,b e c é a seguinte (fórmula de Heron):
		 */

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Triangle x, y;

		x = new Triangle();
		y = new Triangle();

		System.out.println("Informe as medidas do tringulo x:");

		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble();

		System.out.println("Informe as medidas do triangulo y:");

		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();

		double areax =x.area();
		double areay = y.area();

		System.out.printf("Triangulo x area:%.4f%n ", areax);

		System.out.printf("Triangulo Y area:%.4f%n", areay);

		if (areax > areay) {
			System.out.println("area x é maior");

		} else {
			System.out.println("Area y é maior");
		}

		scanner.close();
	}
}