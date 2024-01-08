package entities;

public class Employee {

	
	private String name;
	private Integer hours;
	private double valueperHour;

	public Employee() {
	}

	public Employee(String name, Integer hours, double valueperHour) {
		this.name = name;
		this.hours = hours;
		this.valueperHour = valueperHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double getValueperHour() {
		return valueperHour;
	}

	public void setValueperHour(double valueperHour) {
		this.valueperHour = valueperHour;
	}
	
public double payment () {
	return hours*valueperHour;
}
}
