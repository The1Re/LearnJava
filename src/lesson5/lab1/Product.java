package lesson5.lab1;

public class Product {
	private String id;
	private String name;
	private double price;
	private int amount = 1;
	private int weight;
	
	public Product(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product(double price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void setWeight(int w) {
		this.weight = w;
	}
	
	public String printInfo() {
		return weight + " Gram";
	}
}
