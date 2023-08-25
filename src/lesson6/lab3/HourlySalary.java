package lesson6.lab3;

public class HourlySalary extends Employee{
	private double hourPay;
	private double hourRate;
	public HourlySalary(String firstName, String lastName, String securityNumber, double hourPay, double hourRate) {
		super(firstName, lastName, securityNumber);
		this.hourPay = hourPay;
		this.hourRate = hourRate;
	}
	@Override
	public String toString() {
		return "hourly employee : " + super.toString() + "\n"
				+ "hourly pay : $" + hourPay + "; hours worked : " + hourRate;
		}
	@Override
	public double earnings() {
		return hourPay*hourRate;
	}
	
	
}
