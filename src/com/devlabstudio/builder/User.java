package com.devlabstudio.builder;

public class User {
	
	private String firstName;
	private String lastName;
	private Integer matricule;
	private String email;

	
	/*
	 * Generate a private constructor using all attributes 
	 * Access only from this class.
	 * Cannot instantiate this class with new thanks to private instruction
	 */
	private User(String firstName, String lastName, Integer matricule, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.matricule = matricule;
		this.email = email;
	}



	/*
	 * Builder Class to create object using parent constructor
	 * to create a new instance you should use new with User.Builer()
	 * this here refer to the context, the context here is the current object built 
	 */
	public static class Builder{
		
		private String firstName;
		private String lastName;
		private Integer matricule;
		private String email;
		
		public Builder firstName(String firstName) {
			this.firstName = firstName;
			System.out.println("What represents 'this' firestName Method: "+this);
			return this;
		}
		public Builder lastName(String lastName) {
			this.lastName = lastName;
			System.out.println("What represents 'this' lastName Method: "+this);
			return this;
		}
		public Builder matricule(Integer matricule) {
			this.matricule = matricule;
			System.out.println("What represents 'this' matricule Method: "+this);
			return this;
		}
		public Builder email(String email) {
			this.email = email;
			System.out.println("What represents 'this' email Method: "+this);
			return this;
		}
		
		public User build() {
			return new User(firstName, lastName, matricule, email);
		}
		
	}
}
