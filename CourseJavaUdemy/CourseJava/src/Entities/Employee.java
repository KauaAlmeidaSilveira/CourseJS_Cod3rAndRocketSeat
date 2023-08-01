package Entities;

import java.io.PrintStream;

public class Employee {

	public String Name;
	public Double GrossSalary;
	public Double Tax;
	
	Boolean update = false;
	
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
}
