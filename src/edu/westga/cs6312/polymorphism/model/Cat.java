package edu.westga.cs6312.polymorphism.model;

/**
 * This class creates Cat objects which are subclasses of Mammal which is a subclass of Animal
 * 
 * @author J. Allen Burton
 * @version Feb 1, 2020
 *
 */
public class Cat extends Mammal{
	
	/**
	 * Constructor for Cat objects
	 *
	 * Precondition:	none
	 *
	 * Postcondition:  Creates a Mammal object which creates an Animal object with kind = cat and covering = hair
	 */
	public Cat() {
		super("cat");
	}
	
	/**
	 * Method to get a String representation of the sound made by the Cat
	 * 
	 * @return	Meow
	 *
	 * Precondition:	none
	 *
	 * Postcondition:
	 */
	@Override
	public String getSound() {
		return "Meow";
	}
}
