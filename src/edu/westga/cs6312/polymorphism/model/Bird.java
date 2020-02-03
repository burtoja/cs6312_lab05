package edu.westga.cs6312.polymorphism.model;

/**
 * Abstract subclass of Animal that creates Animals objects of type bird
 * 
 * @author J. Allen Burton
 * @version Feb 1, 2020
 *
 */
public abstract class Bird extends Animal {

	/**
	 * 
	 * Constructor for Bird class which then constructs an Animal object of this
	 * kind with covering of feathers
	 *
	 * @param kind type of Bird
	 *
	 * Precondition: 'kind' is delivered by the subclass and should
	 * match its name
	 *
	 * Postcondition: Animal object with type kind and covering of
	 * feathers is created
	 */
	public Bird(String kind) {
		super(kind, "feathers");
	}

	/**
	 * This method is used to get a statement describing how the animal is moving
	 * 
	 * @param isMovingFast true if moving fast and false if moving slow
	 * 
	 * @return statement describing how the Animal is moving
	 *
	 * Precondition: isMovingFast is boolean
	 *
	 * Postcondition: after description of movement is returned no change to
	 * the object is made
	 */
	@Override
	public String getMovement(boolean isMovingFast) {
		String movementDescription;
		if (isMovingFast == true) {
			movementDescription = "I fly";
		} else if (isMovingFast == false) {
			movementDescription = "I walk on two legs";
		} else {
			throw new IllegalArgumentException("Invalid parameter provided for isMovingFast");
		}
		return movementDescription;
	}
}
