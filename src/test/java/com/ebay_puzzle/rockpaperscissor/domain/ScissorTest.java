package com.ebay_puzzle.rockpaperscissor.domain;

import static com.ebay_puzzle.rockpaperscissor.domain.Result.LOSE;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.TIE;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.WIN;
import static org.junit.Assert.*;

import org.junit.Test;

public class ScissorTest {

	@Test
	public void testScissorDefeatsPaper() {
		assertEquals(WIN, Gesture.Scissor.defeats(Gesture.Paper));
	}

	@Test
	public void testScissorLosesToRock() {
		assertEquals(LOSE, Gesture.Scissor.defeats(Gesture.Rock));
	}

	@Test
	public void testScissorTiesWithScissor() {
		assertEquals(TIE, Gesture.Scissor.defeats(Gesture.Scissor));
	}
}
