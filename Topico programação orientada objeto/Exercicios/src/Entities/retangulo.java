package Entities;

public class retangulo {

	public double width;

	public double height;

	public double calculoarea() {

		return width * height;

	}

	public double perimetral() {
		return 2 * (width + height);
	}

	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

}
