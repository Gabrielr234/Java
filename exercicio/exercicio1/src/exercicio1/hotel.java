package exercicio1;

import java.util.Locale;
import java.util.Scanner;

import entities.rent;

public class hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		rent[] vect = new rent[10];

		System.out.println("how many rooms will be rented");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("rent" + (i +1)+ ":");
			System.out.print("name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("email");
			String email = sc.next();
			System.out.print("room:");
			int roomnumber = sc.nextInt();

			vect[roomnumber] = new rent(name, email);
		}

		System.out.println("busy rooms");
		for (int i = 0; i < 10; i++) {
			if (vect[i]!=null) {
			System.out.println(i+":"+vect[i]);
		}

		}
	}
}
