package edu.westga.cs6312.polymorphism.model;

/**
 * This class creates Parrot objects which are subclasses of Bird which is a
 * subclass of Animal
 * 
 * @author J. Allen Burton
 * @version Feb 1, 2020
 *
 */
public class Parrot extends Bird {

	/**
	 * Constructor for Parrot objects
	 *
	 * Precondition: none
	 *
	 * Postcondition: Creates a Bird object which creates an Animal object with kind
	 * = parrot and covering = feathers
	 */
	public Parrot() {
		super("parrot");
	}

	/**
	 * Method to get a String representation of the sound made by the Parrot
	 * 
	 * @return "Polly want a cracker"
	 *
	 * Precondition: none
	 *
	 * Postcondition: After string representation of animal sound is
	 * returned, no changes are made to the object
	 */
	@Override
	public String getSound() {
		return "Polly want a cracker";
	}
}
