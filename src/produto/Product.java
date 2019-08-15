package produto;

public class Product {
	String name;
	private double price;
	private int qty;
	
	public Product(String name, double price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;		
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		/*qty = 0; /*O this é opcional, pois não há o parâmetro qty. Por conta disso, 
		evita a ambiguidade entre o atributo e o parâmetro passado na função e esta variável
		inicia-se com 0.*/	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

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