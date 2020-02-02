package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.polymorphism.model.Animal;
import edu.westga.cs6312.polymorphism.model.Cat;
import edu.westga.cs6312.polymorphism.model.Cheetah;
import edu.westga.cs6312.polymorphism.model.Parrot;
import edu.westga.cs6312.polymorphism.model.Eagle;

class AnimalWhenGetNewAnimal {

	/**
	 * Test the factory method for creating a Cat object against creating one from
	 * the Cat class constructor
	 * 
	 */
	@Test
	void testGetNewAnimalWhenCat() {
		Cat constructorCreatedCat = new Cat();
		Animal factoryCreatedCat = Animal.getNewAnimal("cat");
		assertEquals(constructorCreatedCat.toString(), factoryCreatedCat.toString());
	}

	/**
	 * Test the factory method for creating a Cheetah object against creating one
	 * from the Cheetah class constructor
	 * 
	 */
	@Test
	void testGetNewAnimalWhenCheetah() {
		Cheetah constructorCreatedCheetah = new Cheetah();
		Animal factoryCreatedCheetah = Animal.getNewAnimal("cheetah");
		assertEquals(constructorCreatedCheetah.toString(), factoryCreatedCheetah.toString());
	}

	/**
	 * Test the factory method for creating a Parrot object against creating one
	 * from the Parrot class constructor
	 * 
	 */
	@Test
	void testGetNewAnimalWhenParrot() {
		Parrot constructorCreatedParrot = new Parrot();
		Animal factoryCreatedParrot = Animal.getNewAnimal("parrot");
		assertEquals(constructorCreatedParrot.toString(), factoryCreatedParrot.toString());
	}

	/**
	 * Test the factory method for creating a Eagle object against creating one from
	 * the Eagle class constructor
	 * 
	 */
	@Test
	void testGetNewAnimalWhenEagle() {
		Eagle constructorCreatedEagle = new Eagle();
		Animal factoryCreatedEagle = Animal.getNewAnimal("eagle");
		assertEquals(constructorCreatedEagle.toString(), factoryCreatedEagle.toString());
	}

}
