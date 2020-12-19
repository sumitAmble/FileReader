package com.solution;

public abstract class Addon extends Beverage {
	
	protected Beverage beverage;

	public Addon(String description,Beverage beverage) {
		super(description);
		this.beverage = beverage;
	}

	public abstract String getDescription();

}
