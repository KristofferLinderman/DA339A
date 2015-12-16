package granskning;

/**
SSPPlayer.java

Skapad i syfte för Programmeringsuppgift3
@Author Anton Hellbe
 */

import java.util.Random;

import javax.swing.JLabel;

public class SSPPlayer extends JLabel {
	private Random rnd = new Random();

	public SSPPlayer() {

	}
	/**
	 * metoden newChoice används för att returnera ett val för dator, slumpat mellan 0-2
	 * Kallas på i Controllern varje gång användaren gör ett val
	 */
	public int newChoice() {
		return rnd.nextInt(3);

	}

}
