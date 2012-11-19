package com.ebay_puzzle.rockpaperscissor.domain;

import static com.ebay_puzzle.rockpaperscissor.domain.Result.EQUAL;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.GREATER;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.LESSER;

public class Paper implements Combination{

	public Result beats(Combination c) {

		if (c instanceof Scissor)

			return LESSER;

		else if (c instanceof Rock)

			return GREATER;
		
		else return EQUAL;

	}

	
}
