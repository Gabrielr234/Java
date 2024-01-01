package entities;

import java.util.Date;

public class Hourcontract {
	public Date date;
	private Double ValuePerHour;
	private Integer hours;
 
	public Hourcontract() {
 }

	public Hourcontract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		ValuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return ValuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		ValuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
}
