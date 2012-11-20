package com.ebay_puzzle.rockpaperscissor.ui;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ebay_puzzle.rockpaperscissor.domain.Gesture;

public class HumanTest {
	List<Gesture> gestures = Arrays.<Gesture>asList(Gesture.Scissor);

	@Test
	public void shouldChooseScissorGesture() {
		Human human = new Human(gestures, new ByteArrayInputStream("scissor".getBytes()));
		assertEquals(Gesture.Scissor, human._throw());
	}

	
	@Test
	public void shouldAskAgainWhenGestureIsInvalid() {
		String input = "scsor" + System.getProperty("line.separator") + "scissor";
		Human human = new Human(gestures, new ByteArrayInputStream(input.getBytes()));
		assertEquals(Gesture.Scissor, human._throw());
	}
}
