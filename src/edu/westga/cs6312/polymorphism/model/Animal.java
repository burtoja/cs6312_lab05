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
	 * Postcondition:
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
	 * 
	 * @param kind 	the kind of Animal to create
	 * 
	 * @return	Animal object matching the kind delivered in the parameter
	 *
	 * Precondition:	kind must match an Animal subclass
	 *
	 * Postcondition:	Animal object matching kind
	 */
	public static Animal getNewAnimal(String kind) {
		if (kind.equalsIgnoreCase("cow")) {
			return null;
		}
		return null;
	}
}
