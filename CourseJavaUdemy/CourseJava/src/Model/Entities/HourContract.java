package Model.Entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double vlrPerHour;
	private Integer hours;
	
	public HourContract() {}
	
	public HourContract(Date date, Double vlrPerHour, Integer hours) {
		this.date = date;
		this.vlrPerHour = vlrPerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getVlrPerHour() {
		return vlrPerHour;
	}

	public void setVlrPerHour(Double vlrPerHour) {
		this.vlrPerHour = vlrPerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double totalVlr() {
		return this.vlrPerHour*this.hours;
	}
}
