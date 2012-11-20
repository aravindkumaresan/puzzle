package com.ebay_puzzle.rockpaperscissor.domain;

import static com.ebay_puzzle.rockpaperscissor.domain.Result.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PaperTest {

	@Test
	public void testPaperDefeatsRock() {
		assertEquals(WIN, Gesture.Paper.defeats(Gesture.Rock));
	}
	
	@Test
	public void testPaperLosesToScissor() {
		assertEquals(LOSE, Gesture.Paper.defeats(Gesture.Scissor));
	}
	
	@Test
	public void testPaperTiesWithPaper() {
		assertEquals(TIE, Gesture.Paper.defeats(Gesture.Paper));
	}
}
