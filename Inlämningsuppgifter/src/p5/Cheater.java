package p5;

import java.util.Random;

/**
 * Cheater is a player that about 50% of the times cheats and rolls +1 higher
 * than normal. This only occurs if the roll didn't yield a max value.
 * 
 * @author Kristoffer
 *
 */
public class Cheater extends Player {
	private Dice dice;
	private Random rand;
	private int cheatChecker;
	private int throwResult;

	/**
	 * Creates a Cheater with a specified name
	 * 
	 * @param name
	 *            name of cheater
	 */
	public Cheater(String name) {
		super(name);
		rand = new Random();
		dice = new SimpleDice(6);

	}

	/**
	 * Creates a Cheater with a specified name and dice
	 * 
	 * @param name
	 *            name of cheater
	 * @param dice
	 *            the cheaters dice
	 */
	public Cheater(String name, Dice dice) {
		super(name);
		this.dice = dice;
		rand = new Random();
	}

	/**
	 * Set a dice to the cheater
	 * 
	 * @param dice
	 *            the dice to be set
	 */
	public void setDice(Dice dice) {
		this.dice = dice;
	}

	/**
	 * Returns the dice of the cheater
	 * 
	 * @return cheaters dice
	 */
	public Dice getDice() {
		return dice;
	}

	@Override
	/**
	 * Throws the dice and will cheat about 50% of the time by adding 1 to the
	 * roll (unless roll = maxvalue)
	 * 
	 * @return number rolled
	 */
	public int throwDice() {
		cheatChecker = rand.nextInt(2);
		throwResult = dice.throwDice();

		// should occur about 50% of the time
		if (cheatChecker == 0) {

			if (throwResult != dice.getSides()) {
				return throwResult + 1;
			} else {
				return throwResult;
			}
		} else {
			return throwResult;
		}
	}

}
