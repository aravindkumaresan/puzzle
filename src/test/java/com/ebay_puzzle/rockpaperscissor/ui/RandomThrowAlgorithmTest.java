package com.ebay_puzzle.rockpaperscissor.ui;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.ebay_puzzle.rockpaperscissor.domain.Gesture;

public class RandomThrowAlgorithmTest {

	List<Gesture> gestures = Arrays.<Gesture> asList(Gesture.Scissor, Gesture.Rock, Gesture.Paper);

	@Test
	public void shouldHaveChosenAllGestures() {
		Set<Gesture> result = new HashSet<Gesture>();
		for (int i = 0; i < 1000; i++) {
			result.add(new RandomThrowAlgorithm(gestures)._throw());
		}
		assertEquals(3, result.size());
	}

}
