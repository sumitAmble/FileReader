package com.solution;

public class Milk extends Addon {
	
	public Milk(Beverage beverage) {
		super("Milk", beverage);
	
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() +"with Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 100;
	}

}
