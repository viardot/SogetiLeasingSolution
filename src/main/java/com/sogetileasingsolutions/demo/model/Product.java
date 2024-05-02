package com.sogetileasingsolutions.demo.model;

public class Product {
	
	private final String id;
	private final String description;
	private final Double price;

	public Product(final String id, 
			       final String description, 
			       final Double price) {
	
		this.id = id;
		this.description = description;
		this.price = price;
    }
		
	public String getId() { return id; }
		
	public String getDescription() { return description; }
		
	public Double getPrice() { return price; }

	
	@Override
	public String toString( ) {
		return "Product{" +
	           "id='" + id + '\'' +
	           ", description='" + description  + '\'' +
	           ", price=" + price + 
	           '}';
	}
		
		
				
}
