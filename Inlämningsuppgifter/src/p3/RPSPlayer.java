package p3;

import java.util.Random;

public class RPSPlayer {

	public int newChoice() {
		Random rand = new Random();
		return rand.nextInt(3);
	}

}
