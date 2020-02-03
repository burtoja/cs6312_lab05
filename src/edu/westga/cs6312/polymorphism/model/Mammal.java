package edu.westga.cs6312.polymorphism.model;

/**
 * Abstract subclass of Animal that creates Animals objects of type mammal
 * 
 * @author J. Allen Burton
 * @version Jan 31, 2020
 *
 */
public abstract class Mammal extends Animal {

	/**
	 * 
	 * Constructor for Mammal class which then constructs an Animal object of this
	 * kind with covering of hair
	 *
	 * @param kind type of Mammal
	 *
	 * Precondition: 'kind' is delivered by the subclass and should
	 * match its name
	 *
	 * Postcondition: Animal object with type kind and covering of hair
	 * is created
	 */
	public Mammal(String kind) {
		super(kind, "hair");
	}
}
