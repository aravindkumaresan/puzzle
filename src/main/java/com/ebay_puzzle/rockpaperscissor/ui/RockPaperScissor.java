package com.ebay_puzzle.rockpaperscissor.ui;

import static java.lang.Integer.valueOf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.ebay_puzzle.rockpaperscissor.domain.Game;
import com.ebay_puzzle.rockpaperscissor.domain.Gesture;

public class RockPaperScissor {

	private int option;
	private Player player1;
	private Player player2;
	private Gesture player1Gesture;
	private Gesture player2Gesture;

	public static void main(String[] args) throws IOException {
		new RockPaperScissor().game();
	}

	private void game() throws IOException {
		printMenu();
		option = readMenuOption();
		printChosenOption();

		Game game = new Game();
		createPlayers(option, game.getGestures());
		_throw();
		printGesturesChosen();
		game.player1Gesture(player1Gesture);
		game.player2Gesture(player2Gesture);
		if (game.isTie()) {
			System.out.println("Game has tied");
		} else {
			System.out.println(game.getWinner() + " has won");
		}
	}

	private void printGesturesChosen() {
		System.out.println(player1.getName() + " has chosen " + this.player1Gesture);
		System.out.println(player2.getName() + " has chosen " + this.player2Gesture);
	}

	private void printChosenOption() {
		System.out.println("chosen option: " + option);
	}

	private void _throw() {
		this.player1Gesture = player1._throw();
		this.player2Gesture = player2._throw();
	}

	private void createPlayers(int option, List<Gesture> gestures) {
		if (option == 1) {
			this.player1 = new Human(gestures);
			this.player2 = new Computer(gestures);
		} else {
			this.player1 = new Computer(gestures);
			this.player2 = new Computer(gestures);
		}
	}

	private int readMenuOption() throws IOException {
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		String option = bis.readLine();
		return valueOf(option);
	}

	private void printMenu() {
		System.out.println("1. Human vs Computer");
		System.out.println("2. Computer vs Computer");
		System.out.println("3. Different game each time");
		System.out.println("4. Exit");
		System.out.println("Enter your option:");
	}
}
