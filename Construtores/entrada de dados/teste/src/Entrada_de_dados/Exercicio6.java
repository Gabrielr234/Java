package Entrada_de_dados;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");

		A = scanner.nextDouble();

		System.out.print("Digite o valor de B: ");
		
		B = scanner.nextDouble();

		System.out.print("Digite o valor de C: ");
		
		C = scanner.nextDouble();

		areaTriangulo = (A * C) / 2;
		areaCirculo = Math.PI * Math.pow(C, 2);
		areaTrapezio = ((A + B) * C) / 2;
		areaQuadrado = Math.pow(B, 2);
		areaRetangulo = A * B;

		System.out.println("Área do triângulo retângulo: " + areaTriangulo);
		System.out.println("Área do círculo: " + areaCirculo);
		System.out.println("Área do trapézio: " + areaTrapezio);
		System.out.println("Área do quadrado: " + areaQuadrado);
		System.out.println("Área do retângulo: " + areaRetangulo);

		scanner.close();

	}
}
