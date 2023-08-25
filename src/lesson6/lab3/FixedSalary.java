package lesson6.lab3;

public class FixedSalary extends Employee{
	private double salary;

	public FixedSalary(String firstName, String lastName, String securityNumber, double salary) {
		super(firstName, lastName, securityNumber);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Fixed salary employee : " + super.toString() + "\n"
				+ "monthly salary : $" + salary;
	}

	@Override
	public double earnings() {
		return salary;
	}
	
	
}
