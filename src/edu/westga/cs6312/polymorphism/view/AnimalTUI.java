package edu.westga.cs6312.polymorphism.view;

import java.util.ArrayList;
import java.util.Scanner;

import edu.westga.cs6312.polymorphism.model.Animal;

/**
 * This class will serve as the TUI allowing users to create and view new Animal objects
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
	 * Precondition:	none
	 *
	 * Postcondition:
	 */
	public AnimalTUI() {
		this.userInput = new Scanner(System.in);
		this.userAnimals = new ArrayList<Animal>();
	}
	
	/**
	 * This method will serve to run the application
	 *
	 * Precondition:	none
	 *
	 * Postcondition:
	 */
	public void run() {
		System.out.println("Welcome to the Animal Application.");
		int userChoice;
		do {
			this.displayMenu();
			System.out.println("Please choose an option from the above menu and type the number of your choice:");
			userChoice = Integer.parseInt(this.userInput.nextLine());
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
		} while (userChoice != 3);
		System.out.println("Thank you for using the Animal Application.");
		
		
	}
	
	/**
	 * This method will display the menu of choices for the user 
	 *
	 * Precondition:
	 *
	 * Postcondition:
	 */
	private void displayMenu() {
		System.out.println("\n\t-------------------------------------");
		System.out.println("\t| 1 - Add an animal to the list     |");
		System.out.println("\t| 2 - Print the animals in the list |");
		System.out.println("\t| 3 - Quit                          |");	
		System.out.println("\t-------------------------------------");
	}
	
	/**
	 * This method will prompt the user to type an animal type and add it to the list
	 * if appropriate.  Otherwise it will alert the user that their animal cannot
	 * be added to the list 
	 *
	 * Precondition:
	 *
	 * Postcondition:
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
	 * Precondition:
	 *
	 * Postcondition:
	 */
	private void viewAnimals() {
		for (Animal current : this.userAnimals) {
			System.out.println(current.toString());
		}
	}
	
}
