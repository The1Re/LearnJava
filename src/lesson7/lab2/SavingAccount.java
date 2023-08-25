package lesson7.lab2;

import lesson6.lab3.Employee;

public class SavingAccount extends BaseAccount{
	private double amount = 0;
	private Card card;
	private Employee emp;
	
	public SavingAccount(Employee emp) {
		card = new DebitCard(this);
		emp.setAccount(this);
		this.emp = emp;
	}
	
	public Employee getEmployee() {
		return emp;
	}
	
	public Card getCard() {
		return card;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if (amount <= this.amount) {
			this.amount -= amount;
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		this.amount += amount;
		return true;
	}
	
	public double getMoney() {
		return amount;
	}
}
