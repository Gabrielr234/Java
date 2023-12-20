package entities;

public class idadeemdia {

	public static int calculaidadeemdia (int ano, int mes, int dia) {

		return (ano * 365) + (mes * 30) + dia;
	}
}