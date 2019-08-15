package Applic;

import java.util.Locale;

import java.util.Scanner;

import produto.Product;

public class ProgProd {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert your product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int qty = sc.nextInt();
		
		Product product = new Product(name, price, qty);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Updated name: " + product.getPrice());
						
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		qty = sc.nextInt();
		product.addProducts(qty);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		qty = sc.nextInt();
		product.removeProducts(qty);
		
		System.out.println();
		System.out.println("Updated data: " + product);
						
	}
	

}