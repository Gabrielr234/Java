package products;

import entities.products;
import java.util.Scanner;
import java.util.Locale;

public class Products {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		products products = new products();

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		products.name = scanner.nextLine();
		System.out.println("Price: ");
		products.price = scanner.nextDouble();
		System.out.println("Quantity in stock: ");
		products.quantity = scanner.nextInt();

		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = scanner.nextInt();
		products.addproducts(quantity);

		System.out.println();

		System.out.println("update data:" + products);

		System.out.println();
		
		System.out.println("Enter the number of products to be removed in stock: ");
		
		quantity =scanner.nextInt();
		products.removeProducts(quantity);
		
		System.out.println();

		System.out.println("update data:" + products);
		scanner.close();
	}

}
