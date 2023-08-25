package lesson6.lab3;

import lesson7.lab2.Card;
import lesson7.lab2.SavingAccount;

public abstract class Employee {
	protected String firstName;
	protected String lastName;
	protected String securityNumber;
	protected SavingAccount account;

	public Employee(String firstName, String lastName, String securityNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.securityNumber = securityNumber;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number : %s", firstName, lastName, securityNumber);
	}
	public abstract double earnings();

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSecurityNumber() {
		return securityNumber;
	}

	public SavingAccount getAccount() {
		return account;
	}

	public void setAccount(SavingAccount account) {
		this.account = account;
	}
	
	public Card getCard() {
		return account.getCard();
	}
}
