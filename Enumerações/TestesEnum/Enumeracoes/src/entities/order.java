package entities;

import java.util.Date;

import entities.enums.orderstatus;

public class order {

	private Integer id;
	private Date moment;
	private orderstatus status;

	public order() {

	}

	public order(Integer id, Date moment, orderstatus status) {

		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public orderstatus getStatus() {
		return status;
	}

	public void setStatus(orderstatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
}
