package Entities;

import java.io.PrintStream;

public class Employee {

	private Integer Id;
	private String Name;
	private Double GrossSalary;
	private Double Tax;
	
	Boolean update = false;
	
	public Employee() {}
	
	public Employee(Integer id, String name, Double grossSalary) {
		Id = id;
		Name = name;
		GrossSalary = grossSalary;
	}

	public Employee(String name, Double grossSalary, Double tax) {
		Name = name;
		GrossSalary = grossSalary;
		Tax = tax;
	}

	public double netSalary() {
		return this.GrossSalary - this.Tax;
	}
	
	public void increaseSalary(double percentage) {
		this.GrossSalary *= (1 + (percentage/100));
	}
	
	public PrintStream showInfoEmployee() {
		if(!this.update) {
			this.update = true;
			return System.out.printf("%nEmployee: %s, $ %.2f%n%n", this.Name, this.netSalary());
		}
		return System.out.printf("%nUpdate data: %s, $ %.2f%n", this.Name, this.netSalary());
	}

	public Double getGrossSalary() {
		return GrossSalary;
	}

	public void setGrossSalary(Double grossSalary) {
		GrossSalary = grossSalary;
	}

	public Double getTax() {
		return Tax;
	}

	public void setTax(Double tax) {
		Tax = tax;
	}

	public Integer getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
}
