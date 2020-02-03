package edu.westga.cs6312.polymorphism.model;

/**
 * Abstract class containing information for types of Animals
 * 
 * @author J. Allen Burton
 * @version Jan 31, 2020
 *
 */
public abstract class Animal {
	private String kind;
	private String covering;
	
	/**
	 * 
	 * 2-parameter constructor to create an Animal object
	 *
	 * @param kind		The kind of animal being created
	 * @param covering	The animal's covering type
	 *
	 * Precondition:	kind != null
	 * 					covering != null
	 * 
	 * Postcondition:	An animal of whose type is kind and is
	 * 					covered with covering	
	 */
	public Animal(String kind, String covering) {
		if (kind == null) {
			throw new IllegalArgumentException("Invalid kind");
		}
		if (covering == null) {
			throw new IllegalArgumentException("Invalid covering");
		}
		this.kind = kind;
		this.covering = covering;
	}
	
	/**
	 * This method is used to get a statement describing how the animal is moving
	 * 
	 * @param isMovingFast	true if moving fast and false if moving slow
	 * 
	 * @return	statement describing how the Animal is moving
	 *
	 * Precondition:		isMovingFast is boolean
	 *
	 * Postcondition:		object is not changed
	 */
	public String getMovement(boolean isMovingFast) {
		String movementDescription;
		if (isMovingFast == true) {
			movementDescription = "I run on four legs";
		} else if (isMovingFast == false) {
			movementDescription = "I walk on four legs";
		} else {
			throw new IllegalArgumentException("Invalid parameter provided for isMovingFast");
		}
		return movementDescription;
	}
	
	/**
	 * Factory method for producing Animal subclass objects
	 * 
	 * @param kind 	the kind of Animal to create
	 * 
	 * @return	Animal object matching the kind delivered in the parameter
	 *
	 * Precondition:	kind must match an Animal subclass
	 *
	 * Postcondition:	Animal subclass object created matching 'kind' or null if no 'kind' matches
	 */
	public static Animal getNewAnimal(String kind) {
		if (kind.equalsIgnoreCase("cat")) {
			return new Cat();
		} else if (kind.equalsIgnoreCase("cheetah")) {
			return new Cheetah();
		} else if (kind.equalsIgnoreCase("parrot")) {
			return new Parrot();
		} else if (kind.equalsIgnoreCase("eagle")) {
			return new Eagle();
		} else {
			return null;
		}
	}
	
	/**
	 * Abstract method to retrieve Animal sound
	 * 
	 * @return
	 *
	 * Precondition:	none
	 *
	 * Postcondition:	object is not changed
	 */
	public abstract String getSound();
	
	/**
	 * This method returns a string with a readable description of the Animal kind
	 * and covering.
	 * 
	 * @return a string listing the Animal kind and covering
	 * 
	 * Precondition:	none
	 *
	 * Postcondition:	object is not changed
	 */
	@Override
	public String toString() {
		return "Kind: " + this.kind + " -- Covering: " + this.covering;
	}
}
