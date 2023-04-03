package com.devlabstudio.decorator;

public class Detox implements Boisson {

	private Double coast = 22.00;
	private String description = "Detox";

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
