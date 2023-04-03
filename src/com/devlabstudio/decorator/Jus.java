package com.devlabstudio.decorator;

public class Jus implements Boisson {
	private Double coast = 25.00;
	private String description = "Orange Juice";

	@Override
	public Double getCoast() {
		// TODO Auto-generated method stub
		return this.coast;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public String toString() {
		return description + ": " + coast;
	}

	
}
