package lesson12;

import java.util.ArrayList;
import java.util.Scanner;

public class Item {
	String name;
	double price;
	int quantity;
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Item> cart = new ArrayList<>();
		while (true)
		{
			Item item = new Item();
			System.out.print("Enter the name of the item : ");
			item.setName(sc.nextLine());
			System.out.print("Enter the unit price : ");
			item.setPrice(sc.nextDouble());
			System.out.print("Enter the quantity : ");
			item.setQuantity(sc.nextInt());
			cart.add(item);
			sc.nextLine();
			System.out.print("Continue shopping (y/n) ? ");
			if (sc.nextLine().equals("n"))
				break;
		}
		
		System.out.println("Final Shopping Cart totals");
		double total = 0;
		for (Item item : cart) {
			System.out.printf("%s\t$%.2f\t%d\t%.2f\n", item.getName(), item.getPrice(), item.getQuantity(), item.getPrice()*item.getQuantity());
			total += item.getPrice()*item.getQuantity();
		}
		System.out.println("Total $ Amount in Cart : $" + total);
		
		sc.close();
	}

}
