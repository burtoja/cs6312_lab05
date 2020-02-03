package edu.westga.cs6312.polymorphism.view;

import java.util.ArrayList;
import java.util.Scanner;

import edu.westga.cs6312.polymorphism.model.Animal;

/**
 * This class will serve as the TUI allowing users to create and view new Animal
 * objects
 * 
 * @author J. Allen Burton
 * @version Feb 2, 2020
 *
 */
public class AnimalTUI {
	private Scanner userInput;
	private ArrayList<Animal> userAnimals;

	/**
	 * This will serve as the constructor to create the TUI object
	 *
	 * Precondition: none
	 *
	 * Postcondition: AnimalTUI is created with a new Scanner object for user input
	 * and a new ArrayList of Animal objects ready to be populated.
	 */
	public AnimalTUI() {
		this.userInput = new Scanner(System.in);
		this.userAnimals = new ArrayList<Animal>();
	}

	/**
	 * This method will serve to run the application
	 *
	 * Precondition: none
	 *
	 * Postcondition: menu is displayed, choices are entered and executed, and
	 * repeated until quit is chosen
	 */
	public void run() {
		System.out.println("Welcome to the Animal Application.");
		int userChoice;
		do {
			this.displayMenu();
			System.out.println("Please choose an option from the above menu and type the number of your choice:");
			userChoice = Integer.parseInt(this.userInput.nextLine());
			this.executeUserChoice(userChoice);
		} while (userChoice != 3);
		System.out.println("Thank you for using the Animal Application.");

	}

	/**
	 * This helper method executes the choice made by the user
	 *
	 * Precondition: userChoice must be an integer between 1-3 (inclusive) or error
	 * message printed to console
	 *
	 * Postcondition: menu choice subroutine is executed based on menu entry
	 */
	private void executeUserChoice(int userChoice) {
		switch (userChoice) {
		case 1:
			this.addAnimal();
			break;
		case 2:
			this.viewAnimals();
			break;
		case 3:
			break;
		default:
			System.out.println("Invalid choice. Please choose from the following options:");
		}
	}

	/**
	 * This method will display the menu of choices for the user
	 *
	 * Precondition: none
	 *
	 * Postcondition: displayed menu to console
	 */
	private void displayMenu() {
		System.out.println("\n\t-------------------------------------");
		System.out.println("\t| 1 - Add an animal to the list     |");
		System.out.println("\t| 2 - Print the animals in the list |");
		System.out.println("\t| 3 - Quit                          |");
		System.out.println("\t-------------------------------------");
	}

	/**
	 * This method will prompt the user to type an animal type and add it to the
	 * list if appropriate. Otherwise it will alert the user that their animal
	 * cannot be added to the list
	 *
	 * Precondition: animal must be of a already defined sub-class of Animal
	 *
	 * Postcondition: if animal is of a subtype already defined it is added to the
	 * list
	 */
	private void addAnimal() {
		String animalName;
		do {
			System.out.print("Please enter the name of the animal: ");
			animalName = this.userInput.nextLine();
		} while (animalName.equals(""));
		if (Animal.getNewAnimal(animalName) != null) {
			this.userAnimals.add(Animal.getNewAnimal(animalName));
		} else {
			System.out.println("This animal type cannot be added to the list.");
		}
	}

	/**
	 * This method will print out a list of animals showing their kind and coverings
	 *
	 * Precondition: none
	 *
	 * Postcondition: printed list of Animals in list and their coverings
	 */
	private void viewAnimals() {
		for (Animal current : this.userAnimals) {
			System.out.println(current.toString());
		}
	}

}
