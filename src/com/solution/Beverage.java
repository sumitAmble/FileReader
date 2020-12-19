package com.solution;

public abstract class Beverage {
	private String discription;
	
	public Beverage(String description) {
		this.discription = description;
	}
	
	public String getDescription() {
		return this.discription;
	}
	
	public abstract double cost();
	
}
