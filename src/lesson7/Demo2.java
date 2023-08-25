package lesson7;

import lesson5.lab1.*;
import lesson6.lab2.*;
import lesson6.lab3.FixedSalary;
import lesson7.lab2.SavingAccount;

public class Demo2 {

	public static void main(String[] args) {
		FixedSalary employeeA = new FixedSalary("Clark", "Kent", "555-999-5555", 15000);
		SavingAccount b = new SavingAccount(employeeA);
		b.deposit(1000);
		
		Milk p1 = new Milk(150);
		p1.setVolumn(250);
		Sugar p2 = new Sugar(50);
		p2.setWeight(250);
		Product p3 = new Coffee(250);
		p3.setWeight(50);
		Product p4 = new Coffee(250);
		p4.setWeight(50);
		
		InventoryCart ic = new InventoryCart(10);
		ic.addProduct(p1);
		ic.addProduct(p2);
		ic.addProduct(p3);
		ic.addProduct(p4);
		
		Cashier c = new Cashier();
		
		c.doPayment(ic, employeeA.getCard());
		c.printReceipt();
		
		System.out.println("\nMoney left = " + b.getMoney());

	}

}
