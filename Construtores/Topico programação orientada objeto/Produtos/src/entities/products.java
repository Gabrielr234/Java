package entities;

public class products {

	public String name;

	public double price;
	public int quantity;

	public double totalValueInstock() {
		return price * quantity;
	}

	public void addproducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ",$" 
	+ String.format("%.2f", price) 
	+ ","
	+ quantity 
	+ "units ,total:$ " 
	+ totalValueInstock();
	}
}
