package Model.Entities;

import java.io.PrintStream;

public class Employee implements Comparable<Employee>{

	private Integer id;
	protected String name;
	private String email;
	private Double grossSalary;
	private Double tax;
	protected Integer hour;
	protected Double vlrPerHour;
	
	Boolean update = false;

	public Employee(String name, String email, Double grossSalary) {
		this.name = name;
		this.email = email;
		this.grossSalary = grossSalary;
	}

	public Employee(String name, Double grossSalary) {
		this.name = name;
		this.grossSalary = grossSalary;
	}

	public Employee(String name, Integer hour, Double vlrPerHour) {
		this.name = name;
		this.hour = hour;
		this.vlrPerHour = vlrPerHour;
	}

	public Employee(Integer id, String name, Double grossSalary) {
		this.id = id;
		this.name = name;
		this.grossSalary = grossSalary;
	}

	public Employee(String name, Double grossSalary, Double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary *= (1 + (percentage/100));
	}
	
	public PrintStream showInfoEmployee() {
		if(!this.update) {
			this.update = true;
			return System.out.printf("%nEmployee: %s, $ %.2f%n%n", this.name, this.netSalary());
		}
		return System.out.printf("%nUpdate data: %s, $ %.2f%n", this.name, this.netSalary());
	}

	public Double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Double getVlrPerHour() {
		return vlrPerHour;
	}

	public void setVlrPerHour(Double vlrPerHour) {
		this.vlrPerHour = vlrPerHour;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double payment(){
		return hour * vlrPerHour;
	}

	@Override
	public int compareTo(Employee other) {
		return getName().compareTo(other.getName());
		// return getGrossSalary().compareTo(other.getGrossSalary());
	}

	@Override
	public String toString() {
		return name + ", " + email + ", " + grossSalary;
	}
}
