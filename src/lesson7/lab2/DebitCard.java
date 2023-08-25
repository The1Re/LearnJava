package lesson7.lab2;

public class DebitCard extends Card{
	private SavingAccount account;
	
	public DebitCard(SavingAccount account) {
		this.account = account;
	}
	
	public SavingAccount getAccount() {
		return account;
	}
	
	@Override
	public boolean withdraw(double amount) {
		return (account.withdraw(amount)) ? true : false;
	}

	@Override
	public String type() {
		return "visa";
	}

	@Override
	public double discount() {
		return 2.5;
	}

}
