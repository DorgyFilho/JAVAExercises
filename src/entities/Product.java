package entities;

public class Product {
	public String name;
	public double price;
	public int qty;
	
	public double TotalValueStock() {
		return price*qty;
		
	}
	
	public void addProducts(int qty) {
		this.qty += qty;
		
	}
	
	public void removeProducts(int qty) {
		this.qty -= qty;
		
	}
	
	public String toString() {
		return name + 
				", $ " + 
				String.format("%.2f", price)
				+ ", "
				+ qty
				+ " units, Total: $ "
				+ String.format("%.2f", TotalValueStock());
	}

}
