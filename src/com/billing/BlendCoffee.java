package com.billing;

import java.util.List;

public class BlendCoffee implements Beverages{
	
	private String name;
	private List<Beverages> addOns;
	private int price=70;
	
	public BlendCoffee(List<Beverages> addOn) {
		this.addOns = addOn;
	}

	@Override
	public int billingDetails() {
		System.out.println("BlendCoffee MRP: "+price);
		int totalPrice=price;
		if(!addOns.isEmpty()) {
			for (Beverages beverages : addOns) {
				if(beverages instanceof Sugar) {
					Sugar s = (Sugar)beverages;
				}else if(beverages instanceof Milk) {
					Milk s = (Milk)beverages;
				}
			}
		}
		
		return totalPrice;
	}
	
	
	
}
