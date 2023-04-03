package com.devlabstudio.decorator;

public class BoissonDecorator implements Boisson{

	private Boisson boisson;
	
	public BoissonDecorator(Boisson boisson) {
		this.boisson = boisson;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getCoast() {
		// TODO Auto-generated method stub
		return this.boisson.getCoast();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.boisson.getDescription();
	}

	
}
