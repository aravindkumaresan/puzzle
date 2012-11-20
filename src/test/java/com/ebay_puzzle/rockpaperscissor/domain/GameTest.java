package com.ebay_puzzle.rockpaperscissor.domain;

import static com.ebay_puzzle.rockpaperscissor.domain.Player.PLAYER1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameTest {

	@Test
	public void testRockDefeatsScissor() {
		Game game = new Game();
		game.player1Gesture(Gesture.Rock);
		game.player2Gesture(Gesture.Scissor);
		assertFalse(game.isTie());
		assertEquals(PLAYER1, game.getWinner());

	}

	@Test
	public void testScissordefeatsPaper() {
		Game game = new Game();
		game.player1Gesture(Gesture.Scissor);
		game.player2Gesture(Gesture.Paper);
		assertFalse(game.isTie());
		assertEquals(PLAYER1, game.getWinner());
	}

	@Test
	public void testPaperdefeatsRock() {
		Game game = new Game();
		game.player1Gesture(Gesture.Paper);
		game.player2Gesture(Gesture.Rock);
		assertFalse(game.isTie());
		assertEquals(PLAYER1, game.getWinner());
	}

	@Test
	public void testRockTiesRock() {
		Game game = new Game();
		game.player1Gesture(Gesture.Rock);
		game.player2Gesture(Gesture.Rock);
		assertTrue(game.isTie());
	}

	@Test
	public void testScissorTiesScissor() {
		Game game = new Game();
		game.player1Gesture(Gesture.Scissor);
		game.player2Gesture(Gesture.Scissor);
		assertTrue(game.isTie());
	}

	@Test
	public void testPaperTiesPaper() {
		Game game = new Game();
		game.player1Gesture(Gesture.Paper);
		game.player2Gesture(Gesture.Paper);
		assertTrue(game.isTie());
	}

}
