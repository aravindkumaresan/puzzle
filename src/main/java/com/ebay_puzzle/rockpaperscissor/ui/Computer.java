package com.ebay_puzzle.rockpaperscissor.ui;

import java.util.List;

import com.ebay_puzzle.rockpaperscissor.domain.Gesture;
import com.ebay_puzzle.rockpaperscissor.domain.Scissor;

public class Computer extends Player {

	private final List<Gesture> gestures;
	private final ThrowAlgorithm throwAlgorithm;

	public Computer(List<Gesture> gestures) {
		this.gestures = gestures;
		this.throwAlgorithm = new RandomThrowAlgorithm(gestures);
	}

	public String toString(){
		return "Computer";
	}
	
	public Computer(List<Gesture> gestures, ThrowAlgorithm throwAlgorithm) {
		this.gestures = gestures;
		this.throwAlgorithm = throwAlgorithm;
	}

	public Gesture _throw() {
		return throwAlgorithm._throw();
	}

}
