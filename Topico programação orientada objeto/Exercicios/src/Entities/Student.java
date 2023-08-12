package Entities;

public class Student {

	public String nome;

	public double n1;

	public double n2;
	public double n3;

	public double finalclasse() {
		return n1 + n2 + n3;
	}

	public double totalpontos() {
		if (finalclasse()< 60.0) {
			return 60.0 - finalclasse();
		} else {
			return 0.00;
		}

	}
}