package lesson5.lab1;

public class InventoryCart {
	private Product[] products;
	private static int index = 0;
	
	public InventoryCart(int capacity) {
		products = new Product[capacity];
	}
	
	public void addProduct(Product pd) {
		for (int i=0; i<index; i++) {
			if (products[i].getName() == pd.getName()) {
				products[i].setAmount(products[i].getAmount() + 1);
				products[i].setPrice(products[i].getPrice() + pd.getPrice());
				return ;
			}
		}
		products[index++] = pd;
	}
	
	public Product getProductAt(int i) {
		return products[i];
	}
	
	public Product[] getAllProduct() {
		Product[] temp = new Product[index];
		for (int i=0; i<index; i++) {
			temp[i] = products[i];
		}
		return temp;
	}
}
