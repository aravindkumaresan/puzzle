package com.ebay_puzzle.rockpaperscissors.domain;

import static com.ebay_puzzle.rockpaperscissor.domain.Player.PLAYER1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ebay_puzzle.rockpaperscissor.domain.Game;
import com.ebay_puzzle.rockpaperscissor.domain.Paper;
import com.ebay_puzzle.rockpaperscissor.domain.Rock;
import com.ebay_puzzle.rockpaperscissor.domain.Scissor;

public class GameTest {

	@Test
	public void testPlay() {

		Game game = new Game();
		game.player1Gesture(new Rock());
		game.player2Gesture(new Paper());
		if (!game.isTie()) {
			game.getWinner();
		}

	}

	@Test
	public void testRockDefeatsScissor() {

		Game game = new Game();
		game.player1Gesture(new Rock());
		game.player2Gesture(new Scissor());
		assertFalse(game.isTie());
		assertEquals(PLAYER1, game.getWinner());

	}
	
	@Test
	public void testRockTiesRock() {
		
		Game game = new Game();
		game.player1Gesture(new Rock());
		game.player2Gesture(new Rock());
		assertTrue(game.isTie());
	}
	
	
}
