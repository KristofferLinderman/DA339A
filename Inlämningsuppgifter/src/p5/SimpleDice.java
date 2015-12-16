package p5;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * A simple dice with either 6 or given amount of sides. Must have more than 0
 * sides.
 * 
 * @author Kristoffer
 *
 */
public class SimpleDice implements Dice {
	private int sides;
	private Random rand;

	/**
	 * Creates a dice with 6 sides
	 */
	public SimpleDice() {
		sides = 6;
		rand = new Random();
	}

	/**
	 * Creates a dice with specified number of sides
	 * 
	 * @param sides
	 *            number of sides on dice
	 */
	public SimpleDice(int sides) {
		try {
			if (sides < 1) {
				throw (new NegativeSidesException(
						"Please give a number of sides higher than 0"));
			}
			this.sides = sides;

		} catch (NegativeSidesException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		rand = new Random();

	}

	@Override
	/**
	 * Throws a dice and returns the value
	 * @returns Value of the dice thrown
	 **/
	public int throwDice() {
		return rand.nextInt(sides) + 1;
	}

	@Override
	/**
	 * Returns the number of sides of the dice
	 * @return Number of sides of the dice
	 */
	public int getSides() {
		return sides;
	}

}
