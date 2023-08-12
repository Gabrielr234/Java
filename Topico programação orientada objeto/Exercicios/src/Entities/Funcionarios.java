package Entities;

public class Funcionarios {

	public String name;
	public double grosssalary;
	public double tax;

	public double netsalary() {

		return grosssalary - tax;

	}

	public double incleaseSalary(double percentage) {

		grosssalary += grosssalary * percentage / 100.0;

		return grosssalary;

	}

	public String toString() {
		return name + ",$" + String.format("%.2f%n", netsalary());
	}
}