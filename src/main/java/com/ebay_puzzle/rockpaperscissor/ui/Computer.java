package com.ebay_puzzle.rockpaperscissor.ui;

import java.util.List;

import com.ebay_puzzle.rockpaperscissor.domain.Gesture;

public class Computer extends Player {

	private final ThrowAlgorithm throwAlgorithm;
	private final String name;
	
	public Computer(List<Gesture> gestures) {
		this(gestures, "Computer");
	}

	public String toString(){
		return this.name;
	}
	
	public Computer(List<Gesture> gestures, String computerName) {
		this.throwAlgorithm = new RandomThrowAlgorithm(gestures);
		this.name = computerName;
	}

	public Gesture _throw() {
		return throwAlgorithm._throw();
	}

}
