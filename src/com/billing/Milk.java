package com.billing;

public class Milk implements Beverages {
	private int price = 30;
	
	
	@Override
	public int billingDetails() {
		System.out.println("AddOn Milk MRP:   "+price);
		return price;
	}

}
