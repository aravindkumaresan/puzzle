package com.ebay_puzzle.rockpaperscissor.ui;

import static java.util.Collections.shuffle;

import java.util.ArrayList;
import java.util.List;

import com.ebay_puzzle.rockpaperscissor.domain.Gesture;

public class RandomThrowAlgorithm implements ThrowAlgorithm {
	private final List<Gesture> gestures;

	public RandomThrowAlgorithm(List<Gesture> gestures) {
		this.gestures = gestures;
	}

	public Gesture _throw() {
		List<Gesture> gestures = new ArrayList<Gesture>(this.gestures);
		shuffle(gestures);
		return gestures.get(0);
	}
}
