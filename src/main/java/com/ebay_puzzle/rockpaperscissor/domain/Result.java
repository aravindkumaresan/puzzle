package com.ebay_puzzle.rockpaperscissor.domain;

public enum Result {

	GREATER(1), LESSER(-1), EQUAL(0);
	
	private final int value;
	
	Result (int value) {
		
		this.value = value; 
	}
	
}
