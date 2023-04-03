package com.devlabstudio.decorator;

public class Cafe implements Boisson {

	private Double coast = 15.00;
	private String description = "Coffe";

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
