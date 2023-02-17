package main;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private int id;
	private String name;
	private double price;
    
    // Create your instance variables

    // Create a constructor to initialize the product properties
	public Product(int id, String name, double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}

    public static void main(String[] args) {
        // Create a list of products
        List<Product> productsList = new ArrayList<Product>();

        // Add products to the list
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenevo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000));

        // Filter products based on the price and get the count of products
        long count= productsList.stream()
        .filter(p->p.price<30000)
        .count();

        // Print the count of products whose price is less than 30000
        System.out.println("Number of products with price less than 30000: " + count);
    }

	
}
