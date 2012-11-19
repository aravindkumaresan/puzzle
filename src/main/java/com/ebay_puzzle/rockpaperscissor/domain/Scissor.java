package com.ebay_puzzle.rockpaperscissor.domain;

import static com.ebay_puzzle.rockpaperscissor.domain.Result.WIN;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.LOSE;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.TIE;

public class Scissor implements Gesture {

	public Result defeats(Gesture c) {
		if (c instanceof Rock)
			return LOSE;
		else if (c instanceof Paper)
			return WIN;
		else
			return TIE;
	}
	
	public String toString() {
		return "Scissor";
	}
}
