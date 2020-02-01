package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.polymorphism.model.Eagle;

class EagleWhenTestEagle {

	/**
	 * Test Eagle constructor and Animal toString method.  
	 * The following values are expected:
	 * kind = eagle
	 * covering = hair
	 */
	@Test
	void testCreateNewEagleExpectKindIsEagleCoveringIsFeathers() {
		Eagle theEagle = new Eagle();
		String report = theEagle.toString();
		assertEquals("Kind: eagle -- Covering: feathers", report);
	}
	
	/**
	 * Test Eagle getSound method.  
	 * The following value is expected:
	 * screech
	 */
	@Test
	void testEagleGetSoundExpectScreech() {
		Eagle theEagle = new Eagle();
		String report = theEagle.getSound();
		assertEquals("Screech", report);
	}
	
	/**
	 * Test Eagle getMovement method (FAST).
	 * If moving fast is true, expect "I fly"
	 */
	@Test
	void testEagleGetMovementWhenFastExpectFly() {
		Eagle theEagle = new Eagle();
		String report = theEagle.getMovement(true);
		assertEquals("I fly", report);
	}
	
	/**
	 * Test Eagle getMovement method (SLOW).
	 * If moving fast is false, expect "I walk on two legs"
	 */
	@Test
	void testEagleGetMovementWhenSlowExpectWalkOn2() {
		Eagle theEagle = new Eagle();
		String report = theEagle.getMovement(false);
		assertEquals("I walk on two legs", report);
	}
}
