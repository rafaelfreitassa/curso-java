package entities;

public class Employee {
	
	public String name;
	public double grossSalary, tax;
	
	public double salarioLiquido() {
		return grossSalary - tax;
	}

	public void aumentarSalario(double aumento) {
		grossSalary = grossSalary + ((grossSalary * aumento) / 100);
	}
	
	public String toString() {
		return name
			   + ", $ "
			   + String.format("%.2f", salarioLiquido());
	}
	

}
