package com.ebay_puzzle.rockpaperscissor.domain;

import static com.ebay_puzzle.rockpaperscissor.domain.Result.LOSE;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.TIE;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.WIN;
import static org.junit.Assert.*;

import org.junit.Test;

public class RockTest {

	@Test
	public void testRockDefeatsScissor() {
		assertEquals(WIN, Gesture.Rock.defeats(Gesture.Scissor));
	}

	@Test
	public void testRockLosesToPaper() {
		assertEquals(LOSE, Gesture.Rock.defeats(Gesture.Paper));
	}

	@Test
	public void testRockTiesWithRock() {
		assertEquals(TIE, Gesture.Rock.defeats(Gesture.Rock));
	}
}
