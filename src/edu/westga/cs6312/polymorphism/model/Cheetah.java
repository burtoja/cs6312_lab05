package edu.westga.cs6312.polymorphism.model;

/**
 * This class creates Cheetah objects which are subclasses of Mammal which is a
 * subclass of Animal
 * 
 * @author J. Allen Burton
 * @version Feb 1, 2020
 *
 */
public class Cheetah extends Mammal {

	/**
	 * Constructor for Cheetah objects
	 *
	 * Precondition: none
	 *
	 * Postcondition: Creates a Mammal object which creates an Animal object with
	 * kind = cheetah and covering = hair
	 */
	public Cheetah() {
		super("cheetah");
	}

	/**
	 * Method to get a String representation of the sound made by the Cheetah.
	 * Cheetahs are reported to make a chirping sound. To avoid confusion with bird
	 * chirping, it will be referred to as a "Feline Chirp" in this application.
	 * 
	 * @return Chirp
	 *
	 * Precondition: none
	 *
	 * Postcondition: After string representation of animal sound is
	 * returned, no changes are made to the object
	 */
	@Override
	public String getSound() {
		return "Feline chirp";
	}
}
