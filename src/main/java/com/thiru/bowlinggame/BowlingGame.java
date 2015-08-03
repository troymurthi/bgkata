package com.thiru.bowlinggame;

public class BowlingGame {

	private int score;

	public void roll(int i) {
		if (i > 0 && i < 11) {
			score = score + i;
		}

	}

	public int score() {
		return score;
	}

}
