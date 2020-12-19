package com.billing;

public class Sugar implements Beverages {

	private int price=20;
	
	public Sugar() {
		
	}
	
	@Override
	public int billingDetails() {
		System.out.println("AddOn Sugar MRP:   "+price);
		return price;
	}
	
}
