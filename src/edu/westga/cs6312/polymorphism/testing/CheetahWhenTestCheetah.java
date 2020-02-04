package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.polymorphism.model.Cheetah;

class CheetahWhenTestCheetah {

	/**
	 * Test Cheetah constructor and Animal toString method.  
	 * The following values are expected:
	 * kind = cheetah
	 * covering = hair
	 */
	@Test
	void testCreateNewCheetahExpectKindIsCheetahCoveringIsHair() {
		Cheetah theCheetah = new Cheetah();
		String report = theCheetah.toString();
		assertEquals("Kind: cheetah -- Covering: hair", report);
	}
	
	/**
	 * Test Cheetah getSound method.  
	 * The following values are expected:
	 * Feline chirp
	 */
	@Test
	void testCheetahGetSoundExpectFelineChirp() {
		Cheetah theCheetah = new Cheetah();
		String report = theCheetah.getSound();
		assertEquals("Feline chirp", report);
	}
	
	/**
	 * Test Cheetah getMovement method (FAST).
	 * If moving fast is true, expect "I run on four legs"
	 */
	@Test
	void testCheetahGetMovementWhenFastExpectRunOn4() {
		Cheetah theCheetah = new Cheetah();
		String report = theCheetah.getMovement(true);
		assertEquals("I run on four legs", report);
	}
	
	/**
	 * Test Cheetah getMovement method (SLOW).
	 * If moving fast is false, expect "I walk on four legs"
	 */
	@Test
	void testCheetahGetMovementWhenSlowExpectWalkOn4() {
		Cheetah theCheetah = new Cheetah();
		String report = theCheetah.getMovement(false);
		assertEquals("I walk on four legs", report);
	}

}
