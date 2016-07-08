package com.niit.generic;

import java.util.ArrayList;

public class ProductList {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();

		Product p = new Product("p1", "Mobile", 10000);
		products.add(p);
		p = new Product("p2", "Tablet", 20000);
		products.add(p);
		p = new Product("p3", "Laptop", 30000);
		products.add(p);

		for (Product prd : products) {

			System.out.println(prd.getId() + ' ' + prd.getName() + ' ' + prd.getPrice());

		}

	}

}
