package lesson6.lab3;

public class CommissionPay extends Employee{
	private double sale;
	private double rate;
	public CommissionPay(String firstName, String lastName, String securityNumber, double sale, double rate) {
		super(firstName, lastName, securityNumber);
		this.sale = sale;
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "commission employee : " + super.toString() + "\n"
				+ "gross sales : $" + sale + "; commission rate : " + rate;
	}
	@Override
	public double earnings() {
		return sale*rate;
	}
	
}
