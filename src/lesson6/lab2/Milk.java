package lesson6.lab2;

import lesson5.lab1.Product;

public class Milk extends Product{
	private int volumn;
	public Milk(double price) {
		super(price);
		super.setName("Milk");
	}
	public void setVolumn(int v) {
		this.volumn = v;
	}
	
	@Override
	public String printInfo() {
		return volumn + " CC";
	}
}
