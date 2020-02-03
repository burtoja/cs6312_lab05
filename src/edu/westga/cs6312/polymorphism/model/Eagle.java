package edu.westga.cs6312.polymorphism.model;

/**
 * This class creates Eagle objects which are subclasses of Bird which is a
 * subclass of Animal
 * 
 * @author J. Allen Burton
 * @version Feb 1, 2020
 *
 */
public class Eagle extends Bird {

	/**
	 * Constructor for Eagle objects
	 *
	 * Precondition: none
	 *
	 * Postcondition: Creates a Bird object which creates an Animal object with
	 * 'kind' = eagle and covering = feathers
	 */
	public Eagle() {
		super("eagle");
	}

	/**
	 * Method to get a String representation of the sound made by the Eagle
	 * 
	 * @return "screech"
	 *
	 * Precondition: none
	 *
	 * Postcondition: After string representation of animal sound is
	 * returned, no changes are made to the object
	 */
	@Override
	public String getSound() {
		return "Screech";
	}
}
