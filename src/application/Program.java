package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Insert your product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.qty = sc.nextInt();
		
		//System.out.println(product.name + ", " + product.price + ", " + product.qty); 1st version.
		
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int qty = sc.nextInt();
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
