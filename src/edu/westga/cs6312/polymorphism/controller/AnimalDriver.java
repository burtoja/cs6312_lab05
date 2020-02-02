package edu.westga.cs6312.polymorphism.controller;

import edu.westga.cs6312.polymorphism.view.AnimalTUI;

/**
 * This class will serve as the driver for the Animal class application
 * 
 * @author J. Allen Burton
 * @version Feb 2, 2020
 *
 */
public class AnimalDriver {

	/**
	* This method is the entry point of the application
	*
	* @param args Command-line arguments, not used
	*/
	public static void main(String[] args) {
		AnimalTUI userAnimalTUI = new AnimalTUI();
		userAnimalTUI.run();
	}

}
