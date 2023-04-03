package com.devlabstudio.decorator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a juice object without decorating
		 */
		Boisson orangeJuice = new Jus();
		System.out.println(orangeJuice);
		
		/*
		 * Using Decoration
		 */
		Milk milkJuice = new Milk(orangeJuice);
		System.out.println(milkJuice);
		
		/*
		 * Example with Chocolate
		 */
		Chocolate chocolateCoffe = new Chocolate(new Cafe());
		System.out.println(chocolateCoffe);
		
		
		/*
		 * 3. Example using Detox Object
		 */
		Chocolate detoxChoco = new Chocolate(new Detox());
		System.out.println(detoxChoco);

	}

}
