package lesson5.lab1;

import lesson7.lab2.Card;
import lesson7.lab2.DebitCard;

public class Cashier {
	private InventoryCart ic;
	private Card card;
	private double total = 0;
	
	public void printReceipt() {
		System.out.println("\tCARD TYPE : " + card.type());
		if (card instanceof DebitCard) {
			DebitCard c = (DebitCard)card;
			System.out.println("\tCARD NUMBER : xxx-xxx-" + c.getAccount().getEmployee().getSecurityNumber().substring(8));
			System.out.println("\t\tPumpkin Shop\n");
			for (Product pd : ic.getAllProduct()) {
				System.out.printf("\t%d x %s\t%d\n", pd.getAmount(), pd.getName(), (int)pd.getPrice());
			}
			System.out.println("\n\tCARD DISCOUNT\t" + card.discount() + " %");
			System.out.println("\tTotal\t" + total + " $");
		}
	}
	
	public void doPayment(InventoryCart ic, Card card) {
		this.ic = ic;
		this.card = card;
		for (Product pd : ic.getAllProduct()) {
			total += pd.getPrice();
		}
		total = total - total*card.discount()/100;
		card.withdraw(total);
	}
}
