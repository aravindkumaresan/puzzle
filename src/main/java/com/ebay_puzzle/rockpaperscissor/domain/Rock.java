package com.ebay_puzzle.rockpaperscissor.domain;

import static com.ebay_puzzle.rockpaperscissor.domain.Result.EQUAL;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.GREATER;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.LESSER;

public class Rock implements Combination {

	public Result beats(Combination c) {

		if (c instanceof Paper)

			return LESSER;

		else if (c instanceof Scissor)

			return GREATER;
		
		else return EQUAL;

	}

}
