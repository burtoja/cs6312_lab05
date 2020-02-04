package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.polymorphism.model.Cat;

class CatWhenTestCat {

	/**
	 * Test Cat constructor and Animal toString method.  
	 * The following values are expected:
	 * kind = cat
	 * covering = hair
	 */
	@Test
	void testCreateNewCatExpectKindIsCatCoveringIsHair() {
		Cat theCat = new Cat();
		String report = theCat.toString();
		assertEquals("Kind: cat -- Covering: hair", report);
	}
	
	/**
	 * Test Cat getSound method.  
	 * The following values are expected:
	 * Meow
	 */
	@Test
	void testCatGetSoundExpectMeow() {
		Cat theCat = new Cat();
		String report = theCat.getSound();
		assertEquals("Meow", report);
	}
	
	/**
	 * Test Cat getMovement method (FAST).
	 * If moving fast is true, expect "I run on four legs"
	 */
	@Test
	void testCatGetMovementWhenFastExpectRunOn4() {
		Cat theCat = new Cat();
		String report = theCat.getMovement(true);
		assertEquals("I run on four legs", report);
	}
	
	/**
	 * Test Cat getMovement method (SLOW).
	 * If moving fast is false, expect "I walk on four legs"
	 */
	@Test
	void testCatGetMovementWhenSlowExpectWalkOn4() {
		Cat theCat = new Cat();
		String report = theCat.getMovement(false);
		assertEquals("I walk on four legs", report);
	}

}
