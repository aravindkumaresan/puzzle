package com.ebay_puzzle.rockpaperscissor.domain;

import static com.ebay_puzzle.rockpaperscissor.domain.Result.LOSE;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.TIE;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.WIN;

public class Rock implements Gesture {

	public Result defeats(Gesture c) {
		if (c instanceof Paper)
			return LOSE;
		else if (c instanceof Scissor)
			return WIN;
		else
			return TIE;
	}

	public String toString() {
		return "Rock";
	}
}
