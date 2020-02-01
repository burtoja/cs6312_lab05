package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.polymorphism.model.Parrot;

class ParrotWhenTestParrot {

	/**
	 * Test Parrot constructor and Animal toString method.  
	 * The following values are expected:
	 * kind = Parrot
	 * covering = hair
	 */
	@Test
	void testCreateNewParrotExpectKindIsParrotCoveringIsFeathers() {
		Parrot theParrot = new Parrot();
		String report = theParrot.toString();
		assertEquals("Kind: parrot -- Covering: feathers", report);
	}
	
	/**
	 * Test Parrot getSound method.  
	 * The following values are expected:
	 * Polly want a cracker
	 */
	@Test
	void testParrotGetSoundExpectPollyWantACracker() {
		Parrot theParrot = new Parrot();
		String report = theParrot.getSound();
		assertEquals("Polly want a cracker", report);
	}
	
	/**
	 * Test Parrot getMovement method (FAST).
	 * If moving fast is true, expect "I fly"
	 */
	@Test
	void testParrotGetMovementWhenFastExpectFly() {
		Parrot theParrot = new Parrot();
		String report = theParrot.getMovement(true);
		assertEquals("I fly", report);
	}
	
	/**
	 * Test Parrot getMovement method (SLOW).
	 * If moving fast is false, expect "I walk on two legs"
	 */
	@Test
	void testParrotGetMovementWhenSlowExpectWalkOn2() {
		Parrot theParrot = new Parrot();
		String report = theParrot.getMovement(false);
		assertEquals("I walk on two legs", report);
	}

}
