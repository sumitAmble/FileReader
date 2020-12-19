package com.solution;

public class Driver {

	public static void main(String[] args) {
		
		HouseBlend houseBlend = new HouseBlend();
		System.out.println(houseBlend.getDescription()+" "+houseBlend.cost());
		
		Milk milk = new Milk(houseBlend);
		System.out.println(milk.getDescription()+" "+milk.cost());
		
		Sugar sugar = new Sugar(milk);
		System.out.println(sugar.getDescription()+" "+sugar.cost());
	}

}
