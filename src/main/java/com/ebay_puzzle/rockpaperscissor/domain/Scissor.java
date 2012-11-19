package com.ebay_puzzle.rockpaperscissor.domain;

import static com.ebay_puzzle.rockpaperscissor.domain.Result.EQUAL;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.GREATER;
import static com.ebay_puzzle.rockpaperscissor.domain.Result.LESSER;

public class Scissor implements Combination {

	public Result beats(Combination c) {

		if (c instanceof Rock)

			return LESSER;

		else if (c instanceof Paper)

			return GREATER;

		else
			return EQUAL;

	}

}
