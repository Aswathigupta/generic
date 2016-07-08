package com.niit.generic;

public class Product {
	
	private String id,name;
	double price;
	
	public Product(String id,String name,double price)
	{
	this.id=id;
	this.name=name;
	this.price=price;
	}
	public String getId()
	{
	return this.id;
	}
	public String getName()
	{
	return this.name;
	}
	public double getPrice()
	{
	return this.price;
	}

}
