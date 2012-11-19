package com.ebay_puzzle.rockpaperscissor.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.ebay_puzzle.rockpaperscissor.domain.Gesture;

public class Human extends Player {
	private final List<Gesture> gestures;

	public Human(List<Gesture> gestures) {
		this.gestures = gestures;
	}
	
	public String getName(){
		return "Human";
	}

	public Gesture _throw() {
		while (true) {
			BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
			try {
				printGestures();
				String sGesture = bis.readLine();
				Gesture matchedGesture = null;
				for (Gesture gesture : gestures) {
					if (sGesture.equalsIgnoreCase(gesture.toString())) {
						matchedGesture = gesture;
					}
				}
				if (matchedGesture != null)
					return matchedGesture;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void printGestures() {
		System.out.println("");
		System.out.print("Please choose one of the following gestures: ");
		for(Gesture gesture: gestures){
			System.out.print(gesture + " ");
		}
		System.out.println("");
	}
}
