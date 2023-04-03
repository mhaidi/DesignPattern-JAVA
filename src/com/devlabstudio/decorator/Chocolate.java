package com.devlabstudio.decorator;

public class Chocolate extends BoissonDecorator{

	private Double coast= 10.00;
	private String description = " with Chocolate";
	
	public Chocolate(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getCoast() {
		// TODO Auto-generated method stub
		return super.getCoast()+this.coast;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription()+this.description;
	}
	
	
	public String toString() {
		return "1. " + super.getDescription() +": "+super.getCoast()+
				"\n2. "+this.description + ": " + this.coast+
				"\nTotal "+this.getDescription() +": "+this.getCoast();
	}
	
}
