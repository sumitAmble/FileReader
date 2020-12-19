package com.solution;

public class Sugar extends Addon {

	public Sugar(Beverage beverage) {
		super("Sugar", beverage);
	}

	@Override
	public double cost() {
		return beverage.cost()+50;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+" with mocha";
	}

}
