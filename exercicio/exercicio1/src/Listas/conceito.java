package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class conceito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();

		list.add("Maria");

		list.add("pedro");

		list.add("marcelo");

		list.add("ad");

		list.add(2, "marcos");
		list.add("abc");

		list.add("bcd");
		
		
		System.out.println(list.size());
		
		list.remove(0);
		
		list.removeIf(x-> x.charAt(0)=='m');

		for (String x : list) {
			System.out.println(x);
		}
	}

}
